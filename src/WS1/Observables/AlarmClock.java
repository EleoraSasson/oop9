package WS1.Observables;

import java.util.ArrayList;

public class AlarmClock
{
    public static final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList<>();

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic(){
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
        System.out.println(getClass().getName() + "registered to clock");
    }
}
