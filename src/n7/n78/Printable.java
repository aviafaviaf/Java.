package n7.n78;

public interface Printable {
    void print();

    static void printMagazines(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Magazine)
                printable.print();
    }

    static void printBooks(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Book)
                printable.print();
    }
}
