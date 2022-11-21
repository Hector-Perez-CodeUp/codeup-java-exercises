import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<Integer>();
    }

    // Student Name Getter
    public String getName() {
        return this.name;
    }

    // Grades Getter
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // Add Grade
    public void addGrade(int newGrade) {
        grades.add(newGrade);
    }

    // Grade Avg Calc
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        double avg = total / grades.size();
        return avg;
    }
}
