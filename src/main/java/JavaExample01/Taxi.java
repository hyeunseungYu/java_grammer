package JavaExample01;

public class Taxi extends PublicTransport {
    int distance = 1;
    int payByDistance = 1000;

    int totalMoney;
    String destination;

    public void setDistance(int distance){
        this.distance = distance;
    }
    @Override
    public void assign() {
        ++vehicleNumber;
        System.out.println(vehicleNumber + "번 택시 만들어짐!");

    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    @Override
    public void setPassenger(int passenger) {
        if (passenger + passengerCnt > maxPassenger){
            System.out.println("최대 승객 초과");

        }else {
            this.passenger = passenger;
            passengerCnt += passenger;
            totalMoney += pay + (payByDistance * (distance-1));

        }
    }

    public void paid(){
        passengerCnt = 0;
    }

    //    print
    public void checkTotalPay(){
        System.out.println("지불할 요금 = " + (pay + (payByDistance * (distance-1))));
    }

    @Override
    public void statusChecker(){
        if (status == 0){
            System.out.println("일반");
        } else if (status == 1) {
            System.out.println("운행중");
        }else {
            System.out.println("운행불가");
        }
    }

    public void checkDestination(){
        System.out.println(destination);
    }

    public void checkDistance(){
        System.out.println("목적지까지 거리 = " + distance + "km");
    }

    public void checkPaidMoney(){
        System.out.println("누적 요금 = " + (pay + (payByDistance * (distance-1))));
    }

    @Override
    public void payChecker() {
        System.out.println("기본 요금 체크 = " + pay );
    }
}
