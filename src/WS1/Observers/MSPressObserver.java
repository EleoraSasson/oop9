package WS1.Observers;

import WS1.Observables.Observable;

public class MSPressObserver implements Observer
{
    MonitoringScreen MSPressure;
    @Override
    public void update(int data)
    {
        MSPressure.displayPressure(data);
    }
}
