package be.cm.semaine10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;

public class MaJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton jButtonOK;
	private JTextField jTextFieldNom;
	private JLabel jLabelBonjour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrame frame = new MaJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		
		JLabel jLabelNom = new JLabel("Nom de la personne : ");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.anchor = GridBagConstraints.EAST;
		gbc_jLabelNom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNom.gridx = 3;
		gbc_jLabelNom.gridy = 1;
		contentPane.add(jLabelNom, gbc_jLabelNom);
		
		jTextFieldNom = new JTextField();
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 4;
		gbc_jTextFieldNom.gridy = 1;
		contentPane.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
		
		jLabelBonjour = new JLabel("");
		GridBagConstraints gbc_jLabelBonjour = new GridBagConstraints();
		gbc_jLabelBonjour.gridwidth = 2;
		gbc_jLabelBonjour.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelBonjour.gridx = 3;
		gbc_jLabelBonjour.gridy = 2;
		contentPane.add(jLabelBonjour, gbc_jLabelBonjour);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 6;
		gbc_jButtonOK.gridy = 3;
		contentPane.add(jButtonOK, gbc_jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jLabelBonjour.setText("Bonjour "+jTextFieldNom.getText());
		
	}

}
