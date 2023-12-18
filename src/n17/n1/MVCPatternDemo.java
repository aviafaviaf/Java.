package n17.n1;

public class MVCPatternDemo {
    public static void main(String[] args) {

        StudentController controller = new StudentController(retriveStudentFromDatabase(), new StudentView());

        controller.updateView();
        System.out.println();

            controller.setStudentName("Vlad");
        controller.setStudentRollNo("JNMHKVBUK555");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setRollNo("HBUJL67");
        student.setName("Vladislav");
        return student;
    }
}
