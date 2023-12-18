package n8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("от: ");
        a = scanner.nextInt();
        System.out.print("до: ");
        b = scanner.nextInt();
        print(a, b);

        System.out.print("количество цифр: ");
        a = scanner.nextInt();
        System.out.print("Сумма: ");
        b = scanner.nextInt();
        System.out.println(numbers((int) Math.pow(10, a - 1), b, a) + " чисел");

        System.out.print("число: ");
        a = scanner.nextInt();
        System.out.println("Сумма цифр: " + sum(a));

        System.out.print("Число: ");
        a = scanner.nextInt();
        if (isPrime(a, a - 1)) System.out.println("Простое число");
        else System.out.println("Число не простое");

    }

    private static void print(int a, int b) {
        System.out.println(a);
        if (a < b)
            print(a + 1, b);
        else if (a > b)
            print(a - 1, b);
    }

    private static int numbers(int k, int d, int size) {
        if (k == Math.pow(10, size)) return 0;
        if (sum(k) == d) return 1 + numbers(k + 1, d, size);
        return numbers(k + 1, d, size);
    }


    private static boolean isPrime(int x, int del) {
        if (del <= 1) return true;
        else if (x % del == 0) return false;
        return isPrime(x, del - 1);
    }
    private static int sum(int x) {
        if (x == 0) return 0;
        return x % 10 + sum(x / 10);

    }
}

