public class UserFactory {
    public User createUser(String userType,String userName ,String userPlace){
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("CouchUser")) {
            return new CouchUser(userName ,userPlace);
        }else if(userType.equalsIgnoreCase("CouchProvider")){
            return new CouchProvider(userName ,userPlace);
        }
        return null;
    }
}
