package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {

		while(true) {
			
			ServerSocket serverSocket = new ServerSocket(8080); 
			Socket clientSocket = serverSocket.accept(); 
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 

			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 

			out.println("Hi, Hello\r\n");

			System.out.println(in.readLine());

			out.close(); 
			in.close(); 
			clientSocket.close(); 
			serverSocket.close(); 
			
		}

	}

}