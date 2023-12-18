package n4.n2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() { System.out.println("Женщина одела юбку размера " + size + " цвета " + color + " за " + cost + " рублей"); }
}
