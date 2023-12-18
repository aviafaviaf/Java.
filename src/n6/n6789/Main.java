package n6.n6789;


public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book(),
                new Shop(),
                new Shop(),
                new Book()
        };
        for (Printable printable : printables)
            printable.print();
    }
}
