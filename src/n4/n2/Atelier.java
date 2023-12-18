package n4.n2;

public class Atelier {
    public void dressMen(Clothes[] clothes) {
        ((TShirt) clothes[0]).dressMan();
        ((Pants) clothes[1]).dressMan();
        ((Tie) clothes[3]).dressMan();
    }

    public void dressWomen(Clothes[] clothes) {
        ((TShirt) clothes[0]).dressWomen();
        ((Pants) clothes[1]).dressWomen();
        ((Skirt) clothes[2]).dressWomen();
    }
}
