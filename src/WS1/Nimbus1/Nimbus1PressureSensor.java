package WS1.Nimbus1;

import WS1.Observables.PressureImp;
import WS1.Observables.Sensor;

public class Nimbus1PressureSensor implements PressureImp
{
    //public Nimbus1PressureSensor(int interval) {
     //   super(1100);
   // }
    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(100) + 950; //returns a number between 950 and 1050
    }
}
