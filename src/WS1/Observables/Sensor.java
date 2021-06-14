package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;

public abstract class Sensor extends Observable<Integer> {

    protected abstract int read();

    //uses SensorAlarmListener
    private Integer last;
    protected Sensor(int interval) {
        last = null;
        Nimbus1Clock.theInstance().register(interval, new SensorAlarmListener(this));
    }

    public void check() {
        int reading = read();
        if (last == null || reading != last)
            notifyObservers(reading);
        last = reading;
    }
}
