package n3.n3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 4; i ++) {
            arr.add(random.nextInt(10, 100));
        }
        System.out.println("Массив: " + arr);
        for (int i = 0; i < 3; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                System.out.println("Массив не является строго возрастающей последовательностью");
                return;
            }
        }
        System.out.println("Массив является строго возрастающей последовательностью");
    }
}
