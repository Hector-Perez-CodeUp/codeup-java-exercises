import java.util.Scanner;

public class Bob {
    public static void main(String args[])
    {
        boolean conversate = true;
        while (conversate) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string");
            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if(userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Continue to convesate? [y/n]");
            String continueConvo = scanner.nextLine();
            if (continueConvo.equalsIgnoreCase("y")) {
                conversate = true;
            } else {
                System.out.println("I said good day sir!");
                conversate = false;
            }
        }
    }
}
