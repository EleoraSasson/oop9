package WS1.Observables;

//use eleora's
public abstract class Sensor extends Observable
{
    public abstract int read();

    public void check()
    {
        int data = read(); //call the read functions of the sensors and get the data
        notifyObservers(data);
    }
}
