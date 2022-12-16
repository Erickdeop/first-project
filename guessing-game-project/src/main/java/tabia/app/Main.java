package tabia.app;

import java.util.Random;

public class Main {
    public static void main( String[] args ) {

        System.out.println("Welcome to the guessing game!\n\n");
        Player player = new Player("defaultName");
        // Get random number
        Random random = new Random();

        // Instantiate the game class
        GuessingGame guessingGame = new GuessingGame();
        boolean gameOn = true;

        // Continue playing
        while (gameOn) {
            int rand = random.nextInt(100);
            gameOn = guessingGame.guessNumber(player,rand);
        }
    }
}
