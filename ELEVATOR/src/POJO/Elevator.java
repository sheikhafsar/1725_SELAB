package POJO;

import java.util.Scanner;

public class Elevator {
    int floor=0;

    int choice;
    int curFloor;



    public void UserInput()
    {
        System.out.println("Enter the floor you wish for.");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        if (choice > floor){
            ElevatorUp();
        }
        else if(choice < floor){
            ElevatorDown();
        }


    }

    public void ElevatorUp()
    {
        System.out.println("The elevator is on it's way up...");

        for (curFloor=floor; curFloor<=choice; curFloor++)
            System.out.println("Current Floor: "+curFloor);

            //floor=curFloor;

        setFloor(curFloor-1);
        System.out.println("The elevator has arrived");

    }

    public void ElevatorDown()
    {
        System.out.println("The elevator is on it's way down...");

        for (curFloor=floor; curFloor>=choice; curFloor--)
            System.out.println(curFloor);

        setFloor(curFloor+1);
        System.out.println("The elevator has arrived");
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
