package n2.n4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int command = 1;
        Scanner in = new Scanner(System.in);
        String name;
        Computer computer;
        while (command != 0) {
            System.out.println("0 - выход");
            System.out.println("1 - добавить компьютер");
            System.out.println("2 - удалить компьютер");
            System.out.println("3 - найти компьютер");
            command = in.nextInt();
            if (command == 1) {
                System.out.println("Введите название компьютера");
                name = in.next();
                shop.addComputer(name);
                System.out.println("Компьютер " + name + " добавлен");
            }
            else if (command == 2) {
                System.out.println("Введите название компьютера");
                name = in.next();
                shop.deleteComputer(name);
                System.out.println("Компьютер " + name + " удалён");
            }
            else if (command == 3) {
                System.out.println("Введите название компьютера");
                name = in.next();
                computer = shop.findComputer(name);
                if (computer != null)
                    System.out.println("Компьютер " + name + " найден");
                else
                    System.out.println("Компьютер не найден");
            }
        }
    }
}
