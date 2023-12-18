package n6.n5;

import java.util.ArrayList;

public class MyStringBuilder implements Observable{
    private StringBuilder stringBuilder;

    private ArrayList<Observer> observers;


    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }
    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }


    @Override
    public String toString() {
        return stringBuilder.toString();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(toString());
        }
    }
}