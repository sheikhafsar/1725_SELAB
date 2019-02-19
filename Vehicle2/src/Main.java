public class Main {
    public static void main(String[] args){
        System.out.println("Smart Vehicle");

        AbstractVehicleFactory f1 = FactoryManufacturer.creatvehicleFactory(false);
        Vehicle v1=f1.createVehicle("bike");
        Vehicle v2=f1.createVehicle("car");
        v1.changeTyres();
        v2.changeTyres();

        AbstractVehicleFactory f2 = FactoryManufacturer.creatvehicleFactory(true);
        Vehicle v3=f2.createVehicle("bike");
        Vehicle v4=f2.createVehicle("car");
        v3.changeTyres();
        v4.changeTyres();


    }
}
