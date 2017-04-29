package semaine8.exercice2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaJFrameAvecWB extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldNom;
	private JTextField jTextFieldPrenom;
	private JLabel jLabelTitre;
	private JButton jButtonOK;
	private JButton jButtonCancel;
	private JLabel jLabelPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrameAvecWB frame = new MaJFrameAvecWB();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaJFrameAvecWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		this.setVisible(true);
		setContentPane(contentPane);

		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);

		jLabelTitre = new JLabel("Titre");
		jPanelHaut.add(jLabelTitre);

		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);

		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		jPanelBas.add(jButtonOK);

		jButtonCancel = new JButton("Cancel");
		jPanelBas.add(jButtonCancel);
		jButtonCancel.addActionListener(this);

		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_jPanelCentre = new GridBagLayout();
		gbl_jPanelCentre.columnWidths = new int[]{0, 0, 0};
		gbl_jPanelCentre.rowHeights = new int[]{0, 0, 0};
		gbl_jPanelCentre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanelCentre.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		jPanelCentre.setLayout(gbl_jPanelCentre);

		jLabelPrenom = new JLabel("Pr\u00E9nom:");
		GridBagConstraints gbc_jLabelPrenom = new GridBagConstraints();
		gbc_jLabelPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelPrenom.anchor = GridBagConstraints.EAST;
		gbc_jLabelPrenom.gridx = 0;
		gbc_jLabelPrenom.gridy = 0;
		jPanelCentre.add(jLabelPrenom, gbc_jLabelPrenom);

		jTextFieldPrenom = new JTextField();
		jTextFieldPrenom.setText("Pr\u00E9nom");
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 1;
		gbc_jTextFieldPrenom.gridy = 0;
		jPanelCentre.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);

		JLabel jLabelNom = new JLabel("Nom:");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.insets = new Insets(0, 0, 0, 5);
		gbc_jLabelNom.anchor = GridBagConstraints.EAST;
		gbc_jLabelNom.gridx = 0;
		gbc_jLabelNom.gridy = 1;
		jPanelCentre.add(jLabelNom, gbc_jLabelNom);

		jTextFieldNom = new JTextField();
		jTextFieldNom.setText("Nom");
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 1;
		gbc_jTextFieldNom.gridy = 1;
		jPanelCentre.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "OK":
			this.jLabelTitre.setText("Bonjour "+jTextFieldPrenom.getText()+" "+
					jTextFieldNom.getText());
			break;
		case "Cancel":
			jTextFieldNom.setText("");
			jTextFieldPrenom.setText("");
		}

	}

}
