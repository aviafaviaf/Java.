package n6.n5;

public class Printer implements Observer {

    public Printer(MyStringBuilder myStringBuilder) {
        myStringBuilder.registerObserver(this);
    }

    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
