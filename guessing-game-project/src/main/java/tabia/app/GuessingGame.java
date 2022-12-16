package tabia.app;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static boolean guessNumber(Player player, int rand){
        Scanner input = new Scanner(System.in);
        int tries = 5;
        String cond;

        while (tries != 0){
            System.out.println("\nYou still have "+tries+" tries.");
            player.setPlayerNumber();
            int number = player.getPlayerNumber();
            if (number == rand){
                System.out.println("Congratulations! You guessed the number");
                break;
            }
            else if (number < rand) {
                System.out.println("The number is greater than this.");
                tries--;
            }
            else if (number > rand) {
                System.out.println("The number is lesser than this.");
                tries--;
            }
        }
        if (tries==0){
            System.out.println("You've lost the game :( the number was "+ rand);
        }
        System.out.print("Want to try again? Yes(y) or No(n): ");

        while(true){
            cond = input.nextLine();
            if (cond.equalsIgnoreCase("y") ||
                    cond.equalsIgnoreCase("yes")) {
                return true;
            }
            else if (cond.equalsIgnoreCase("n") ||
                    cond.equalsIgnoreCase("no")) {
                return false;
            }
            System.out.println("Not a valid input.");
        }
    }
}
