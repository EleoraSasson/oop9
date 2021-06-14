package WS1.Observers;
import WS1.Observables.Observable;
import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen
{
    public MonitoringScreen(WeatherMonitoringSystem ws) { }

    public void displayTemp(int data)
    {
        System.out.println("MonitoringScreen: temperature =" + data + "celsius");
    }

    public void displayPressure(int data)
    {
        System.out.println("MonitoringScreen: pressure =" + data + "millibars");
    }
}
