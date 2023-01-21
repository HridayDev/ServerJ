package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {

		while(true) {
			
			System.out.println("Connecting to client..");
			ServerSocket ss = new ServerSocket(8080);
			Socket con = ss.accept();
			System.out.println("Connected");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			System.out.println("Received from client:");
//			String s;
//			while ((s = in.readLine())!= null) {
//				System.out.println(s);
//				s = null;
//			}
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			
			PrintWriter out = new PrintWriter(con.getOutputStream(), true);
			out.println("Hello from the server!\t\n\r");
			out.close();

			System.out.println("Done\n\n\n\n");
			ss.close();
			
		}

	}

}