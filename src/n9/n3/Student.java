package n9.n3;

public class Student {
    public int id;
    public String name;
    public int gpa;

    public Student(int id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Студент:" + "id " + id + ", имя " + name + "," + ", gpa: " + gpa;
    }
}
