public class CouchUser extends User {
    public CouchUser(String name, String place) {
        this.name = name;
        this.place = place;
    }
    @Override
    void getUserType() {
        System.out.println("User is consumer");
    }
}
