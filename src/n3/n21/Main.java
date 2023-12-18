package n3.n21;

public class Main {
    public static void main(String[] args) {
        Double x = Double.valueOf("1.32");
        Double y = Double.parseDouble("1.32");
        System.out.println("ByteValue: " + x.byteValue());
        System.out.println("floatValue: " + x.floatValue());
        System.out.println("intValue: " + x.intValue());
        System.out.println("longValue: " + x.longValue());
        System.out.println("String: " + x);
        System.out.println(x);
        String s = Double.toString(x);
    }
}
