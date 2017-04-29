package semaine9_Socket.serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeurSocket extends ServerSocket implements Runnable{
	private ApplicationServeur appliServeur;
	private ArrayList<SocketCoteServeur> listeClients = new ArrayList<SocketCoteServeur>();

	public MonServeurSocket(int arg0, ApplicationServeur appliServeur) throws IOException {
		super(arg0);
		this.appliServeur = appliServeur;
		Thread t = new Thread(this);
		t.start();
	}

	public void ecrireSurTousLesClients(Object o){
		for (SocketCoteServeur socketCoteServeur : listeClients) {
			socketCoteServeur.ecrire(o);
		}
	}

	@Override
	public void run() {
		Socket client;
		try {
			while (this.isBound()){
				client = this.accept();
				SocketCoteServeur scs = new SocketCoteServeur(client, appliServeur);
				listeClients.add(scs);
				System.out.println("on a un nouveau client");
				this.appliServeur.traiteNouveauClient(scs);
				//scs.lireNonStop();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
