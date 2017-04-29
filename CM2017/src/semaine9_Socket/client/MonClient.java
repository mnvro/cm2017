package semaine9_Socket.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	private int num;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public MonClient() throws UnknownHostException, IOException, NumberFormatException, ClassNotFoundException{
		super("127.0.0.1",2017);
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
		System.out.println("ois et oos créés");
		oos.writeObject("Message du client");
		System.out.println("Massage parti");
		oos.writeObject("Message 2 du client");
		oos.writeObject("Message 3 du client");
		num = Integer.parseInt((String)ois.readObject());
		System.out.println("Console du client numéro "+num);
		lireNonStop();
	}

	public static void main(String[] args) {
		MonClient monClient = null;
		try {
			monClient = new MonClient();
			

			while (monClient.isBound());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				monClient.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void lireNonStop(){
		try {
			while (this.isBound()){

				System.out.println("On a reçu : "+ois.readObject());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				this.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
