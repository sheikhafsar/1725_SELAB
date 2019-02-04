package POJO;

public class Elevator {
    int i;
    int curFloor;

    public Elevator() {
        this.curFloor = 0;
    }

    public int getCurFloor() {
        return curFloor;
    }

    public void setCurFloor(int curFloor) {
        this.curFloor = curFloor;
    }





    public void goToFloor(int choice)
    {
        if (choice > this.getCurFloor()){
            ElevatorUp(choice);
        }
        else if(choice < this.getCurFloor()){
            ElevatorDown(choice);
        }
        else{
            System.out.println("Elevator is already at Floor:"+this.getCurFloor());
        }


    }

    public void ElevatorUp(int choice)
    {
        System.out.println("The elevator is on it's way up...");

        for (i=this.getCurFloor(); i<=choice; i++) {
            this.setCurFloor(i);
            System.out.println("Current Floor: " + this.getCurFloor());
        }
        System.out.println("The elevator has arrived");

    }

    public void ElevatorDown(int choice)
    {
        System.out.println("The elevator is on it's way down...");

        for (i=this.getCurFloor(); i>=choice; i--){
            this.setCurFloor(i);
            System.out.println("Current Floor: " + this.getCurFloor());
        }

        System.out.println("The elevator has arrived");
    }
}
