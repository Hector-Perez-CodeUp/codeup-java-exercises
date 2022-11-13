public class MethodsExercises {
    public static void main (String[] args) {

        addition(6, 3);
        subtraction(6, 3);
        multiplication(6, 3);
        division(6, 3);
        modulus(6, 3);
    }

    public static void addition(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }

    public static void subtraction(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    public static void multiplication(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    public static void division(int num1, int num2) {
        System.out.println("Division: " + (num1 / num2));
    }

    public static void modulus(int num1, int num2) {
        System.out.println("Modulus: " + (num1 % num2));
    }
}
