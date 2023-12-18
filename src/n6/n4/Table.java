package n6.n4;
public class Table implements Priceable {
    private double price;
    public Table(double price) {
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
