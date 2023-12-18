package n9.n2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(new Student[]{
                new Student(234, "Vlad", 86),
                new Student(2, "Ilya", 35),
                new Student(100, "Andrey", 20),
                new Student(24, "Ivan", 40),
                new Student(25, "Kirill", 15)
        }));

        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        for (Student student : students) System.out.println(student);
    }
}
