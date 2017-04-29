package semaine8.exercice1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaJFrameV2 extends JFrame implements MouseListener {
	  public MaJFrameV2(){
	    this.setVisible(true);
	    this.setTitle("Ma première fenêtre");
	    this.setBounds(100,200,400,200);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.addMouseListener(this);
	  }
	  public static void main(String[] args) {
	    MaJFrameV2 maJFrame = new MaJFrameV2();
	  }
	  public void mouseClicked(MouseEvent e) {
	        int x = e.getX() ;
	        int y = e.getY() ;
	    System.out.println ("clic au point de coordonnées " + x + ", " + y ) ;
	  }
	  public void mouseEntered(MouseEvent e) {}
	  public void mouseExited(MouseEvent e) {}
	  public void mousePressed(MouseEvent e) {}
	  public void mouseReleased(MouseEvent e) {}
	}

