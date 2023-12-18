package n2.n8;

import java.util.Scanner;



public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = in.nextInt();
        String s;
        String[] arr = new String[n];
        System.out.println("Введите " + n + " строк");
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            s = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = s;
        }
        System.out.println("Массив в обратном порядке: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
