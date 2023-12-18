package n7.n78;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
            new Book("aviaf"),
            new Book("aviaf"),
            new Magazine("aviaf"),
            new Book("aviaf"),
            new Book("aviaf"),
            new Magazine("aviaf"),
            new Magazine("aviaf"),
            new Magazine("aviaf"),
            new Book("aviaf"),
        };
        Printable.printMagazines(printables);
        System.out.println();
        Printable.printBooks(printables);
    }
}
