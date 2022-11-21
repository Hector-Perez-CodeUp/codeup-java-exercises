import java.util.HashMap;
import java.util.Scanner;



public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create Students & Grades
        Student lunaObj = new Student("Luna");
        lunaObj.addGrade(4);
        lunaObj.addGrade(6);
        lunaObj.addGrade(7);
        Student sokkaObj = new Student("Sokka");
        sokkaObj.addGrade(4);
        sokkaObj.addGrade(4);
        sokkaObj.addGrade(3);
        Student lokiObj = new Student("Loki");
        lokiObj.addGrade(8);
        lokiObj.addGrade(9);
        lokiObj.addGrade(9);
        Student maggieObj = new Student("Maggie");
        maggieObj.addGrade(8);
        maggieObj.addGrade(8);
        maggieObj.addGrade(8);
        Student sylvieObj = new Student("Sylvie");
        sylvieObj.addGrade(1);
        sylvieObj.addGrade(3);
        sylvieObj.addGrade(2);

        // Add Usernames & Student Objs to HashMap
        students.put("looneyluna", lunaObj);
        students.put("soggysokka", sokkaObj);
        students.put("low_key", lokiObj);
        students.put("yourhighnessmaggs", maggieObj);
        students.put("thedum1", sylvieObj);

        // Print Usernames
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String i : students.keySet()) {
            System.out.print("|" + i + "| ");
        }
        System.out.println();

        // Search Students
        Scanner myScanner = new Scanner(System.in);
        String keepSearching;
        do {
            System.out.println("What student would you like to see more information on?");
            String searchedName = myScanner.nextLine();
            if (students.containsKey(searchedName)) {
                System.out.println("Name: " + students.get(searchedName).getName() + " - GitHub Username: " + searchedName);
                System.out.println("Current Average: " + students.get(searchedName).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + searchedName);
            }

            // Continue?
            System.out.println("Would you like to see another student? [y/n]");
            keepSearching = myScanner.nextLine();
        } while (keepSearching.equalsIgnoreCase("y"));
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
