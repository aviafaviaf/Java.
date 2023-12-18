package n6.n10;

import java.util.Scanner;
public class Computer implements Product {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;

    Computer(ComputerBrand brand, Processor processor, Memory memory, VideoCard videoCard) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    public Computer(Scanner scanner) {
        enterPerformance(scanner);
    }

    @Override
    public String toString() {
        return "Computer " + brand + ":\n" +
                "processor = " + processor + '\n' +
                "memory = " + memory + '\n' +
                "videoCard = " + videoCard;
    }

    @Override
    public void enterPerformance(Scanner scanner) {
        System.out.println("Введите информацию о копмьютере:");
        System.out.println("Введите номер производителя:");
        for (int i = 0; i < ComputerBrand.values().length; i++)
            System.out.println(i + " - " + ComputerBrand.values()[i].name());
        brand = ComputerBrand.values()[scanner.nextInt()];
        System.out.println();

        processor = new Processor(scanner);
        System.out.println();
        memory = new Memory(scanner);
        System.out.println();
        videoCard = new VideoCard(scanner);
        System.out.println();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
