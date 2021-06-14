package WS1.Observers;

import WS1.Observables.Observable;

public class LogPressObserver implements Observer
{
    Log LogPressure;

    @Override
    public void update(int data)
    {
        LogPressure.displayPressureLog(data);
    }

    @Override
    public String getName() {
        return this.toString();
    }
}
