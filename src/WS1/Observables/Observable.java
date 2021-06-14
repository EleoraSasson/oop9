package WS1.Observables;

import java.util.ArrayList;
import java.util.List;
import WS1.Observers.Observer;

//take eleora's
public abstract class Observable
{
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) { this.observers.add(observer); }
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }

    void notifyObservers(int data)
    {
        observers.forEach(observer -> observer.update(data));
    }
}
