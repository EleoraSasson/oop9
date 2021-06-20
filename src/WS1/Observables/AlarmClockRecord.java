package WS1.Observables;

public class AlarmClockRecord
{
    private int interval;
    private int remainingTime;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = interval;
        this.alarmListener = alarmListener;
        this.remainingTime = interval;
    }

    public int getIntervalDecrement() {
        return remainingTime;
    }

    public AlarmListener getListener() {
        return alarmListener;
    }

    public int getInterval() {
        return interval;
    }

    public void setIntervalDecrement(int remainingTime) {
        this.remainingTime = remainingTime;
    }

}
