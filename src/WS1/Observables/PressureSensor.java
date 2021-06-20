package WS1.Observables;

public class PressureSensor extends Sensor{

    protected PressureSensor(int interval) {
        super(1100);
    }

    PressureImp PressReading;
    @Override
    protected int read() {
        return PressReading.read();
    }
}
