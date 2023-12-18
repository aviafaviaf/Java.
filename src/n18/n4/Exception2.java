package n18.n4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Это не целое число");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } finally {
            System.out.println("Выход");
        }
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo2();
    }
}
