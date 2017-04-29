package semaine8.exercice1;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MaJFrame1 extends JFrame {
	public MaJFrame1(int largeur, int hauteur){
		this.setVisible(true);
		this.setBounds(20,15,largeur,hauteur);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ma toute première JFrame");
	}
	
	public static void main(String[] args) {
		String rep = JOptionPane.showInputDialog("Largeur de la JFrame à créer: ");
		int largeur = Integer.parseInt(rep);
		rep = JOptionPane.showInputDialog("Hauteur de la JFrame à créer: ");
		int hauteur = Integer.parseInt(rep);
		MaJFrame1 maJframe1 = new MaJFrame1(largeur, hauteur);
		// pour centrer : 
//		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
//		int height = (int)dimension.getHeight();
//		int width  = (int)dimension.getWidth();
//		int x = width/2 - largeur/2;
//		int y = height/2 - hauteur/2;
//		maJframe1.setBounds(x,y,largeur,hauteur);
	}
}
