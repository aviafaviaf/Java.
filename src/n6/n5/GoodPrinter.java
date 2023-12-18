package n6.n5;

public class GoodPrinter implements Observer {

    public GoodPrinter(MyStringBuilder myStringBuilder) {

        myStringBuilder.registerObserver(this);
    }

    @Override
    public void update(String str) {

        System.out.println("Строка: " + str);
    }
}
