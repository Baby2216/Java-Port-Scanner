import java.net.Socket;
import java.util.Scanner;

public class PortScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target IP address: ");
        String host = sc.nextLine();

        System.out.println("Scanning host: " + host);
        System.out.println("-----------------------------");

        for (int port = 1; port <= 1024; port++) {
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " is OPEN");
                socket.close();
            } catch (Exception e) {
                // port is closed → ignore
            }
        }

        System.out.println("Scan Complete!");
        sc.close();
    }
}