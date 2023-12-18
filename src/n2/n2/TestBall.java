package n2.n2;

import n2.n2.Ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Введите начальные координаты мяча");
        x = in.nextInt();
        y = in.nextInt();
        Ball ball = new Ball(x, y);
        System.out.println(ball.toString());
        System.out.println("Введите на сколько нужно переместить мяч по x и y");
        x = in.nextInt();
        y = in.nextInt();
        ball.move(x, y);
        System.out.println(ball.toString());

        System.out.println("Введите новую координату x");
        x = in.nextInt();
        ball.setX(x);
        System.out.println(ball.getX());

        System.out.println("Введите новую координату y");
        y = in.nextInt();
        ball.setY(y);
        System.out.println(ball.getY());

        System.out.println("Введите новые координаты x и y");
        x = in.nextInt();
        y = in.nextInt();
        ball.setXY(x, y);
        System.out.println(ball.toString());
    }
}
