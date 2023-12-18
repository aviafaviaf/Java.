package n6.n10;

import java.util.Scanner;

public class Processor implements Product {
    private int cores;
    private double frequency;


    Processor(int cores, double frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    public Processor(Scanner in) {

        enterPerformance(in);
    }
    @Override
    public String toString() {
        return "Процессор:" + "Количество ядер " + cores + ", Тактовая частота " + frequency;
    }

    @Override
    public void enterPerformance(Scanner in) {
        System.out.println("Процессор:");
        System.out.print("Количество ядер:");
        cores = in.nextInt();
        System.out.print("Тактовая частота:");
        frequency = in.nextInt();
    }

    public boolean compareTo(Processor o) {
        return o.cores <= cores & o.frequency <= frequency;
    }
}
