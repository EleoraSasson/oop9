package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1TemepratureSensor extends Sensor
{
    @Override
    public int read() {
        return  RandomSupplier.getRnd().nextInt(40); //returns a number between 0 and 40
    }
}
