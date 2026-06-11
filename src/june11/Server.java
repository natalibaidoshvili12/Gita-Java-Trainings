package june11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started on port: " + serverSocket.getLocalPort());
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            String message = reader.readLine();
            System.out.println("Received message: " + message);
            writer.println("Modified message: " + messageModifier(message));
            writer.flush();
            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String messageModifier(String message) {
        return "*" + message + "*";
    }

}
