package semaine9_Socket.serveur;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import semaine5_et_6.interfaceOO.Tableau;

public class SocketCoteServeur implements Runnable {
	private int num;
	private static int nbClients=0;
	private ApplicationServeur appliServeur;
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	
	public SocketCoteServeur(Socket socket, ApplicationServeur appliServeur){
		try {
			this.num = ++nbClients;
			this.appliServeur = appliServeur;
			this.socket = socket;
			oos = new ObjectOutputStream(this.socket.getOutputStream());
			ois = new ObjectInputStream(this.socket.getInputStream());
			oos.writeObject(num+"");
			//this.lireNonStop();
			new Thread(this).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ecrire(Object o){
		try {
			oos.writeObject(o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void lire(){
		try {
			appliServeur.traiteObjetRecu(ois.readObject());
			System.out.println("Objet reçu");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void lireNonStop(){
		while (socket.isBound()){							//TODO améliorer
			try {
				appliServeur.traiteObjetRecu(ois.readObject());
				System.out.println("Objet reçu");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
//				try {
//					socket.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		}
	}
	public String toString(){
		return "Client numéro "+num;
	}

	@Override
	public void run() {
		this.lireNonStop();
		
	}
}
