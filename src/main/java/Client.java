import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}
    public static void main(String[] args) {
        try {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(5000);

            // Looking up the registry for the remote object
            MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("HelloStub");

            // Calling the remote method using the obtained object
            String str = stub.printMsg();

            System.out.println(str);

            Bogus a = new Bogus(5);
            Bogus b = a;
            //To show that a and b point to same object on Client's side
            System.out.println("Value of a.x before changing b.x's value= " + a.x);
            b.x = 1000;
            System.out.println("Value of a.x after changing b.x's value = " + a.x);
            //To show that a and b point to same object on Server's side
            System.out.println("Object a and b are the same: " + stub.checkObj(a,b));

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
