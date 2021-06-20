package WS1.Nimbus1;

import WS1.Observables.Sensor;
import WS1.Observables.TemperatureImp;

// Temperature WS1.Observables.Sensor of Nimbus 1 which extends the WS1.Observables.Sensor class
public class Nimbus1TemepratureSensor implements TemperatureImp
{
    //public Nimbus1TemepratureSensor(int interval)
    //{
    //    super(700);
   // }
    @Override
    public int read()
    {
        return  RandomSupplier.getRnd().nextInt(40);//returns a number between 0 and 40
    }
}
