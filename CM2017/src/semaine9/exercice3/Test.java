package semaine9.exercice3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class Test extends JFrame implements ActionListener {
	
	private int nbLignes = 5;
	private int nbColonnes = 6;
	private JPanel contentPane;
	private JButton[][] tabJButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		nbLignes = Integer.parseInt(JOptionPane.showInputDialog("Nb de lignes?"));		
		nbColonnes = Integer.parseInt(JOptionPane.showInputDialog("Nb de colonnes?"));
		tabJButton = new JButton[nbColonnes][nbLignes];
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int x = 0 ; x < nbColonnes ; x++){
			for (int y = 0 ; y < nbLignes ; y++){
				tabJButton[x][y] = new JButton(x+","+y);
				tabJButton[x][y].addActionListener(this);
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridx = x;
				gbc_btnNewButton.gridy = y;
				contentPane.add(tabJButton[x][y], gbc_btnNewButton);
			}
		}		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		System.out.println("on a cliqué en "+evt.getActionCommand());
	}

}
