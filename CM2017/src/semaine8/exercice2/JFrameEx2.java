package semaine8.exercice2;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameEx2 extends JFrame implements ActionListener {
	private JButton jButtonOK = new JButton("OK");
	private JButton jButtonCancel = new JButton("Cancel");
	private JTextField jTextFieldNom = new JTextField("Vroman");
	private JTextField jTextFieldPrenom = new JTextField("Marie-Noël");
	private JLabel jLabelNom = new JLabel("Nom : ");
	private JLabel jLabelPrenom = new JLabel("Prénom : ");
	public JFrameEx2(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		int largeur = 600;
		int hauteur = 600;
		int x = width/2 - largeur/2;
		int y = height/2 - hauteur/2;
		this.setBounds(x,y,largeur,hauteur);
		Container contenu = this.getContentPane();
		contenu.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		contenu.add(jLabelNom, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		contenu.add(jLabelPrenom, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		contenu.add(jButtonOK, gbc);
		jButtonOK.addActionListener(this);
		gbc.gridx = 1;
		gbc.gridy = 2;
		contenu.add(jButtonCancel, gbc);
		jButtonCancel.addActionListener(this);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		contenu.add(jTextFieldNom, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		contenu.add(jTextFieldPrenom, gbc);

	}

	public static void main(String[] args) {
		JFrameEx2 jf = new JFrameEx2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "OK": 
			System.out.println("Bonjour "+jTextFieldPrenom.getText()+
					" "+jTextFieldNom.getText());
			break;
		case "Cancel": 
			jTextFieldNom.setText("");
			jTextFieldPrenom.setText("");
			break;
		}

	}

}
