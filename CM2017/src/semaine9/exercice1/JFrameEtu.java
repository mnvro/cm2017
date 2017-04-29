package semaine9.exercice1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class JFrameEtu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldNouvellecote;
	private JTextArea jTextArea;
	private Etu etu = new Etu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEtu frame = new JFrameEtu();
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
	public JFrameEtu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel jLbaelEtudiant = new JLabel("Etudiant : " + etu.getNom()+" "+
				etu.getPrenom());
		GridBagConstraints gbc_jLbaelEtudiant = new GridBagConstraints();
		gbc_jLbaelEtudiant.gridwidth = 3;
		gbc_jLbaelEtudiant.insets = new Insets(0, 0, 5, 0);
		gbc_jLbaelEtudiant.gridx = 0;
		gbc_jLbaelEtudiant.gridy = 0;
		contentPane.add(jLbaelEtudiant, gbc_jLbaelEtudiant);
		
		JLabel jLabelNouvelleCote = new JLabel("Nouvelle cote :");
		GridBagConstraints gbc_jLabelNouvelleCote = new GridBagConstraints();
		gbc_jLabelNouvelleCote.anchor = GridBagConstraints.EAST;
		gbc_jLabelNouvelleCote.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNouvelleCote.gridx = 0;
		gbc_jLabelNouvelleCote.gridy = 1;
		contentPane.add(jLabelNouvelleCote, gbc_jLabelNouvelleCote);
		
		jTextFieldNouvellecote = new JTextField();
		GridBagConstraints gbc_jTextFieldNouvellecote = new GridBagConstraints();
		gbc_jTextFieldNouvellecote.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldNouvellecote.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNouvellecote.gridx = 1;
		gbc_jTextFieldNouvellecote.gridy = 1;
		contentPane.add(jTextFieldNouvellecote, gbc_jTextFieldNouvellecote);
		jTextFieldNouvellecote.setColumns(10);
		
		JButton jButtonAjouter = new JButton("Ajouter");
		jButtonAjouter.addActionListener(this);
		GridBagConstraints gbc_jButtonAjouter = new GridBagConstraints();
		gbc_jButtonAjouter.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonAjouter.gridx = 2;
		gbc_jButtonAjouter.gridy = 1;
		contentPane.add(jButtonAjouter, gbc_jButtonAjouter);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		jTextArea = new JTextArea();
		scrollPane.setViewportView(jTextArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		etu.ajouterCote(Double.parseDouble(jTextFieldNouvellecote.getText()));
		jTextArea.setText(etu.toString());
	}

}
