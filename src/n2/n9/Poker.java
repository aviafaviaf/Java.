package n2.n9;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] m = {"пики", "крести", "черви", "буби"};
        String[] c = {"6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};
        ArrayList<String> cards = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                cards.add(c[j] + " " + m[i]);
            }
        }
        Collections.shuffle(cards);
        Scanner in = new Scanner(System.in);
        int n = 8;
        while (n > 7) {
            System.out.printf("Введите количество игроков: ");
            n = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Карты " + (i + 1) + " игрока:");
            for (int j = 0; j < 5; j++) {
                System.out.println(cards.get(i * 5 + j) + ", ");
            }
            System.out.println();
        }
    }

}
