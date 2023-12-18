package n2.n1;

import n2.n1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.println("Введите name:");
        name = in.nextLine();
        System.out.println("Введите email:");
        email = in.nextLine();
        System.out.println("Введите gender: ");
        gender = in.nextLine().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println(author.toString());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println("Введите новый email:");
        email = in.nextLine();
        author.setEmail(email);
        System.out.println(author.getEmail());
    }
}
