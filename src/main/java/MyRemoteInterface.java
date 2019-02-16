import java.rmi.Remote;
import java.rmi.RemoteException;

/*
     An Interface that is extending java.rmi.Remote
     Defines 2 functions,
          printMsg - returns a message
          checkObj - function to check if the 2 objects passed to it are one and the same
 */
public interface MyRemoteInterface extends Remote {
     String printMsg() throws RemoteException;
     boolean checkObj (Bogus a, Bogus b) throws RemoteException;
}



