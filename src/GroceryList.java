import util.Input;
import java.util.ArrayList;
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
                ArrayList<String> categories = new ArrayList<>();
                categories.add("Beverages");
                categories.add("Bread");
                categories.add("Canned");
                categories.add("Dairy");
                categories.add("Meat");
                categories.add("Produce");
                categories.add("Other");

                ArrayList<HashMap> categoryItems = new ArrayList<>();
                HashMap<String, Integer> item = new HashMap<>();

                // Category
                System.out.println("Choose a category");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println(categories.get(i));
                }
                String userCategory = input.getString();
                System.out.println("You chose " + userCategory);
                if (userCategory.equalsIgnoreCase("Beverages")) {

                } else if (userCategory.equalsIgnoreCase("Bread")) {

                } else if (userCategory.equalsIgnoreCase("Canned")) {

                } else if (userCategory.equalsIgnoreCase("Dairy")) {

                } else if (userCategory.equalsIgnoreCase("Meat")) {

                } else if (userCategory.equalsIgnoreCase("Produce")) {

                } else if (userCategory.equalsIgnoreCase("Other")) {

                } else {
                    System.out.println("Please enter one of the category options");
                }

                // Name
                System.out.println("Enter the name of the food");
                String foodName = input.getString();
                System.out.println("You typed in " + foodName);

                // Number
                System.out.println("Enter number of items");
                int numOfFood = input.getInt();
                System.out.println("You entered " + numOfFood);

                item.put(foodName, numOfFood);
                categoryItems.add(item);

                // Finalize
                System.out.println("Would you like to finalize this list? [Y: Finalize | N: Add Item]");
                String finalize = input.getString();
                if (finalize.equalsIgnoreCase("y")) {
                    System.out.println(categoryItems.get(0));
                }
            }
        } else {
            System.out.println("Okay, goodbye");
        }
    }
}
