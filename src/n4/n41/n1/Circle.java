package n4.n41.n1;

public class Circle extends Shape{
    int r;
    public Circle(int r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return 3.14 * Math.pow(r, 2);
    }
    public double getPerimeter() {
        return 3.14 * 2 * r;
    }
    public String getType() {
        return "Круг";
    }
    public String toString() {
        return getType() + ".  Площадь: " + getArea() + ". Периметр: " + getPerimeter();
    }
}
