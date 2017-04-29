package semaine5_et_6;

public class Etudiant2 implements Affichable,Comparable<Etudiant2> {
	private String nom;
	private String prenom;
	private int num;
	@Override
	public void affiche() {
		System.out.println("nom : "+nom+" prénom : "+prenom+" num : "+num);
	}
	@Override
	public int compareTo(Etudiant2 unAutreEtudiant) {
		return this.num - unAutreEtudiant.num;
	}
}
