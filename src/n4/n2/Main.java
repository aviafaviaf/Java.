package n4.n2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(ClothingSizes.M, 450, "синего");
        clothes[1] = new Pants(ClothingSizes.XS, 450, "зелёного");
        clothes[2] = new Skirt(ClothingSizes.L, 450, "чёрного");
        clothes[3] = new Tie(ClothingSizes.M, 450, "чёрного");
        Atelier atelier = new Atelier();
        atelier.dressMen(clothes);
        atelier.dressWomen(clothes);
    }
}
