package n3.n31;

public class Converter {
    double cost;
    int currency = 1;
    public Converter(int cost) {
        this.cost = cost;
    }
    public void toRub() {
        if (currency == 3)
            cost *= 100;
        if (currency == 2)
            cost *= 110;
        currency = 1;
    }
    public void toEur() {
        if (currency == 1)
            cost /= 110;
        if (currency == 3)
            cost *= (double) 10 / 11;
        currency = 2;
    }
    public void toUsd() {
        if (currency == 1)
            cost /= 100;
        if (currency == 2)
            cost *= (double) 11 / 10;
        currency = 3;
    }
    public String toString() {
        if (currency == 1)
            return cost + " ₽";
        if (currency == 2)
            return cost + " €";
        return cost + " $";
    }
}
