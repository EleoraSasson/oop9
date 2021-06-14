package WS1.Observers;

public class LogPressTrendObserver implements Observer
{
    Log LogPressure;

    @Override
    public void update(int data)
    {
        LogPressure.displayPressureTrend(data);
    }
}
