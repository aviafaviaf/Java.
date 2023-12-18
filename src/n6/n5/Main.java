package n6.n5;


public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        new Printer(myStringBuilder);
        new GoodPrinter(myStringBuilder);

        myStringBuilder.append("aviafaviaf");
        myStringBuilder.delete(2, 5);
        myStringBuilder.append("ddd");

    }
}
