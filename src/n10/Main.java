package n10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("До:");
        List<Student> students = setArray();
        outArray(students);
        System.out.println();

        System.out.println("По GPA:");
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        outArray(students);
        System.out.println();

        System.out.println("По ID:");
        students = setArray();
        Comparator<Student> sortingStudentsById = new SortingStudentsByID();
        students.sort(sortingStudentsById);
        outArray(students);
    }

    static private List<Student> setArray() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(34, "Andrey", "Fursin", 2, "ИКБО-16-22", 89));
        students.add(new Student(57, "Aviaf", "afaf", 2, "И", 1));
        students.add(new Student(345, "Ilya", "Ilya", 4, "ИКБО-03-22", 70));
        students.add(new Student(98, "Vlad", "Kulikov", 2, "ИКБО-16-22", 60));
        return students;
    }

    static private void outArray(List<Student> students) {
        for (Student student : students) System.out.println(student);
    }
}
