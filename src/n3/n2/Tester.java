package n3.n2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    private ArrayList<Circle> arr = new ArrayList<Circle>();
    private int length;

    public Tester(int length) {
        this.length = length;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr.add(new Circle(Math.abs(random.nextInt() % 1000), Math.abs(random.nextInt() % 1000), Math.abs(random.nextInt() % 1000)));
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < length; i++) {
            s += "Центр: (" + arr.get(i).getO().getX() + ", " +  arr.get(i).getO().getY() + "), " + "Радиус: " + arr.get(i).getR() + "\n";
        }
        return s;
    }
    public void sort() {
        Collections.sort(arr);
    }
    public Circle getMax() {
        return Collections.max(arr);
    }

    public Circle getMin() {
        return Collections.min(arr);
    }
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        System.out.println("Массив окружностей: ");
        System.out.println(tester.toString());
        tester.sort();
        System.out.println("Отсортированный массив окружностей: ");
        System.out.println(tester.toString());
        System.out.println("Радиус наименьшей окружности: ");
        System.out.println(tester.getMin().getR());
        System.out.println("Радиус наибольшей окружности: ");
        System.out.println(tester.getMax().getR());

    }
}
