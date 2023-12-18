package n9.n4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(22, "Vlad", 100);
        Student student1 = new Student(22, "Andrey", 90);

        if (student.compareTo(student1) > 0)
            System.out.println(student + " лучше");
        else if (student.compareTo(student1) < 0)
            System.out.println(student1 + " лучше");
        else
            System.out.println(student + " равен " + student1);

    }
}
