package JavaExample01;

public class Bus extends PublicTransport{
    int maxPassenger = 30;
    int status = 0;
    int fare = 1000;

    @Override
    public void assign() {
        ++vehicleNumber;
        System.out.println(vehicleNumber + "번 버스 만들어짐!");
    }

    @Override
    public void passengerRide(int passenger) {
        if (passengerCnt + passenger > maxPassenger) {
            System.out.println("최대 승객 수를 초과하였습니다");
//            System.out.println("탑승 승객 수 = " + passengerCnt );
//            System.out.println("잔여 승객 수 = " + (maxPassenger - passengerCnt));
//            System.out.println("요금 확인 = " + fareCnt);
        } else {
            passengerCnt = passengerCnt + passenger;
            fareCnt += passenger * fare;
            System.out.println("탑승 승객 수 = " + (passenger));
            System.out.println("잔여 승객 수 = " + (maxPassenger - passengerCnt));
            System.out.println("요금 확인 = " + fareCnt);

        }
    }
}
