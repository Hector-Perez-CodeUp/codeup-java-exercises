import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String args[])
    {
        // Print PI TO 2 Decimal Places
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        // Prompt User for Integer
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Enter an integer:  ");
        int userInput = scannerInt.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        // Three Words
        Scanner scannerWords = new Scanner(System.in);
        System.out.println("Enter three words:  ");
        String firstWord = scannerWords.next();
        String secondWord = scannerWords.next();
        String thirdWord = scannerWords.next();
        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord);
//
        // Sentence
        System.out.println("Enter a sentence:  ");
        Scanner scannerSentence = new Scanner(System.in);
        String sentence = scannerSentence.nextLine();
        System.out.println(sentence);

        // Area Calculator
        Scanner lengthWidthHeightScanner = new Scanner(System.in).useDelimiter("\\s");
        System.out.println("Enter your classroom's length & width & height:  ");
        float length = lengthWidthHeightScanner.nextInt();
        float width = lengthWidthHeightScanner.nextInt();
        float height = lengthWidthHeightScanner.nextInt();
        float area = length * width;
        System.out.println("Your area is: " + area);

        // Perimeter Calculator
        float perimeter = area * 2;
        System.out.println("Your perimeter is " + perimeter);

        // Volume Calculator
        float volume = length * width * height;
        System.out.println("Your volume is " + volume);



//        System.out.println(lengthAndWidth);
//        int length = Integer.parseInt(lengthAndWidth);

    }
}
