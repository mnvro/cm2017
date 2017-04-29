package semaine9_Socket.serveur;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameServeur extends JFrame {
	private ApplicationServeur appliServeur;
	//private JPanel jPanelServeur;
	public void traiteNouveauClient(SocketCoteServeur socketCoteServeur){
		((JPanelServeur)this.getContentPane()).traiteNouveauClient(socketCoteServeur);
	}
	
	public void traiteObjetRecu(Object o){
		((JPanelServeur)this.getContentPane()).traiteObjetRecu(o);
	}

//	public JPanel getjPanelServeur() {
//		return jPanelServeur;
//	}

	public void setjPanelServeur(JPanel jPanelServeur) {
		
		this.setContentPane(jPanelServeur);
	}

	/**
	 * Create the frame.
	 */
	public JFrameServeur(ApplicationServeur appliServeur) {
		this.appliServeur = appliServeur;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setContentPane(new JPanelAccueilServeur(appliServeur));
		this.setVisible(true);
	}

}
