package n6.n10;

import java.util.Scanner;

public class VideoCard implements Product {

    private int videoChipOperatingFrequency;
    private int videoMemoryCapacity;

    VideoCard(int videoChipOperatingFrequency, int videoMemoryCapacity) {
        this.videoChipOperatingFrequency = videoChipOperatingFrequency;
        this.videoMemoryCapacity = videoMemoryCapacity;
    }

    public VideoCard(Scanner scanner) {
        enterPerformance(scanner);
    }

    @Override
    public String toString() {
        return "Видеокарта: " + "Частота: " + videoChipOperatingFrequency + ", Видеопамять: " + videoMemoryCapacity;
    }

    @Override
    public void enterPerformance(Scanner in) {
        System.out.println("Видеокарта:");
        System.out.print("Частота:");
        videoChipOperatingFrequency = in.nextInt();
        System.out.print("Видеопамять: ");
        videoMemoryCapacity = in.nextInt();
    }

    public boolean compareTo(VideoCard o) {
        return o.videoChipOperatingFrequency <= videoChipOperatingFrequency & o.videoMemoryCapacity <= videoMemoryCapacity;
    }
}
