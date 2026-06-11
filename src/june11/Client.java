package june11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8080);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in)
        ) {

            System.out.println("Enter message: ");
            String message = scanner.nextLine();
            writer.println(message);
            writer.flush();
            String response = reader.readLine();
            System.out.println("Server responded: " + response);
        } catch (IOException e) {

        }
    }

}
