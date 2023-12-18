package n4.n3;

public enum Products {
    TShirt(540), Pants(1000), Tie(300), Skirt(700);
    int cost;
    Products(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString() + " | "  + this.cost + " рублей";
    }
}
