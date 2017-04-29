package semaine9_Socket.serveur;

import java.io.IOException;
import java.net.Socket;

public class ApplicationServeur {
	private MonServeurSocket monServeurSocket;
	private JFrameServeur jFrameServeur;
	
	public void traiteNouveauClient(SocketCoteServeur socketCoteServeur){
		jFrameServeur.traiteNouveauClient(socketCoteServeur);
	}
	public JFrameServeur getjFrameServeur() {
		return jFrameServeur;
	}

	public void setjFrameServeur(JFrameServeur jFrameServeur) {
		this.jFrameServeur = jFrameServeur;
	}

	
	public MonServeurSocket getMonServeurSocket() {
		return monServeurSocket;
	}

	public void setMonServeurSocket(MonServeurSocket monServeurSocket) {
		this.monServeurSocket = monServeurSocket;
	}

	
	
	public ApplicationServeur(){
		jFrameServeur = new JFrameServeur(this);
	}
	
	public void traiteObjetRecu(Object o){
		//System.out.println("Objet reçu : "+o);
		this.jFrameServeur.traiteObjetRecu(o);
	}
	
	public void envoieATousLesClients(Object o){
		monServeurSocket.ecrireSurTousLesClients(o);
	}

	public static void main(String[] args) {
		ApplicationServeur appliServeur = new ApplicationServeur();
	}

}
