package WS1.Nimbus1;

import WS1.Observables.Sensor;

// Temperature WS1.Observables.Sensor of Nimbus 1 which extends the WS1.Observables.Sensor class
public class Nimbus1TemepratureSensor extends Sensor
{
        private Random rand;

        public Nimbus1TemepratureSensor(int interval) {
            super(interval);
            rand = new Random();
        }
        @Override
        protected int read() {
            return rand.nextInt(41); // [950, 1050]
        }

        @Override
        public String getName() {
            return "temperature";
        }
    @Override
    public int read() {
        return  RandomSupplier.getRnd().nextInt(40); //returns a number between 0 and 40
    }
}
