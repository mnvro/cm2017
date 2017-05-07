package be.cm.semaine10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class JFrameStratego extends JFrame implements ActionListener {

	private JPanel contentPane;
	private int nbLignes = 10;
	private int nbColonnes = 10;
	private int largeurcolonnePixel = 50;
	private int hauterLignePixel = 50;

	private MesJButton[][] tabJButton = new MesJButton[nbColonnes][nbLignes];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameStratego frame = new JFrameStratego();
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
	public JFrameStratego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameTest.class.getResource("/images/StrategoIcon.jpg")));
		setTitle("Stratego");
		setBounds(100, 100, nbColonnes*largeurcolonnePixel, nbLignes*hauterLignePixel);
		setMinimumSize(new Dimension(nbColonnes*largeurcolonnePixel, 
				nbLignes*hauterLignePixel)
			);

		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int c = 0 ; c < nbColonnes ; c++){
			for (int l = 0 ; l < nbLignes; l++){
				tabJButton[c][l] = new MesJButton(c,l);
				//String image = "/images/StrategoBackground/StrategoBackground_1.gif";
				tabJButton[c][l].setIcon(
				  new ImageIcon(
					JFrameTest.class.getResource(
					  "/images/StrategoBackground/StrategoBackground_"+
					  ((l*10+c)+1)+
					  ".gif")));;
				tabJButton[c][l].setBorder(BorderFactory.createEmptyBorder());
				tabJButton[c][l].addActionListener(this);
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = c;
				gbc.gridy = l;
				
				contentPane.add(tabJButton[c][l], gbc);
			}
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MesJButton monJButton = (MesJButton)e.getSource();
		System.out.println("On a cliqué en "+monJButton);
	}

}
