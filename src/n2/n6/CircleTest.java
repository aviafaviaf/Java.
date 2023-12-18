package n2.n6;

import n2.n3.Point;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты центра и радиус окружности");
        Circle circle = new Circle(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println("x: " + circle.getO().getX() + ", y: " + circle.getO().getY() + ", радиус: " + circle.getR());
        System.out.println("Площадь: " + circle.getS() + ", длина окружности: " + circle.getLength());
        System.out.println("Введите новые координаты центра и радиус окружности");
        circle.setO(new Point(in.nextInt(), in.nextInt()));
        circle.setR(in.nextInt());
        System.out.println("x: " + circle.getO().getX() + ", y: " + circle.getO().getY() + ", радиус: " + circle.getR());
        System.out.println("Введите координаты центра и радиус второй окружности");
        Circle circle2 = new Circle(in.nextInt(), in.nextInt(), in.nextInt());
        if (circle.compare(circle2))
            System.out.println("Первая окружность больше второй");
        else
            System.out.println("Первая окружность меньше второй");

    }
}
