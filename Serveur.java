import java.io.*;
import java.net.*;
public class Serveur {
	static final int port = 1500;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket s = new ServerSocket(port);
		System.out.println("En attente de connexion");
		Socket socClient = s.accept(); 
		System.out.println("Connexion établie");
		
		BufferedReader entreeServeur = new BufferedReader(new InputStreamReader(socClient.getInputStream())
		);
		
		PrintWriter sortieServeur = new PrintWriter(
		new BufferedWriter(	new OutputStreamWriter(socClient.getOutputStream())),true);
		String str = entreeServeur.readLine(); 
		int nombre=0;
		try{
		nombre=Integer.parseInt(str);
		}catch (Exception e){
		System.out.println("L'entrée du clavier n'est pas un entier");
		}
		for(int i=2;i<=nombre;i++){
			if(estPremier(i))
			System.out.println(i);
			}
		

		
		
		entreeServeur.close();
		sortieServeur.close();
		socClient.close();
		}

		static boolean estPremier(int n)
		{
		boolean res;
		res = true;
		int i=2;
		while(i<=n/2 && res==true){
		if (n%i == 0)
		res = false;
		i++;
		}
		return(res);
		}
		}

		
	


