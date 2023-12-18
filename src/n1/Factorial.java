package n1;

public class Factorial {
    public static int factorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) {
            f *= i;
        }
        return f;
    }
}
