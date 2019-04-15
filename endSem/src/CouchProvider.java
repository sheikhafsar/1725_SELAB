public class CouchProvider extends User {

    public int couchCount;
    public int couchAvailable;

    public CouchProvider(String name, String place) {
        this.name = name;
        this.place = place;
    }
    @Override
    void getUserType() {
        System.out.println("User is provider");
    }


}
