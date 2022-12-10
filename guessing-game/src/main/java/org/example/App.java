package org.example;


import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        System.out.println("Welcome to the guessing game!\n\n");
        // Get random number
        Random random = new Random();
        boolean gameOn = true;

        while (gameOn) {
            int rand = random.nextInt(100);
            gameOn = guessNumber(rand);
        }
    }
    public static int personNumber(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean cond = true;
        while (cond){
            System.out.print("Choose an integer number between 1 and 100: ");
            // Verify if input value is int
            String value = input.nextLine();
            if (isNumeric(value) == true){
                // Verify if the value is greater than 0 and lesser or equal to 100
                int valueInt = Integer.parseInt(value);

                if (valueInt > 0 && valueInt <= 100){
                    number = valueInt;
                    cond=false;
                }
                else{
                    System.out.println("Choose a valid number.\n");
                }
            }
            else{
                System.out.println("Enter an int number.\n");
            }
        }
        return number;
    }

    public static boolean isNumeric(String string){
        int intValue;

        if (string == null || string.equals("")){
            return false;
        };
        try {
            intValue = Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException e){
            System.out.print("Input is not a number. ");
        }
        return false;
    }
    public static boolean guessNumber(int rand){
        Scanner input = new Scanner(System.in);
        int tries = 5;
        String cond;

        while (tries != 0){
            System.out.println("\nYou still have "+tries+" tries.");
            int number = personNumber();
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
        }
    }
}
