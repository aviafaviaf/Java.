
package n3.n1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Main {
        public Main() {
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите длину массива");
            int n = in.nextInt();
            double[] a = new double[n];

            int i;
            for(i = 0; i < n; ++i) {
                a[i] = Math.random();
            }

            System.out.print("Сгенерированный массив: ");

            for(i = 0; i < n; ++i) {
                System.out.print(a[i] + ", ");
            }

            System.out.println();
            Arrays.sort(a);
            System.out.print("Отсортированный массив: ");

            for(i = 0; i < n; ++i) {
                System.out.print(a[i] + " ");
            }

            System.out.println("\n");

            for(i = 0; i < n; ++i) {
                Random random = new Random();
                a[i] = random.nextDouble();
            }

            System.out.print("Сгенерированный массив: ");

            for(i = 0; i < n; ++i) {
                System.out.print(a[i] + ", ");
            }

            System.out.println();
            Arrays.sort(a);
            System.out.print("Отсортированный массив: ");

            for(i = 0; i < n; ++i) {
                System.out.print(a[i] + " ");
            }

        }
    }

