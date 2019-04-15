public abstract class User {
    String name;
    String place;



    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    abstract void getUserType();
}
