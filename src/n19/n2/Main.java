package n19.n2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Comparator<Student> sortingStudentsByGpa = new SortingStudentsByGPA();

        List<Student> students = setArray();
        System.out.println("""
                Выберите действие:
                0 - выход;
                1 - показать список команд;
                2 - показать текущий список;
                3 - добавить;
                4 - отсортировать по среднему баллу;
                5 - найти студента по ФИ.
                """);

        int enter;
        String name;
        boolean find;
        while (true) {
            System.out.print("Введите номер команды: ");
            enter = scanner.nextInt();

            switch (enter) {
                case 0:
                    return;
                case 1:
                    System.out.println("""
                            Выберите действие:
                            0 - выход;
                            1 - показать список команд;
                            2 - показать текущий список;
                            3 - добавить;
                            4 - отсортировать по среднему баллу;
                            5 - найти студента по ФИ.""");
                    break;
                case 2:
                    outArray(students);
                    break;
                case 3:
                    Student student = new Student();
                    System.out.print("id: ");
                    student.setId(scanner.nextInt());
                    System.out.print("name: ");
                    student.setName(scanner.next());
                    System.out.print("surname: ");
                    student.setSurname(scanner.next());
                    System.out.print("course: ");
                    student.setCourse(scanner.nextInt());
                    System.out.print("group: ");
                    student.setGroup(scanner.next());
                    System.out.print("GPA: ");
                    student.setGpa(scanner.nextInt());
                    students.add(student);
                    break;
                case 4:
                    students.sort(sortingStudentsByGpa);
                    outArray(students);
                    break;
                case 5:
                    System.out.print("Введите имя:");
                    name = scanner.next();
                    find = false;
                    for (Student student1 : students) {
                        if (student1.getName().equals(name)) {
                            System.out.println(student1);
                            find = true;
                        }
                    }
                    if (!find) throw new StudentNotFoundException("Студент с именем '" + name + "' не найден");
                    break;
                default:
                    System.out.println("Попробуйте снова");
            }
            System.out.println();
        }
    }

    // создание массива
    static private List<Student> setArray() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(66, "Alex", "Grib", 2, "ИКБО-16-22", 100));
        students.add(new Student(77, "A", "G", 2, "И", 1));
        students.add(new Student(64, "Ilya", "Podokolozin", 1, "ИКБО-03-22", 99));
        students.add(new Student(61, "NoName", "NoSurName", 4, "ИКБО-NO-20", 10));
        students.add(new Student(1, "Vlad", "Baby", 2, "ИКБО-16-22", 88));
        return students;
    }

    // вывод массива
    static private void outArray(List<Student> students) {
        for (Student student : students) System.out.println(student);
    }
}

