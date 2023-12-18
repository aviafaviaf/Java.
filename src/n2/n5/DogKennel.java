package n2.n5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    static private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите кличку собаки");
            String name = in.next();
            System.out.println("Введите возраст собаки");
            int age = in.nextInt();
            dogs.add(new Dog(name, age));
            System.out.println("Собака " + name + " с возрастом " + age + " добавлена");
            System.out.println("Добавить ещё одну собаку? 1 - да, 0 - нет");
            age = in.nextInt();
            if (age == 0)
                break;
        }
    }
}
