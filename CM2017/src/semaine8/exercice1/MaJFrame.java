package semaine8.exercice1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaJFrame extends JFrame 
implements MouseListener {
	public MaJFrame(){
		this.setVisible(true);
		this.setBounds(100,100,500,400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addMouseListener(this);
	}
	public static void main(String[] args) {
		MaJFrame maJFrame = new MaJFrame();
	}
	public void mouseClicked(MouseEvent e) {System.out.println("on a cliqué");}
	public void mouseEntered(MouseEvent e) {System.out.println("on est entré");}
	public void mouseExited(MouseEvent e) {System.out.println("on est sorti");}
	public void mousePressed(MouseEvent e) {System.out.println("on a appuyé");}
	public void mouseReleased(MouseEvent e) {System.out.println("on a lâché");}
}
