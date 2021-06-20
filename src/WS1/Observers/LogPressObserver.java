package WS1.Observers;


public class LogPressObserver implements Observer
{
    private Log LogPressure;
    public LogPressObserver(Log log)
    {
        System.out.println("LogPressObserver was created");
        this.LogPressure = log;
    }

    @Override
    public void update(int data)
    {
        LogPressure.displayPressureLog(data);
    }
}
