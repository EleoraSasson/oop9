package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem
{
    private Nimbus1PressureSensor PressSensor;
    private Nimbus1TemepratureSensor TempSensor;
    private PressureTrendSensor PressTrendSensor;

    protected  static WeatherMonitoringSystem instance;
    protected WeatherMonitoringSystem()
    {
        System.out.println("WeatherMonitoringSystem was created");
        AlarmClock clock = Nimbus1Clock.theInstance();
        PressSensor = new Nimbus1PressureSensor(1100);
        TempSensor = new Nimbus1TemepratureSensor(700);
        PressTrendSensor = new PressureTrendSensor(PressSensor);
    };
    public static WeatherMonitoringSystem theInstance()
    {
        if(instance == null)
            instance = new WeatherMonitoringSystem();
        return instance;
    }

    public void addPressureObserver(Observer observer)
    {
        PressSensor.addObserver(observer);
        System.out.println("MSPressObserver observes pressure");
    }

    public void addPressureTrendObserver(Observer observer)
    {
        PressTrendSensor.addObserver(observer);
        System.out.println("LogPressTrendObserver observes pressure trend");
    }

    public void addTemperatureObserver(Observer observer)
    {
        TempSensor.addObserver(observer);
        System.out.println("MSTempObserver observes temperature");
    }

}
