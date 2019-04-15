public class CouchFactory {
    public Couch createCouch(String couchType){
        if (couchType == null) {
            return null;
        }
        if (couchType.equalsIgnoreCase("openAirCouch")) {
            return new openAirCouch();
        }else if(couchType.equalsIgnoreCase("privateCouch")){
            return new PrivateCouch();
        }
        return null;
    }
}
