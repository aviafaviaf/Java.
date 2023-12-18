package n6.n12;

import java.util.ArrayList;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private final ArrayList<String> previous;


    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
        previous = new ArrayList<>();
    }
    public void append(String str) {
        previous.add(stringBuilder.toString());
        stringBuilder.append(str);
    }

    public void delete(int start, int end) {
        previous.add(stringBuilder.toString());
        stringBuilder.delete(start, end);
    }

    public void undo() {
        if (!previous.isEmpty())
            stringBuilder = new StringBuilder(previous.remove(previous.size() - 1));
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}