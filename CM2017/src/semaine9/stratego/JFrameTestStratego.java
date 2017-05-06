package semaine9.stratego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;

public class JFrameTestStratego extends JFrame {

	private JPanel contentPane;
	private int nbColonnes = 10;
	private int nbLignes = 10;
	private JButton[][] tabJbutton = new JButton[nbColonnes][nbLignes];
	private JButton jButtonTest = new JButton();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTestStratego frame = new JFrameTestStratego();
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
	/**
	 * 
	 */
	public JFrameTestStratego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
//		for (int c = 0; c < nbColonnes; c++) {
//			for (int l= 0; l < nbLignes; l++) {
//				tabJbutton[c][l] = new JButton();
//				tabJbutton[c][l].setIcon(new ImageIcon(JFrameTestStratego.class.getResource("/images/StrategoBackground/StrategoBackground_1.gif")));
//				GridBagConstraints gbc_button = new GridBagConstraints();
//				gbc_button.gridx = c;
//				gbc_button.gridy = l;
				
//				contentPane.add(tabJbutton[c][l], gbc_button);
//			}
//			
//		}
		jButtonTest.setIcon(new ImageIcon(JFrameTestStratego.class.getResource("/images/StrategoBackground/StrategoBackground_1.gif")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridx = 9;
		gbc_button.gridy = 9;
		
		contentPane.add(jButtonTest, gbc_button);
	}

}
