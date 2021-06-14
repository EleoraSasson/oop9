package WS1.Observers;

import WS1.Nimbus1.RandomSupplier;
import WS1.Observables.Observable;

import java.util.Random;

public class MSTempObserver implements Observer
{
    MonitoringScreen MSTemperature;

    @Override
    public void update(int data)
    {
        MSTemperature.displayTemp(data);
    }

    @Override
    public String getName() {
        return this.toString();
    }
}

