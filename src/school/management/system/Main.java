package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student patrick = new Student(1, "Patrick", 12);
        Student robert = new Student(2, "Robert", 12);
        Student kevin = new Student(3, "Kevin", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(patrick);
        studentList.add(robert);
        studentList.add(kevin);

        School ghs = new School(teacherList, studentList);

        patrick.payFees(5000);
        System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());
        robert.payFees(6000);
        System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());
    }
}
