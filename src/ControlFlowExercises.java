import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String args[])
    {
//        // a
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        // b
//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
//
//        // c
//        for(long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }
//
//        // 2.
//        for(int i = 1; i <=100; i++) {
//            if (i % 3 == 0 && i % 5 == 0 ) {
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 5== 0) {
//                System.out.println("Buzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?  ");
        int userNum = scanner.nextInt();

        System.out.println("number | squared  | cubed");
        System.out.println("------ | -------- | -----");

        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + "\t   |  " + i*i + "\t  |  " + i*i*i);
    }

        // 4.
        boolean anotherGrade = true;
        while (anotherGrade) {
            System.out.println("Enter a numerical grade from 0 to 100  ");
            int numGrade = scanner.nextInt();
            scanner.nextLine();

            if (numGrade > 88) {
                System.out.println("A");
            } else if (numGrade >= 80 && numGrade <= 87) {
                System.out.println("B");
            } else if (numGrade >= 67 && numGrade <= 79) {
                System.out.println("C");
            } else if (numGrade >= 60 && numGrade <= 66) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you have another grade to submit? [y / n]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                anotherGrade = true;
            } else {
                System.out.println("Goodbye");
                anotherGrade = false;
            }
        }


//
    }
}
