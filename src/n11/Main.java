package n11;

import java.util.*;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        n1();
        n2();
        n3();
        n4();
        n5();
    }

    private static void n1() {
        System.out.println("Фамилия: Куликов");
        System.out.println("Дата получения задания: " + new Date(2022, Calendar.SEPTEMBER, 11, 7, 20, 35));
        System.out.println("Дата проверки: " + new Date());
    }

    private static void n2() {
        Date date = new Date();
        System.out.print("Введите год: ");
        date.setYear(in.nextInt() - 1900);
        System.out.print("Введите номер месяца: ");
        date.setMonth(in.nextInt() - 1);
        System.out.print("Введите число: ");
        date.setDate(in.nextInt());

        date.setHours(new Date().getHours());
        date.setMinutes(new Date().getMinutes());
        date.setSeconds(new Date().getSeconds());

        switch (date.compareTo(new Date())) {
            case 1 -> System.out.println("Введённое время больше");
            case 0 -> System.out.println("Времена равны");
            case -1 -> System.out.println("Текущее время больше");
        }
    }

    private static void n3() {
        Date date = new Date();
        System.out.print("Введите год рождения студента: ");
        date.setYear(in.nextInt() - 1900);
        System.out.print("Введите номер месяца: ");
        date.setMonth(in.nextInt() - 1);
        System.out.print("Введите число: ");
        date.setDate(in.nextInt());
        System.out.println();

        System.out.println("Выберите тип вывода: ");
        System.out.println("1 - год");
        System.out.println("2 - день и месяц");
        System.out.println("3 - день, месяц и год");

        System.out.println(
                new Student(88, "Vladislav", "Kulikov", 2, "ИКБО-16-22", 100, date).toString(TimeType.values()[in.nextInt() - 1])
        );
    }

    private static void n4() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите данные по формату:");
        System.out.println("Год номер_месяца число часы минуты");
        String[] enter = scanner1.nextLine().split(" ");

        Date date = new Date(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        Calendar calendar = Calendar.getInstance();
        calendar.set(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        System.out.println("Date:");
        System.out.println(date);
        System.out.println("Calender:");
        System.out.println(calendar);
    }

    private static void n5() {

        long start;
        long end;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) arrayList.add(i);
        end = System.currentTimeMillis();
        System.out.println("Добавление в ArrayList: " + (end - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("Добавление в LinkedList: " + (end - start) + "мс");
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("Вставка в ArrayList: " + (end - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("Вставка в LinkedList: " + (end - start) + "мс");
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("Поиск в ArrayList: " + (end - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("Поиск в LinkedList: " + (end - start) + "мс");
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("Удаление из ArrayList: " + (end - start) + "мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("Удаление из LinkedList: " + (end - start) + "мс");
    }
}
