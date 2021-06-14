package WS1.Observers;

public class LogPressTrendObserver implements Observer
{
    private Log LogPressure;
    public LogPressTrendObserver(Log log)
    {
        System.out.println("LogPressTrendObserver was created");
        this.LogPressure = log;
    }

    @Override
    public void update(int data)
    {
        LogPressure.displayPressureTrend(data);
    }
}
