package semaine5_et_6;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class MainFactorielle3 {
	/**
	 * Cette méthode calcule la factorielle de n
	 * @param n : un entier
	 * @return Si n >= 0 : renvoie n!
	 * @exception une NonPositiveException est lancée
	 * si n est négatif.
	 */
	public static int factorielle(int n) throws NonPositiveException{
		if(n==1 || n==0)
			return 1;
		else if(n>1)
			return n*factorielle(n-1);
		else
			throw new NonPositiveException();
	}


	public static void main(String args[]){
		int i = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Nombre dont on veut la factorielle ?"));

		try {
			JOptionPane.showMessageDialog(null, factorielle(i));
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NonPositiveException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "blablabla");
		}


	}

}
