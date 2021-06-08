package WS1.Observables;

public class WeatherMonitoringSystem
{
    protected  static WeatherMonitoringSystem instance;
    protected WeatherMonitoringSystem(){};
    public static WeatherMonitoringSystem theInstance()
    {
        if(instance == null)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
}