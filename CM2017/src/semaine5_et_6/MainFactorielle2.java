package semaine5_et_6;

import javax.swing.JOptionPane;

public class MainFactorielle2 {
	/**
	 * Cette méthode calcule la factorielle de n
	 * @param n : un entier
	 * @return Si n >= 0 : renvoie n!, sinon, renvoie -1
	 */
	public static int factorielle(int n){
		if(n==1 || n==0)
			return 1;
		else if(n>1)
			return n*factorielle(n-1);
		else
			return -1;
	}

	public static void main(String args[]){
		int i = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Nombre dont on veut la factorielle ?"));
		JOptionPane.showMessageDialog(null, factorielle(i));
	}

}
