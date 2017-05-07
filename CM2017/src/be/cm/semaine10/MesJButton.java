package be.cm.semaine10;

import javax.swing.JButton;

public class MesJButton extends JButton {
	private int colonne;
	private int ligne;
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public MesJButton(int colonne, int ligne) {
		super();
		this.colonne = colonne;
		this.ligne = ligne;
	}
	@Override
	public String toString() {
		return "("+ colonne + "," + ligne + ")";
	}
	
	

}
