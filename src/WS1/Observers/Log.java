package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

import java.util.Locale;

public class Log
{
    public Log(WeatherMonitoringSystem ws) { }

    public void displayPressureLog(int data)
    {
        System.out.println("Log: pressure = " + data + "millibars");
    }
    public void displayPressureTrend(int data)
    {
        if(data == 1)
        { System.out.println("Log: pressure trend = FALLING");}
        else if (data == 2)
        { System.out.println("Log: pressure trend = STABLE");}
        else if (data == 3)
        { System.out.println("Log: pressure trend = RISING");}
    }
}
