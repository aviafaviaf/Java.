package n3.n4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = -1;
        Scanner in = new Scanner(System.in);
        while (n <= 0) {
            System.out.println("Введите длину массива");
            n = in.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt(0, n + 1));
        }
        System.out.println(arr.toString());
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) % 2 == 0) {
                arr2.add(arr.get(i));
            };
        }
        System.out.println("Массив из чётных чисел: " + arr2);
    }


}
