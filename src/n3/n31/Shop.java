package n3.n31;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println("Каталог: ");
        Product computer = new Product("Компьютер", new Converter(70000));
        Product book = new Product("Книга", new Converter(500));
        Product phone = new Product("Телефон", new Converter(30000));
        ArrayList<Product> catalog = new ArrayList<Product>();
        catalog.add(computer);
        catalog.add(book);
        catalog.add(phone);
        int command = 1;
        Scanner in = new Scanner(System.in);
        while (command != 0) {
            System.out.println("Выберите валюту ");
            System.out.println("1 - Рубли");
            System.out.println("2 - Доллары");
            System.out.println("3 - Евро");
            command = in.nextInt();
            if (command == 1) {
                for (Product x : catalog) {
                    x.getCost().toRub();
                }
            }
            if (command == 2)
                for (Product x : catalog) {
                    x.getCost().toUsd();
                }
            if (command == 3)
                for (Product x : catalog) {
                    x.getCost().toEur();
                }
            System.out.println("Товар | Цена");
            for (Product x : catalog) {
                System.out.println(x);
            }
            System.out.println();
            System.out.printf("1 - Изменить валюту, 0 - Выход");
            command = in.nextInt();
        }
    }
}
