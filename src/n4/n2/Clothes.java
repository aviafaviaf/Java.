package n4.n2;

abstract public class Clothes {
    ClothingSizes size;
    int cost;
    String color;

    public Clothes(ClothingSizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
