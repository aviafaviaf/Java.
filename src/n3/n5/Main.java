package n3.n5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Александр", 50000),
                new Employee("Илья", 65000),
                new Employee("Павел", 27000),
                new Employee("Владислав", 40000),
                new Employee("Иван", 100000)
        };
        Report.generateReport(employees);
    }
}
