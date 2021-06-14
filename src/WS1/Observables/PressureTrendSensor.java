package WS1.Observables;

import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer
{ //implements observer design pattern

    int a; // oldest pressure reading
    int b; // middle pressure reading
    int c; // most recently recorded pressure reading

    @Override
    public void update(int data)
    {
        //update to new readings:
        a = b;
        b = c;
        c = data;
        //check the trend
        checkTrend();
    }

    public void checkTrend()
    {
        if(b<c && a<b)
        { notifyObservers(3);} //pressure is rising represented by int value 3

        else if (b>c && a>b)
        { notifyObservers(1);} //pressure is falling represented by int value 1

        else {notifyObservers(2);} //pressure is stable represented by int value 2

    }

    void notifyObservers(int data) {
        super.notifyObservers(data);
    }
}
