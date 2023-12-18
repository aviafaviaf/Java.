package n13.n1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.next();
        System.out.println();
        System.out.println("Последний символ: " + string.charAt(string.length() - 1));
        System.out.println("Строка оканчивается подстрокой !!!: " + string.endsWith("!!!"));
        System.out.println("Строка начинается с I like: " + string.startsWith("I like"));
        System.out.println("Содержит ли строка Java: " + string.contains("Java"));
        System.out.println("Позиция подстроки Java: " + string.indexOf("Java"));
        System.out.println("Замена всех а на о: " + string.replaceAll("a", "o"));
        System.out.println("Строка в верхнем регистре: " + string.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + string.toLowerCase());
    }
}
