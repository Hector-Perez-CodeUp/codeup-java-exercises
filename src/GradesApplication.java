import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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

        students.put("looneyluna", lunaObj);
        students.put("soggysokka", sokkaObj);
        students.put("low_key", lokiObj);
        students.put("yourhighnessmaggs", maggieObj);
        students.put("thedum1", sylvieObj);
        System.out.println(students);
    }
}
