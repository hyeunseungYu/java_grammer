package JavaExample01;

public class Bus extends PublicTransport {

    @Override
    public void assign() {
            ++vehicleNumber;
            System.out.println(vehicleNumber + "번 버스 만들어짐!");

    }
}
