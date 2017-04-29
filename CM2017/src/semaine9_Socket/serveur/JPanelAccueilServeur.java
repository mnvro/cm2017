package semaine9_Socket.serveur;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JPanelAccueilServeur extends JPanel implements ActionListener {
	private ApplicationServeur appliServeur;

	/**
	 * Create the panel.
	 */
	public JPanelAccueilServeur(ApplicationServeur appliServeur) {
		this.appliServeur = appliServeur;
		JButton btnLancerLeServeur = new JButton("Lancer le serveur");
		btnLancerLeServeur.addActionListener(this);
		add(btnLancerLeServeur);

	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			appliServeur.setMonServeurSocket(new MonServeurSocket(2017, appliServeur));
			appliServeur.getjFrameServeur().setjPanelServeur(new JPanelServeur(appliServeur));
			appliServeur.getjFrameServeur().setVisible(true);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
