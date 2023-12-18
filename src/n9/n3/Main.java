package n9.n3;


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

        List<Student> students1 = new ArrayList<>(List.of(new Student[]{
                new Student(234, "Vlad", 86),
                new Student(2, "Ilya", 35),
                new Student(100, "Andrey", 20),
                new Student(24, "Ivan", 40),
                new Student(25, "Kirill", 15)
        }));

        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        students1.sort(sortingStudentsByGPA);


        System.out.println("До слияния:");
        for (Student student : students) System.out.println(student);
        System.out.println();
        for (Student student : students1) System.out.println(student);
        System.out.println();

        Student[] a = new Student[0];
        Student[] b = new Student[0];

        Student[] students2 = mergeArray(students.toArray(a), students1.toArray(b));
        System.out.println("После слияния:");
        for (Student student : students2) System.out.println(student);
    }

    private static Student[] mergeArray(Student[] arrayA, Student[] arrayB) {

       Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            } else if (arrayA[i - positionA].gpa < arrayB[i - positionB].gpa) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }
}
