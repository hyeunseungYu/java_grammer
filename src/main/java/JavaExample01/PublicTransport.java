package JavaExample01;

public abstract class PublicTransport implements PassengerCal{
    int vehicleNumber = 0;
    private int fuelLeft = 100;
    private int speed = 0;
    protected int passenger = 0;
    protected int passengerCnt = 0;
    protected int maxPassenger;
    protected int pay = 0;
    private int payCnt = 0;
    protected int status = 0;


    public void assign(){
        ++vehicleNumber;
        System.out.println(vehicleNumber + "번 대중교통 만들어짐!");
    }


    public void setPassenger(int passenger){
        if (passenger + passengerCnt > maxPassenger){
            System.out.println("최대 승객 초과");

        }else {
            this.passenger = passenger;
            passengerCnt += passenger;

        }


    }

    public void setMaxPassenger(int maxPassenger){
        this.maxPassenger = maxPassenger;
    }

    public void getOff(int passenger){
        passengerCnt -= passenger;
    }

    public void setPay(int pay){
        this.pay = pay;
    }

    public void setFuelLeft(int fuel){
        this.fuelLeft = this.fuelLeft+fuel;
    }

    public void setStatus(int status){
        this.status = status;
    }



//    print
    public void onBoard(){
        System.out.println("탑승 승객 수 = " + passenger);
    }

    public void passengerLeft(){
        System.out.println("남은 승객 수 = "+ (maxPassenger - passengerCnt));
    }

    public void payChecker(){
        System.out.println("요금 확인 = " + (passenger*pay));
    }

    public void fuelChecker(){
        if (fuelLeft < 10){
            System.out.println("주유가 필요합니다.");
        }
        System.out.println("주유량 = " + fuelLeft);
    }

    public void statusChecker(){
        if (status == 0){
            System.out.println("운행중");
        }else {
            System.out.println("차고지행");
        }
    }

}
