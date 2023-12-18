package n7.n4;
public class MathFunc implements MathCalculable {
    public int pow(int x, int pow) {
        return (int) Math.pow(x, pow);
    }
    public double module(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
    public double length(int r) {
        return 2 * PI * r;
    }
    public double square(int r) {
        return pow(r, 2) * PI;
    }
}
