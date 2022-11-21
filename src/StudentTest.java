

public class StudentTest {
    public static void main(String[] args) {
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
    }
}
