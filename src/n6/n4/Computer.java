package n6.n4;
public class Computer implements Priceable {
    private double price;
    public Computer(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
