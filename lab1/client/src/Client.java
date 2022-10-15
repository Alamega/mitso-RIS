import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(1337);
        Interface anInterface = (Interface) registry.lookup("server.calculator");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number == 0) { break; }
            int[] result = anInterface.function(number);
            System.out.println("Результат: ");
            for (int el : result) {
                System.out.println(el);
            }
        }
    }
}