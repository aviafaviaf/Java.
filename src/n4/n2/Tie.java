package n4.n2;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() { System.out.println("Мужчина одел галстук размера " + size + " цвета " + color + " за " + cost + " рублей"); }
}
