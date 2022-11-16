package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input(new Scanner(System.in));
        int userRadius = userInput.getInt();

        Circle userCircle = new Circle(3.14);
        userCircle.setRadius(userRadius);
        System.out.println(userCircle.getRadius());
        System.out.println(userCircle.getCircumference());
        System.out.println(userCircle.getArea());

    }
}
