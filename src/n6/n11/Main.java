package n6.n11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во градусов Цельсия: ");
        Temperature temperature = new Temperature(scanner.nextDouble());
        System.out.println();

        System.out.println(temperature.convert(TemperatureCategory.KELVIN) + " в Кельвинах");
        System.out.println(temperature.convert(TemperatureCategory.FAHRENHEIT) + " в Фаренгейтах");
    }
}
