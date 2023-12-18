package n11;

import java.util.Date;
public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private String group;
    private int gpa;
    private Date birthDay;

    public Student(int id, String name, String surname, int course, String group, int gpa, Date birthDay) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String toString(TimeType timeType) {
        return "Студент:" + "id " + id + ", имя " + name + "," + ", gpa: " + gpa;
    }


}
