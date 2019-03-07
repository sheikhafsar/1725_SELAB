import java.util.logging.Level;
import java.util.logging.Logger;

public class Bike extends Vehicle {

    public final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Override
    public void changeTyre(){
        LOGGER.log(Level.INFO,"Changed Bike Tyre");
    }
}
