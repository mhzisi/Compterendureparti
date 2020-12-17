import java.io.*;
import java.net.*;
public class Client {

	static final int port = 1500;
	public static void main(String[] args) throws Exception {

	System.out.println("Demande de connexion");
	Socket socket = new Socket("127.0.0.1", port); 
	System.out.println("Connexion établie");
	BufferedReader entreeClient = new BufferedReader( new InputStreamReader(socket.getInputStream()) ); 
	PrintWriter sortieClient = new PrintWriter( new BufferedWriter( new OutputStreamWriter(socket.getOutputStream())), true); 
	BufferedReader keybord=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Saisir au clavier un entier positif");
	String str = keybord.readLine();
	sortieClient.println(str);
	entreeClient.close();
	sortieClient.close();

	socket.close();
	}
	

}
