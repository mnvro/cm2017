package be.cardinalmercier.serveur;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class JFrameServeur extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton jButtonLancerLeServeur;
	private JLabel jLabelMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur frame = new JFrameServeur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jButtonLancerLeServeur = new JButton("Lancer le serveur");
		jButtonLancerLeServeur.addActionListener(this);
		contentPane.add(jButtonLancerLeServeur);
		
		jLabelMessage = new JLabel();
		contentPane.add(jLabelMessage);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			MonServeur ms = new MonServeur();
			jButtonLancerLeServeur.setVisible(false);
			jLabelMessage.setText("On attend un client");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
