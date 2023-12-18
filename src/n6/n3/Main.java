package n6.n3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog");
        System.out.println(animal.getName());
        Car car = new Car("Ford");
        System.out.println(car.getName());
        Planet planet = new Planet("Mars");
        System.out.println(planet.getName());
    }
}
