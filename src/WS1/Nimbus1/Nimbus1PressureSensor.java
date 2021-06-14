package WS1.Nimbus1;

import WS1.Observables.Sensor;

// Pressure WS1.Observables.Sensor of Nimbus 1 which extends the WS1.Observables.Sensor class
public class Nimbus1PressureSensor extends Sensor
{
    private Random rand;

    public Nimbus1PressureSensor(int interval) {
        super(interval);
        rand = new Random();
    }
    @Override
    protected int read() {
        return rand.nextInt(101) + 950; // [950, 1050]
    }

    @Override
    public String getName() {
        return "pressure";
    }
}
