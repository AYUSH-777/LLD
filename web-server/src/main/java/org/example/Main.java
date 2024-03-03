package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8080);

        // Wait for a client connection
        Socket clientSocket = serverSocket.accept();

        // Get the input stream from the client
        InputStream inputStream = clientSocket.getInputStream();

        // Read the HTTP request
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String requestLine = reader.readLine();

        // Parse the HTTP request
        String[] requestParts = requestLine.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        // Create a response
        String response = "HTTP/1.1 200 OK\r\n\r\nHello, world!";

        // Send the response to the client
        OutputStream outputStream = clientSocket.getOutputStream();
        outputStream.write(response.getBytes());

        // Close the client socket
        clientSocket.close();

        // Close the server socket
        serverSocket.close();



    }
}