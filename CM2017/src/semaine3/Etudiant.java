package semaine3;

import java.util.Arrays;

public class Etudiant {
	private static String branches[] = {"Latin","Français","Mathématique"};
	private String nom;
	private String prenom;
	private static int cmpt;
	private int resultats[] = new int[3];

	private double moyenne(){
		double somme = 0;
		for (int i = 0; i < resultats.length; i++) {
			somme += resultats[i];
		}
		return somme/resultats.length;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", resultats=" + Arrays.toString(resultats)
				+ ", moyenne()=" + (int)(moyenne()*5) + "%";
	}






	public int compareTo(Etudiant unAutreEtudiant) {
		return (int)(this.moyenne()-unAutreEtudiant.moyenne());

	}

	public Etudiant(){
		nom = "Nom"+ (++cmpt);
		prenom = "Prénom"+ cmpt;
		for (int i = 0; i < resultats.length; i++) {
			resultats[i]= (int)(Math.random()*20);	
		}
	}
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		Etudiant et2 = new Etudiant();
		Etudiant et3 = new Etudiant();
		Etudiant et4 = new Etudiant();
		System.out.println(et1);
		System.out.println(et2);
		System.out.println(et3);
		System.out.println(et4);
		if (et1.compareTo(et2)<0){
			System.out.println(et1 + " est moins bon que "+et2);
		}else{
			System.out.println(et1+ " est meilleur que "+ et2);
		}
	}
}
