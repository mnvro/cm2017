package semaine6_interfacesOO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaJFrameJButton extends JFrame {
	JButton monJButton;
	public MaJFrameJButton() {
		this.setVisible(true);
		this.setBounds(10,15,200,100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		monJButton = new JButton("OK");
		this.getContentPane().add(monJButton);
	}
	public static void main(String[] args) {
		MaJFrameJButton maJFrameJButton = new MaJFrameJButton();
	}
}
