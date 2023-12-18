package n18.n6;

public class ThrowsDemo {
    public void message1(String key) {
        String message = get(key);
        System.out.println(message);
    }

    public void message2(String key) {
        try {
            String message = get(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String get(String key) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.message1("AVIAF");
        throwsDemo.message2(null);
    }
}
