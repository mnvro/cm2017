package be.cardinalmercier.serveur;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeur extends ServerSocket implements Runnable{
	private Socket client;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

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
			oos.writeObject("Message"); 	                          				//TODO
			System.out.println("on a reçu : "+ois.readObject());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
