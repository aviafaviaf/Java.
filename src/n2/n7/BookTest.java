package n2.n7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора книги, название книги и год издания");
        Book book = new Book(in.next(), in.next(), in.nextInt());
        System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        System.out.println("Введите автора книги, название книги и год издания");
        book.setAuthor(in.next());
        book.setName(in.next());
        book.setYear(in.nextInt());
        System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
    }
}
