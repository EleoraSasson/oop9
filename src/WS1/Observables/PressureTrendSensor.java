package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer
{ //implements observer design pattern

//    public PressureTrendSensor(Nimbus1PressureSensor PressSensor)
//    {
//       System.out.println("PressureTrendSensor observes pressure");
//       PressSensor.addObserver(this);
//    }
    public  PressureTrendSensor(PressureSensor PressSensor)
    {
        System.out.println("PressureTrendSensor observes pressure");
       PressSensor.addObserver(this);
    }

    public int a = 0; // oldest pressure reading
    public int b = 0; // middle pressure reading
    public int c = 0; // most recently recorded pressure reading

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
        if (b>c && a>b)
        { notifyObservers(3);} //pressure is falling represented by int value 3

        else if(b<c && a<b)
        { notifyObservers(2);} //pressure is rising represented by int value 2

        else if (a != 0) {notifyObservers(1);} //pressure is stable represented by int value 1

    }
    public void notifyObservers(int data) {
        super.notifyObservers(data);
    }

}
