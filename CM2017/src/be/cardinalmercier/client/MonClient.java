package be.cardinalmercier.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import be.cardinalmercier.modele.Personne;

public class MonClient extends Socket {
	
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private int num;
	public MonClient() throws UnknownHostException, IOException, ClassNotFoundException{
		super ("127.0.0.1",2017);
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
		num = ois.readInt();
		System.out.println("Console du client numéro "+num);
		Personne p = (Personne)ois.readObject();
		System.out.println("Message reçu : "+p);
		p = new Personne("Toto","Vroman");
		oos.writeObject(p);
	}

	public static void main(String[] args) {
		try {
			MonClient mc = new MonClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
