package n1;

import n1.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        n6();
    }
    public static void n3() {
        Scanner in = new Scanner(System.in);
        int l;
        System.out.println("Введите длину массива: ");
        l = in.nextInt();
        int[] a = new int[l];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        System.out.println("Сумма: " + s + " Среднее арифметическое: " + (float) s / a.length);
    }
    public static void n4() {
        Scanner in = new Scanner(System.in);
        int l;
        System.out.println("Введите длину массива: ");
        l = in.nextInt();
        int[] a = new int[l];
        int i = 0;
        System.out.println("Введите элементы массива: ");
        while (i < a.length) {
            a[i] = in.nextInt();
            i++;
        }
        int s = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        i = 0;
        while (i < a.length) {
            s += a[i];
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
            i++;
        }
        System.out.println("Сумма: " + s + "\nМаксимальный элемент: " + max + "\nМинимальный элемент: " + min);
    }

    public static void n5(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
    public static void n6() {
        float s = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println((float) 1 / i);
        }

    }

    public static void n7() {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        x = in.nextInt();
        System.out.println("Факториал: " + Factorial.factorial(x));
    }
}