package n7.n56;

public class ProcessStrings implements StringWork {
    private String string;
    public ProcessStrings(String string) {
        this.string = string;
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    public int length() {
        return StringWork.length(string);
    }
    public String onPositions() {
        return StringWork.onPositions(string);
    }
    public String reverse() {
        return StringWork.reverse(string);
    }
}
