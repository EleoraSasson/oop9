package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1PressureSensor extends Sensor
{
    @Override
    public int read() {
        return  (RandomSupplier.getRnd().nextInt(100)) + 950; //returns a number between 950 and 1050
    }
}
