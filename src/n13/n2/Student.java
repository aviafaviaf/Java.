package n13.n2;

public class Student {
    private String name;
    private String surname;
    private String fatherName;

    public Student(String surname, String name, String fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
    }

    public Student(String surname) {
        this.surname = surname;
    }

    private String getName() {
        if (name != null) {
            return name + " ";
        }
        else {
            return "";
        }
    }
    private String getFatherName() {
        if (fatherName != null) return fatherName;
        else return "";
    }

    public String toString() {
        return "Студент: " + surname + " " + getName() + getFatherName();
    }
}
