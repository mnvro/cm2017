package be.cardinalmercier.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public MonClient() throws UnknownHostException, IOException, ClassNotFoundException{
		super ("127.0.0.1",2017);
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
		System.out.println("Message reçu : "+ois.readObject());
		oos.writeObject("Message du client");
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
