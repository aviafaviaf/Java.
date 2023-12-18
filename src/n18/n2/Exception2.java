package n18.n2;


import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String intString = in.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String intString = in.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Only integer!!!");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero!!!");
        }

    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo2();
    }
}
