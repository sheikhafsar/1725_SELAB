public class VehiclePortal {
    private Vehicle bike;

    public Vehicle getBike() {
        return bike;
    }

    public void setBike(Vehicle bike) {
        this.bike = bike;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    private Vehicle car;

    public VehiclePortal(){
        bike = new Bike();
        car = new Car();
    }

    public void changeBikeTyres(){
        bike.changeTyre();
    }

    public void changeCarTyres(){
        car.changeTyre();
    }
}