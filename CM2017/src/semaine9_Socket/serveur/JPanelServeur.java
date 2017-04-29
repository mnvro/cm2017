package semaine9_Socket.serveur;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelServeur extends JPanel implements ActionListener {
	private JTextField jTextFieldMessageAEnvoyer;
	private JComboBox jComboBoxClients;
	private JButton jButtonEnvoyer;
	private JTextArea jTextAreaConsoleDuServeur;
	private ApplicationServeur appliServeur;

	public void traiteNouveauClient(SocketCoteServeur socketCoteServeur){
		jComboBoxClients.addItem(socketCoteServeur);
		jTextAreaConsoleDuServeur.append("Nouveau Client\n");
		//System.out.println("On a un nouveau client connecté");
	}
	
	public void traiteObjetRecu(Object o){
		jTextAreaConsoleDuServeur.append("Recu : "+o+"\n");
	}

	/**
	 * Create the panel.
	 */
	public JPanelServeur(ApplicationServeur appliServeur) {
		this.appliServeur = appliServeur;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel jLabelListeDesCliens = new JLabel("Liste des clients :");
		GridBagConstraints gbc_jLabelListeDesCliens = new GridBagConstraints();
		gbc_jLabelListeDesCliens.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelListeDesCliens.anchor = GridBagConstraints.EAST;
		gbc_jLabelListeDesCliens.gridx = 0;
		gbc_jLabelListeDesCliens.gridy = 0;
		add(jLabelListeDesCliens, gbc_jLabelListeDesCliens);

		jComboBoxClients = new JComboBox();
		jComboBoxClients.addItem("Envoyer à tous");
		GridBagConstraints gbc_jComboBoxClients = new GridBagConstraints();
		gbc_jComboBoxClients.insets = new Insets(0, 0, 5, 5);
		gbc_jComboBoxClients.fill = GridBagConstraints.HORIZONTAL;
		gbc_jComboBoxClients.gridx = 1;
		gbc_jComboBoxClients.gridy = 0;
		add(jComboBoxClients, gbc_jComboBoxClients);

		jTextFieldMessageAEnvoyer = new JTextField();
		jTextFieldMessageAEnvoyer.setText("Message \u00E0 envoyer");
		GridBagConstraints gbc_jTextFieldMessageAEnvoyer = new GridBagConstraints();
		gbc_jTextFieldMessageAEnvoyer.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldMessageAEnvoyer.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldMessageAEnvoyer.gridx = 1;
		gbc_jTextFieldMessageAEnvoyer.gridy = 1;
		add(jTextFieldMessageAEnvoyer, gbc_jTextFieldMessageAEnvoyer);
		jTextFieldMessageAEnvoyer.setColumns(10);

		jButtonEnvoyer = new JButton("Envoyer");
		jButtonEnvoyer.addActionListener(this);
		GridBagConstraints gbc_jButtonEnvoyer = new GridBagConstraints();
		gbc_jButtonEnvoyer.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonEnvoyer.gridx = 2;
		gbc_jButtonEnvoyer.gridy = 1;
		add(jButtonEnvoyer, gbc_jButtonEnvoyer);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);

		jTextAreaConsoleDuServeur = new JTextArea("Console du serveur\n================\n");
		scrollPane.setViewportView(jTextAreaConsoleDuServeur);

	}
	public void actionPerformed(ActionEvent arg0) {
		try{
		SocketCoteServeur scs = (SocketCoteServeur) jComboBoxClients.getSelectedItem();
		scs.ecrire(jTextFieldMessageAEnvoyer.getText());
		} catch (Exception e){
			//TODO
			appliServeur.envoieATousLesClients(jTextFieldMessageAEnvoyer.getText());
		}
		
			
		
	}
}
