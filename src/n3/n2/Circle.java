package n3.n2
        ;
public class Circle implements Comparable<Circle> {
    private Point o;
    private int r;
    public Circle(int x, int y, int r) {
        this.o = new Point(x, y);
        this.r = r;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double getS() {
        return r * r * 3.14;
    }
    public double getLength() {
        return 2 * 3.14 * r;
    }
    public int compareTo(Circle circle) {
        if (r > circle.getR())
            return 1;
        if (r == circle.getR())
            return 0;
        return -1;
    }
}

