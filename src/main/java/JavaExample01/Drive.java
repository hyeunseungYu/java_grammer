package JavaExample01;

public class Drive {
    public static void main(String[] args) {
        PublicTransport publicTransport = new PublicTransport();
        Bus bus = new Bus();


        bus.assign();
        bus.assign();

        bus.passengerRide(2);

        bus.useFuel(50);

        bus.statusChange();

        bus.reFuel(10);
        bus.statusChange();

        bus.passengerRide(45);
        bus.passengerRide(5);

        bus.useFuel(55);
        bus.statusChange();


    }
}
