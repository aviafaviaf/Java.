package n4.n2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку размера " + size + " цвета " + color + " за " + cost + " рублей");
    }
    public void dressWomen() { System.out.println("Женщина надела футболку размера " + size + " цвета " + color + " за " + cost + " рублей");; }
}
