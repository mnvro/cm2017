package be.cm.semaine10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameExercice2Semaine8 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton jButtonCancel;
	private JButton jButtonOK;
	private JLabel jLabelNom;
	private JLabel jLabelPrenom;
	private JTextField jTextFieldNom;
	private JLabel jLabelBonjour;
	private JTextField jTextFieldPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameExercice2Semaine8 frame = new JFrameExercice2Semaine8();
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
	public JFrameExercice2Semaine8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jLabelNom = new JLabel("Nom :");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.anchor = GridBagConstraints.EAST;
		gbc_jLabelNom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNom.gridx = 0;
		gbc_jLabelNom.gridy = 0;
		contentPane.add(jLabelNom, gbc_jLabelNom);
		
		jTextFieldNom = new JTextField();
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 1;
		gbc_jTextFieldNom.gridy = 0;
		contentPane.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
		
		jLabelPrenom = new JLabel("Pr\u00E9nom :");
		GridBagConstraints gbc_jLabelPrenom = new GridBagConstraints();
		gbc_jLabelPrenom.anchor = GridBagConstraints.EAST;
		gbc_jLabelPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelPrenom.gridx = 0;
		gbc_jLabelPrenom.gridy = 1;
		contentPane.add(jLabelPrenom, gbc_jLabelPrenom);
		
		jTextFieldPrenom = new JTextField();
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 1;
		gbc_jTextFieldPrenom.gridy = 1;
		contentPane.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);
		
		jLabelBonjour = new JLabel("");
		GridBagConstraints gbc_jLabelBonjour = new GridBagConstraints();
		gbc_jLabelBonjour.gridwidth = 2;
		gbc_jLabelBonjour.insets = new Insets(0, 0, 5, 0);
		gbc_jLabelBonjour.gridx = 0;
		gbc_jLabelBonjour.gridy = 2;
		contentPane.add(jLabelBonjour, gbc_jLabelBonjour);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonOK.gridx = 0;
		gbc_jButtonOK.gridy = 3;
		contentPane.add(jButtonOK, gbc_jButtonOK);
		
		jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.gridx = 1;
		gbc_jButtonCancel.gridy = 3;
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Cancel": 
			jTextFieldNom.setText("");
			jTextFieldPrenom.setText("");
			jLabelBonjour.setText("");
			break;
		case "OK" : 
			jLabelBonjour.setText("Bonjour "+jTextFieldNom.getText()+" "+
				jTextFieldPrenom.getText());
			break;
		
		}
		
	}

}
