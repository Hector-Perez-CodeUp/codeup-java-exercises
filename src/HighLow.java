import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        System.out.println("Welcome to the HighLow Game!\nYou have 3 tries to guess the randomly generated number.");
        int randomNum = ((int)Math.floor(Math.random()*(100-1+1)+1));
        int guessCount = 0;

        while (guessCount < 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess a number between 1 - 100:  ");
            int userGuess = sc.nextInt();

            if (guessCount == 0) {
                System.out.println("Sorry, the random number was " + randomNum);
            } else if (userGuess < randomNum) {
                System.out.println("HIGHER");
                guessCount += 1;
                System.out.println("You have " + (3 - guessCount) + " guesses left.");
            } else if (userGuess > randomNum) {
                System.out.println("LOWER");
                guessCount += 1;
            } else {
                System.out.println("GOOD GUESS!");
            }
        }
    }
}
