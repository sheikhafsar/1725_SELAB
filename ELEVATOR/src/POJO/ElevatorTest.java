package POJO;

import static org.junit.Assert.*;

public class ElevatorTest {

    public void gotosecondfloor(){
        Elevator elvTest = new Elevator();

        elvTest.goToFloor(2);

        assertEquals(2,elvTest.getCurFloor());
    }


}