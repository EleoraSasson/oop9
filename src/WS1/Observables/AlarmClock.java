package WS1.Observables;

import java.util.ArrayList;

/*
We need a getName overridden in most of the classes
 */
public class AlarmClock  //check what extends what
{
    public static final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList<>();

    public static AlarmClock theInstance() {
        if (null == instance) {
            instance = new AlarmClock();
        }
        return instance;
    }

    protected AlarmClock(){}

    protected void tic(){ //Eleora
        for (AlarmClockRecord record: itsAlarmClockRecords)
        {
            if (record.getIntervalDecrement() - CLOCK_INTERVAL_MILLIS <= 0)
            {
                record.getListener().wakeUp();
                record.setIntervalDecrement (record.getInterval());
            }
            else record.setIntervalDecrement(record.getIntervalDecrement() -CLOCK_INTERVAL_MILLIS);
        }
    }

    public void register(int interval, AlarmListener al) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval, al));
    }
}
