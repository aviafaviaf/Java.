package n10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.getGpa() - o1.getGpa();
    }
}
