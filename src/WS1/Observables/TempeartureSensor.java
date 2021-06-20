package WS1.Observables;

public class TempeartureSensor extends Sensor{

    protected TempeartureSensor(int interval) {
        super(700);
    }

   TemperatureImp TempReading;

    @Override
    protected int read() {
        return TempReading.read();
    }
}
