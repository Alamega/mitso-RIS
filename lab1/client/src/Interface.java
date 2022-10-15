import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    int[] function(int number) throws RemoteException;
}