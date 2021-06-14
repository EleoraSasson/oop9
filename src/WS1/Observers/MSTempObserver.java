package WS1.Observers;

import WS1.Nimbus1.RandomSupplier;
import WS1.Observables.Observable;

import java.util.Random;

public class MSTempObserver implements Observer
{
    private MonitoringScreen MSTemperature;
    public MSTempObserver(MonitoringScreen ms)
    {
        System.out.println("MSTempObserver was created");
        this.MSTemperature = ms;
    }
    @Override
    public void update(int data)
    {
        MSTemperature.displayTemp(data);
    }

}

