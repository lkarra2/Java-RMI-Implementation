import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestImplementation {

    @Test
    public void testCheckObj() {
        Implementation i = new Implementation();
        Bogus obj1 = new Bogus(10);
        Bogus obj2 = obj1;

        assertEquals(i.checkObj(obj1, obj2), true);
        assertTrue("Checking obj1 and obj2 are pointing to same instance", i.checkObj(obj1, obj2));
    }
}
