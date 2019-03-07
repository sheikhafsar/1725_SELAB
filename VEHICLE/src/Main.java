public class Main {

    public static void main(String[] args) {

      //  System.out.println("Hello World!");
        Vehicle v1 = VehicleFactory.createVehicle("car");
        Vehicle v2 = VehicleFactory.createVehicle("bike");

        v1.changeTyres();
        v2.changeTyres();
    }
}
