import java.rmi.RemoteException;

public class RemoteServer implements Interface {
    public int[] function(int number) throws RemoteException {
        String strochechka = String.valueOf(number);
        int[] result = new int[strochechka.length()];

        for (int i = 0; i < result.length; i++) {
            result[result.length - i - 1] = (strochechka.charAt(i) - '0') * (int)Math.pow(10, result.length - i - 1);
        }
        return result;
    }
}