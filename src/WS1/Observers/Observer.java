package WS1.Observers;

import WS1.Observables.Observable;

public interface Observer
{
    void update(int data);
    //may need to add getName to indicate when class is created
}
