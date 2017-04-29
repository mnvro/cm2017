package be.cardinalmercier.serveur;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import be.cardinalmercier.modele.Personne;

public class MonServeur extends ServerSocket implements Runnable{
	private Socket client;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private static int nbClients = 0;

	public MonServeur() throws IOException, ClassNotFoundException {
		super(2017);
		// code était ici
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			client = this.accept();
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			oos.writeInt(++nbClients);
			Personne p = new Personne("Vroman","Marie");
			oos.writeObject(p); 	    
			p = (Personne)ois.readObject();
			System.out.println("on a reçu : "+p);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
