package semaine5_et_6;

import javax.swing.JOptionPane;

public class MainFactorielle {
	/**
	 * Cette méthode calcule la factorielle de n
	 * @param n : un entier positif
	 * @return renvoie n!
	 */
	public static int factorielle(int n){
		if(n==1 || n==0)
			return 1;
		else
			return n*factorielle(n-1);
	}

	public static void main(String args[]){
		int i = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Nombre dont on veut la factorielle ?"));
		JOptionPane.showMessageDialog(null, factorielle(i));
	}

}
