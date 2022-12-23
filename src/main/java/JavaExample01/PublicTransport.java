package JavaExample01;

public class PublicTransport {
    int vehicleNumber = 0;
    int fuelLeft = 100;
    int speed = 0;
    int passengerCnt = 0;
    int maxPassenger;
    int fare = 0;
    int fareCnt = 0;
    int status = 0;

    public void assign() {
        ++vehicleNumber;
        System.out.println(vehicleNumber + "번 대중교통 만들어짐!");
    }

    public void passengerRide(int passenger) {
        if (passengerCnt + passenger > maxPassenger) {
            System.out.println("최대 승객 수를 초과하였습니다");
//            System.out.println("탑승 승객 수 = " + passengerCnt );
//            System.out.println("잔여 승객 수 = " + (maxPassenger - passengerCnt));
//            System.out.println("요금 확인 = " + fareCnt);
        } else {
            passengerCnt = passengerCnt + passenger;
            fareCnt += passenger * fare;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - passengerCnt));
            System.out.println("요금 확인 = " + fareCnt);

        }
    }

    public int changeSpeed(int changing) {
        int result = speed + changing;
        return result;
    }

    public void statusChange(){
        if (this.status == 1){
            System.out.println("상태: 운행");
            this.status = 0;
        }else if (this.status == 0){
            System.out.println("상태: 차고지행");
            this.status = 1;
        }
    }

    public void reFuel(int amount){
        if (fuelLeft + amount > 100){
            System.out.println("주유량: " + 100);

        }else if (amount < 0){
            System.out.println("연료를 사용할 수는 없습니다.");
        }
        fuelLeft = fuelLeft+amount;
        System.out.println("주유량: " + fuelLeft);

    }

    public void useFuel(int amount){
        if (fuelLeft - amount < 10){
            System.out.println("주유가 필요합니다.");
        } else if (fuelLeft + amount < 0) {
            fuelLeft = 0;
            System.out.println("주유량: " + fuelLeft);
        }
        fuelLeft = fuelLeft - amount;
        System.out.println("주유량: " + fuelLeft);
    }

}
