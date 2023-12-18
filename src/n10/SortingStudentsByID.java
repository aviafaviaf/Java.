package n10;

import java.util.Comparator;

public class SortingStudentsByID implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
