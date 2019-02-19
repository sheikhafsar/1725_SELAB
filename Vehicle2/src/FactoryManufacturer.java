public class FactoryManufacturer {
    public static AbstractVehicleFactory creatvehicleFactory(Boolean smartFactory){
        if(smartFactory){
            return new SmartVehicleFactory();
        }
        return new VehicleFactory();
    }
}
