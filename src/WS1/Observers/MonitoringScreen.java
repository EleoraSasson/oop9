package WS1.Observers;
import WS1.Observables.Observable;
import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen
{
    public MonitoringScreen(WeatherMonitoringSystem ws)
    {
        System.out.println("MonitoringScreen was created");
        ws.addTemperatureObserver(new MSTempObserver(this));
        ws.addPressureObserver(new MSPressObserver(this));
    }

    public void displayTemp(int data)
    {
        System.out.println("MonitoringScreen: temperature = " + data + " Celsius");
    }

    public void displayPressure(int data)
    {
        System.out.println("MonitoringScreen: pressure = " + data + " millibars");
    }
}
