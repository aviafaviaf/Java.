package n17.n2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Vlad");
        employee.setSalary(80000.902);

        EmployeeController controller = new EmployeeController(employee, new EmployeeView());

        controller.updateView();
        System.out.println();

        controller.calculateSalary(1000000.80, 12);

        controller.updateView();
    }
}
