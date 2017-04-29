package semaine6_interfacesOO;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MaJFrame2 extends JFrame implements MouseListener {
	
	public MaJFrame2(int largeurPixels, int hauteurPixels){
		this.setBounds(20,15,largeurPixels,hauteurPixels);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Bonjour tout le monde");
		this.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		System.out.println("height = "+height+" width = "+width);
		MaJFrame2 maJFrame2 = new MaJFrame2(
				Integer.parseInt(JOptionPane.showInputDialog(
						"Largeur")),
				Integer.parseInt(JOptionPane.showInputDialog(
						"Hauteur")));
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué en ("+e.getX()+","+e.getY()+")");
	}
	public void mouseEntered(MouseEvent e) {
//		System.out.println("on est entré");
	}
	public void mouseExited(MouseEvent e) {
//		System.out.println("on est sorti");
	}
	public void mousePressed(MouseEvent e) {
//		System.out.println("on a appuyé");
	}
	public void mouseReleased(MouseEvent e) {
//		System.out.println("on a relâché");
	}
	
}
