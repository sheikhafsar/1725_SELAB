package Application;

import POJO.Elevator;

import java.io.IOException;

public class Main {

   static char res;
    public static void main(String[] args) {
        System.out.println("Elevator program");

        Elevator elv = new Elevator();
       // Scanner key = new Scanner(System.in);



        do {
            System.out.println("Current Floor: " + elv.getFloor());
            elv.UserInput();

            System.out.println("Do you want to cont? (Enter y/n)");
            try {
                 res = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while(res == 'y');

    }
}
