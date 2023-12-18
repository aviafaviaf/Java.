package n9.n1;


public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(234, "Vlad", 86),
                new Student(2, "Ilya", 35),
                new Student(100, "Andrey", 20),
                new Student(24, "Ivan", 40),
                new Student(25, "Kirill", 15)
        };
        sort(students);
        printStudents(students);
    }

    private static void sort(Student[] students) {
        Student value;
        for (int left = 0; left < students.length; left++) {
            value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.id < students[i].id) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) System.out.println(student);
    }
}
