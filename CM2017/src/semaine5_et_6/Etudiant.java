package semaine5_et_6;

public class Etudiant implements Affichable,Comparable {
	private String nom;
	private String prenom;
	private int num;
	@Override
	public void affiche() {
		System.out.println("nom : "+nom+" prénom : "+prenom+" num : "+num);
	}
	@Override
	public int compareTo(Object unAutreEtudiant) {
		Etudiant et = (Etudiant)unAutreEtudiant;
		return this.num - et.num ;
	}

}
