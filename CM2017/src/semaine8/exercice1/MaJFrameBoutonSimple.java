package semaine8.exercice1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaJFrameBoutonSimple extends JFrame implements ActionListener {
	private JTextField jTextFieldNom = new JTextField("Nom");
	private JTextField jTextFieldPrenom = new JTextField("Prénom");
	private JLabel jLabel = new JLabel();
	private JButton monBouton = new JButton("OK");
	
	public MaJFrameBoutonSimple(){
		this.setVisible(true);
		this.setBounds(10,10,300,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(jTextFieldNom);
		this.getContentPane().add(jTextFieldPrenom);
		this.getContentPane().add(monBouton);
		this.getContentPane().add(jLabel);
		monBouton.addActionListener(this);
	}

	public static void main(String[] args) {
		MaJFrameBoutonSimple maJframe = new MaJFrameBoutonSimple();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("on a cliqué");
		jLabel.setText("Bonjour "+jTextFieldPrenom.getText());
		
	}

}
