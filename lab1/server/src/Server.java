import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        final Registry registry = LocateRegistry.createRegistry(1337);
        final RemoteServer server = new RemoteServer();
        Remote stub = UnicastRemoteObject.exportObject(server, 0);
        registry.bind("server.calculator", stub);

        System.out.println("Сервер ждет приказаний...");
        Thread.sleep(Integer.MAX_VALUE);
    }
}