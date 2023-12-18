package n6.n12;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        myStringBuilder.append("aviaf");
        System.out.println(myStringBuilder);

        myStringBuilder.append("afaf");
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        System.out.println(myStringBuilder);

        myStringBuilder.delete(2, 4);
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        System.out.println(myStringBuilder);

    }
}
