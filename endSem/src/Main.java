/*
 *author: Afsar
 * version: 1
 * Date: 15/04/2019
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Couch surfing service system");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int serviceChoice;

        /*
        * Iterate program execution until user chooses exit.
         */
        do {
            System.out.println("1.Couch user\n2.Couch Provider\n3.Exit");
            System.out.print("Enter Choice");
            serviceChoice = Integer.parseInt(br.readLine());
            String userType;

            System.out.print("Enter Your Name:");
            String userName = br.readLine();

            System.out.print("Enter Your Place for using this system:");
            String userPlace = br.readLine();

            if (serviceChoice == 1) {
                userType = "CouchUser";
            } else if (serviceChoice == 2) {
                userType = "CouchProvider";
            } else {
                userType = null;
            }

            UserFactory userfactory = new UserFactory();

            User user1 = userfactory.createUser(userType, userName, userPlace);

            System.out.println("User name:" + user1.getName());
            System.out.println("User Place:" + user1.getPlace());
            user1.getUserType();

            if (userType == "CouchProvider"){
                CouchHandler couchHandler = new CouchHandler();
                couchHandler.createCouch();
            }


            if (userType == "CouchUser"){

            }
        }while (serviceChoice!=3);

    }
}
