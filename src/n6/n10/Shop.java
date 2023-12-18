package n6.n10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>(List.of(new Computer[]{
                new Computer(
                        ComputerBrand.MSI,
                        new Processor(6, 2.7),
                        new Memory(2000, 3000, 2500),
                        new VideoCard(2100, 8)
                ),
                new Computer(
                        ComputerBrand.ASUS,
                        new Processor(4, 2.9),
                        new Memory(500, 4000, 2700),
                        new VideoCard(1600, 8)
                ),
                new Computer(
                        ComputerBrand.LENOVO,
                        new Processor(8, 4.1),
                        new Memory(1000, 3500, 3100),
                        new VideoCard(1500, 8)
                )
        }));

        int enter;
        Scanner in = new Scanner(System.in);
        Processor processor;
        Memory memory;
        VideoCard videoCard;
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("0 - выход");
            System.out.println("1 - добавить компьютер");
            System.out.println("2 - удалить компьютер");
            System.out.println("3 - все компьютеры");
            System.out.println("4 - найти компьютер");
            enter = in.nextInt();
            switch (enter) {
                case 0 -> {
                    System.out.println("Выход из магазина");
                    return;

                }
                case 1 -> computers.add(new Computer(in));

                case 2 -> {
                    System.out.print("Введите номер удаляемого компьютера: ");
                    enter = in.nextInt();
                    computers.remove(enter);
                    System.out.println("Удалён");

                }
                case 3 -> printComputers(computers);

                case 4 -> {
                    System.out.println("Введите минимальные характеристики пк:");
                    processor = new Processor(in);
                    memory = new Memory(in);
                    videoCard = new VideoCard(in);
                    System.out.println();

                    for (int i = 0; i < computers.size(); i++) {
                        if (computers.get(i).getProcessor().compareTo(processor) &
                                computers.get(i).getMemory().compareTo(memory) &
                                computers.get(i).getVideoCard().compareTo(videoCard)) {
                            System.out.println("ПК:");
                            System.out.println(i + "\n" + computers.get(i).toString() + '\n');
                        }
                    }

                }
            }
            System.out.println();
        }
    }

    private static void printComputers(ArrayList<Computer> computers) {
        System.out.println("Компьютеры:");
        for (int i = 0; i < computers.size(); i++) System.out.println(i + "\n" + computers.get(i).toString() + '\n');
    }
}
