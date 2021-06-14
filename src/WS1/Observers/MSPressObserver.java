package WS1.Observers;

import WS1.Observables.Observable;

public class MSPressObserver implements Observer
{
    private MonitoringScreen MSPressure;
    public MSPressObserver(MonitoringScreen ms)
    {
        System.out.println("MSPressObserver was created");
        this.MSPressure = ms;
    }
    @Override
    public void update(int data)
    {
        MSPressure.displayPressure(data);
    }
}
