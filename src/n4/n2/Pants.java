package n4.n2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны размера " + size + " цвета " + color + " за " + cost + " рублей");
    }
    public void dressWomen() { System.out.println("Женщина надела штаны размера " + size + " цвета " + color + " за " + cost + " рублей");; }
}
