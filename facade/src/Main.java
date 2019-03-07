import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
public class Main {
    public final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {


        LOGGER.log(Level.INFO,"Facade");
        VehiclePortal portal = new VehiclePortal();
        portal.changeBikeTyres();
        portal.changeCarTyres();
    }
}
