package n4.n41.n1;

public class Square extends Shape{
    int a;
    public Square(int a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return a * a;
    }
    public double getPerimeter() {
        return a * 4;
    }
    public String getType() {
        return "Квадрат";
    }
    public String toString() {
        return getType() + ".  Площадь: " + getArea() + ". Периметр: " + getPerimeter();
    }
}