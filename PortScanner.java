import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        String host = "127.0.0.1";

        System.out.println("Scanning host: " + host);

        for (int port = 1; port <= 1024; port++) {
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " is OPEN");
                socket.close();
            } catch (Exception e) {
                // Port closed
            }
        }

        System.out.println("Scan Complete.");
    }
}
