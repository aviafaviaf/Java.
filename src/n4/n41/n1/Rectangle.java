package n4.n41.n1;

public class Rectangle extends Shape{
    int a;
    int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }
    public double getPerimeter() {
        return a + b + a + b;
    }
    public String getType() {
        return "Прямоугольник";
    }
    public String toString() {
        return getType() + ".  Площадь: " + getArea() + ". Периметр: " + getPerimeter();
    }
}