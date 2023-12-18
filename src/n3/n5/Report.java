package n3.n5;

public class Report {
    public static void generateReport(Employee[] employees) {

        System.out.println("Список сотрудников:");

        // вывод информации о сотрудниках
        for (Employee employee : employees) {
            System.out.printf("%-20s", employee.getFullName());
            System.out.printf("%10.2f\n", employee.getSalary());
        }

    }
}
