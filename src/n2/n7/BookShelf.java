package n2.n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<Book>();
    private int n;
    public BookShelf() {
        System.out.println("Введите количество книг на полке");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите автора книги, название книги и год издания");
            books.add(new Book(in.next(), in.next(), in.nextInt()));
        }
    }
    public Book getMin() {
        int year = Integer.MAX_VALUE;
        Book result = null;
        for (int i = 0; i < n; i++) {
            if (books.get(i).getYear() < year) {
                year = books.get(i).getYear();
                result = books.get(i);
            }
        }
        return result;
    }
    public Book getMax() {
        int year = Integer.MIN_VALUE;
        Book result = null;
        for (int i = 0; i < n; i++) {
            if (books.get(i).getYear() > year) {
                year = books.get(i).getYear();
                result = books.get(i);
            }
        }
        return result;
    }
    public void sort() {
        Collections.sort(books);
    }
}
