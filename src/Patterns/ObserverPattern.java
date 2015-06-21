package Patterns;

/**
 * Created by OrangeUser on 6/19/2015.
 */

interface Observer
{
    void update (int value);
}

interface Observable
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


class Value implements Observable
{
    private Observer observer;
    private int value;


    @Override
    public void registerObserver(Observer observer)
    {
        this.observer = observer;
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observer = null;
    }

    public void setValue(int value)
    {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void notifyObservers()
    {
        if (observer != null)
            observer.update(value);
    }
}

class CurrentValueDisplay implements Observer
{
    private int value;
    private Value valueObj;

    public CurrentValueDisplay(Value value)
    {
        this.valueObj = value;
        value.registerObserver(this);
    }

    @Override
    public void update(int value)
    {
        this.value = value;
        display();
    }

    public void display()
    {
        System.out.printf("Значение изменено: %d \n", value);
    }
}

public class ObserverPattern {

    public static void main(String[] args)
    {
        Value value = new Value();

        CurrentValueDisplay currentValueDisplay = new CurrentValueDisplay(value);

        value.setValue(3);
        value.setValue(432);
        value.setValue(32);

        value.removeObserver(currentValueDisplay);

        value.setValue(32);

    }

}
