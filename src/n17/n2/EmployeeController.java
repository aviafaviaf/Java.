package n17.n2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }


    public void calculateSalary(double money, int month) {
        model.setSalary(money / month);
    }

    public void updateView() {
        view.print(model.getName(), model.getSalary());
    }
}
