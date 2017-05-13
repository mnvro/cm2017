package semaine2;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Etudiant3 {
	private String nom;
	private String prenom;
	private int num;
	private double resultats[] = new double [5];
 
	public void encode(){
	  for (int i=0 ; i<5 ; i++){
	    do{
		  resultats[i]= Double.parseDouble(
			JOptionPane.showInputDialog("quel est le résultat à l'interro numéro "+(i+1)+" (/20) : ")
		  );
		  if ((resultats[i]<0)||(resultats[i]>20))
		    JOptionPane.showMessageDialog(null, "Valeur erronnée","Attention",0);
		}while ((resultats[i]<0)||(resultats[i]>20));
	  }
	}

	public double moyenne(){
		double somme = 0;
		for (int i=0;i<5;i++){
			somme += resultats[i];
		}
		return somme/5;
	}

	public String toString(){
		String s;
		s =  nom+" "+ prenom+" num : "+num+" \n\t[";
		for (int i=0 ; i<4 ; i++){
			s += resultats[i]+"/20, ";
		}
		s += resultats[4]+"/20] \n\tmoyenne: ";
		s+=moyenne()+"/20";
		return s;
	}

	
//	public String toString() {
//		return "Etudiant3 [nom=" + nom + ", prenom=" + prenom + ", num=" + num + ", resultats="
//				+ Arrays.toString(resultats) + ", moyenne()=" + moyenne() + "]";
//	}

	public static void main(String[] args) {
		Etudiant3 et = new Etudiant3();
		et.nom = "Vroman";
		et.prenom = "Marie";
		et.num = 5;
		et.encode();
		System.out.println(et);
		JOptionPane.showMessageDialog(null, et.toString());

	}

}
