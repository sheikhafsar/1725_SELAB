package Application;

import POJO.AdminPanel;
import POJO.Elevator;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char res=' ';
        int choice;
        System.out.println("Elevator program");

        Elevator elv = new Elevator();
       // Scanner key = new Scanner(System.in);
    /*
        do {
            System.out.println("Current Floor: " + elv.getCurFloor());
            System.out.println("Enter the floor you wish for.");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            elv.goToFloor(choice);

            System.out.println("Do you want to cont? (Enter y/n)");
            try {
                 res = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while(res == 'y');
    */
        AdminPanel panel=AdminPanel.getInstance();
        System.out.println("--->" + panel.getVersion());
    }
}
