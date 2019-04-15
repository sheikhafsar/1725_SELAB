import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    UserFactory userfactory = new UserFactory();
    User user1 = userfactory.createUser("CouchUser", "afsar", "panjim");
    @Test
    public void testPlace() {
        assertEquals("panjim",user1.getPlace());
    }
}