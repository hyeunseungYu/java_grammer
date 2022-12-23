package JavaExample01;

public class Drive {
    public static void main(String[] args) {

//        Bus02 bus = new Bus02();
//        bus.setMaxPassenger(30);
//        bus.setPay(1000);
//
//        bus.assign();
//        bus.assign();
//
//        bus.setPassenger(2);
//        bus.onBoard();
//        bus.passengerLeft();
//
//        bus.payChecker();
//
//        bus.setFuelLeft(-50);
//        bus.fuelChecker();
//
//        bus.setStatus(1);
//        bus.statusChecker();
//
//        bus.setFuelLeft(10);
//        bus.fuelChecker();
//
//        bus.setStatus(0);
//        bus.statusChecker();
//
//        bus.setPassenger(45);
//        bus.setPassenger(5);
//
//        bus.onBoard();
//        bus.passengerLeft();
//        bus.payChecker();
//
//        bus.setFuelLeft(-55);
//        bus.fuelChecker();
//        bus.setStatus(0);
//        bus.statusChecker();

        Taxi taxi = new Taxi();
        taxi.setMaxPassenger(4);
        taxi.setPay(3000);

        taxi.assign();
        taxi.assign();



        taxi.fuelChecker();
        taxi.statusChecker();


        taxi.setPassenger(2);
        taxi.setDestination("서울역");
        taxi.setDistance(2);
        taxi.setStatus(1);

        taxi.onBoard();
        taxi.passengerLeft();
        taxi.payChecker();
        taxi.checkDestination();
        taxi.checkDistance();
        taxi.checkTotalPay();
        taxi.statusChecker();

        taxi.setFuelLeft(-80);
        taxi.paid();
        taxi.fuelChecker();


        taxi.checkPaidMoney();

        taxi.setPassenger(5);
        taxi.setPassenger(3);
        taxi.setDestination("구로디지털단지역");
        taxi.setDistance(12);

        taxi.passengerLeft();
        taxi.payChecker();
        taxi.checkDestination();
        taxi.checkDistance();
        taxi.checkTotalPay();

        taxi.setFuelLeft(-20);
        taxi.paid();


        taxi.setStatus(2);
        taxi.statusChecker();
        taxi.checkPaidMoney();
        taxi.fuelChecker();


    }
}
