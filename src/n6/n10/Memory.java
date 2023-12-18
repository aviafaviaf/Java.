package n6.n10;

import java.util.Scanner;

public class Memory implements Product {

    private int storageCapacity;
    private int readingSpeed;
    private int writingSpeed;

    Memory(int storageCapacity, int readingSpeed, int writingSpeed) {
        this.storageCapacity = storageCapacity;
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }

    public Memory(Scanner in) {
        enterPerformance(in);
    }

    @Override
    public String toString() {
        return "Память:" + "Объём " + storageCapacity + ", Скорость чтения " + readingSpeed + ", Скорость записи " + writingSpeed + '}';
    }

    @Override
    public void enterPerformance(Scanner in) {
        System.out.println("Введите данные о памяти:");
        System.out.print("Объём: ");
        storageCapacity = in.nextInt();
        System.out.print("Скорость чтения: ");
        readingSpeed = in.nextInt();
        System.out.print("Скорость записи: ");
        writingSpeed = in.nextInt();
    }

    public boolean compareTo(Memory o) {
            return o.storageCapacity <= storageCapacity && o.writingSpeed <= writingSpeed && o.readingSpeed <= readingSpeed;
    }
}
