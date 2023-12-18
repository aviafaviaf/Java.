package n2.n10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Введите слова");
        s = in.nextLine();
        System.out.println(s.split(" ").length);
    }
}
