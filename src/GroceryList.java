import util.Input;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Input input = new Input(new Scanner(System.in));
        HashMap<String, String> listItems = new HashMap<>();

        System.out.println("Would you like to create a grocery list?");
        String makeList = myScanner.nextLine();
        // Make New List?
        if (makeList.equalsIgnoreCase("y")) {
            System.out.println("Would you like to enter a new item?");
            String addNewItem = myScanner.nextLine();
            // Make New Item?
            if (addNewItem.equalsIgnoreCase("y")) {
                // Category
                System.out.println("Choose a category");
                System.out.println("Beverages | Bread | Canned | Dairy | Meat | Produce | Other");
                String category = input.getString();
                System.out.println(category);

                // Name
                System.out.println("Enter the name of the food");
                String foodName = input.getString();
                System.out.println(foodName);

                // Number
                System.out.println("Enter number of items");
                int numOfFood = input.getInt();
                System.out.println(numOfFood);

                // Finalize
                System.out.println("Would you like to finalize this list? [Y: Finalize | N: Add Item]");
                String finalize = input.getString();
                if (finalize.equalsIgnoreCase("y")) {

                }
            }
        } else {
            System.out.println("Okay, goodbye");
        }
    }
}
