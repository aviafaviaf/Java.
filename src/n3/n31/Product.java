package n3.n31;

public class Product {
    private String name;
    private Converter cost;
    public Product(String name, Converter cost) {
        this.name = name;
        this.cost = cost;
    }
    public String toString() {
        return name + " | " + cost;
    }

    public Converter getCost() {
        return cost;
    }
}
