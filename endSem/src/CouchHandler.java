import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CouchHandler {
    CouchFactory couchFactory;
    int couchChoice;

    public CouchHandler(){
        couchFactory = new CouchFactory();
    }

    public void createCouch() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Private Couch \n2.Open Air Couch \n3.Exit");
        System.out.print("Enter Choice");
        couchChoice = Integer.parseInt(br.readLine());
        String couchType;
        if (couchChoice == 1) {
            couchType = "privateCouch";
        } else if (couchChoice == 2) {
            couchType = "openAirCouch";
        } else {
            couchType = null;
        }
        Couch couch1 = couchFactory.createCouch(couchType);
        System.out.println("\nCreated Couch Details");
        System.out.println("Couch Type:"+couch1.getCouchType());
        System.out.println("Couch Cost:"+couch1.getCharge());
        System.out.println("Couch Capacity:"+couch1.getCapacity());
        System.out.println("\n\n");

    }

}
