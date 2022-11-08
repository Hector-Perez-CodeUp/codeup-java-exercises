import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String args[])
    {
        // Print PI TO 2 Decimal Places
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        // Prompt User for Integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:  ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        scanner.nextLine();

        // Three Words
        System.out.println("Enter three words:  ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord);
        scanner.nextLine();

        // Sentence
        System.out.println("Enter a sentence:  ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        // Area Calculator
        System.out.println("Enter your classroom's length & width & height:  ");
        float length = scanner.nextInt();
        float width = scanner.nextInt();
        float height = scanner.nextInt();
        float area = length * width;
        System.out.println("Your area is: " + area);
        scanner.nextLine();

        // Perimeter Calculator
        float perimeter = (length + width) * 2;
        System.out.println("Your perimeter is " + perimeter);

        // Volume Calculator
        float volume = length * width * height;
        System.out.println("Your volume is " + volume);
    }
}
