import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // 1.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person jim = new Person("Jim");
        Person pam = new Person("Pam");
        Person dwight = new Person("Dwight");

        Person[] employees = {jim, pam, dwight};
        Person[] updatedEmployees = addPerson(employees, new Person("Creed"));

        for (Person employee : updatedEmployees) {
            System.out.println(employee.getName());
        }
    }

    public static Person[] addPerson(Person[] oldArray, Person newPerson) {
        Person[] newArray = Arrays.copyOf(oldArray, oldArray.length+1);
        newArray[oldArray.length] = newPerson;
        return newArray;
    }
}
