
// Implementing the remote interface
public class Implementation implements MyRemoteInterface {

    // Implementing the interface method
    public String printMsg() {
        return "This is an example RMI program";
    }

    //
    public boolean checkObj (Bogus a, Bogus b) {
        a.x = 50;
        return a == b;
    }
}
