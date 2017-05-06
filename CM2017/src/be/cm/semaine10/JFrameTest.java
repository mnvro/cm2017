package be.cm.semaine10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class JFrameTest extends JFrame implements ActionListener {

	private JPanel contentPane;
	private int nbLignes = 5;
	private int nbColonnes = 3;
	private JButton[][] tabJButton = new JButton[nbColonnes][nbLignes];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTest frame = new JFrameTest();
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
	public JFrameTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int c = 0 ; c < nbColonnes ; c++){
			for (int l = 0 ; l < nbLignes; l++){
				tabJButton[c][l] = new JButton("("+c+","+l+")");
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
		System.out.println("on a cliqué en "+e.getActionCommand());	
	}

}
