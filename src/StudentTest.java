

public class StudentTest {
    public static void main(String[] args) {
        Student lunaObj = new Student("Luna");
        System.out.println(lunaObj.getName());
        lunaObj.addGrade(7);
        System.out.println(lunaObj.getGrades());
        lunaObj.addGrade(6);
        lunaObj.addGrade(7);
        lunaObj.addGrade(6);
        System.out.println(lunaObj.getGradeAverage());
    }
}
