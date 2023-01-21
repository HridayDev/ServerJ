package ClientTesting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("Connecting to server");
		HttpURLConnection con = (HttpURLConnection) new URL("http://localhost:8080/").openConnection();
		System.out.println("Connected.");
		con.setRequestMethod("GET");
		con.setDoOutput(true);
		con.connect();

		String str = "Hello from the client!\t\n\r";
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
		out.write(str);
		out.flush();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		System.out.println("Received from server:" + in.readLine());
//		String s;
//		while ((s = in.readLine())!= null) {
//			System.out.println(s);
//			s = null;
//		}
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
		in.close();
	}

}