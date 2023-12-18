package n4.n3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        boolean signedIn = false;
        boolean b = true;
        int select;
        String password;
        String login;
        while (!signedIn) {
            System.out.println("1 - Создать пользователя");
            System.out.println("2 - Войти в аккаунт");
            select = in.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Введите логин и пароль");
                    password = in.next();
                    login = in.next();
                    b = true;
                    for (User user : users) {
                        if (user.getLogin().equals(login)) {
                            System.out.println("Пользователь с таким именем существует");
                            b = false;
                        }
                    }
                    if (b) {
                        System.out.println("Аккаунт создан");
                        users.add(new User(login, password));
                    }
                    break;
                case 2:
                    System.out.println("Введите логин и пароль");
                    password = in.next();
                    login = in.next();
                    for (User user : users) {
                        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                            System.out.println("Вы вошли в аккаунт");
                            signedIn = true;
                        }
                    }
                    break;
            }
        }
        select = 1;
        ArrayList<Products> cart = new ArrayList<Products>();
        while (select != 0 && select != Products.values().length + 1) {
            System.out.println("0 - Выход");
            System.out.println("Каталог: ");
            for (int i = 0; i < Products.values().length; i++) {
                System.out.println((i + 1) + " - " + Products.values()[i]);
            }
            System.out.println((Products.values().length + 1) + " - Купить");
            select = in.nextInt();
            if (select != 0 && select != (Products.values().length + 1)) {
                cart.add(Products.values()[select - 1]);
                System.out.println("Корзина: " + cart);
            }
            if (select == Products.values().length + 1) {
                System.out.println("Вы купили: " + cart);
            }
        }
    }
}
