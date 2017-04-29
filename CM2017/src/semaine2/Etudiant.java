package semaine2;
public class Etudiant {
	private String nom;
	private String prenom;
	private int num;
	
	public Etudiant(){
	}
	
	public Etudiant(String nom, String prenom, int num) {
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
	}

	public void affiche(){
		System.out.println(nom+" "+prenom+" "+num);
	}
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.nom = "Durand";
		et1.prenom = "Toto";
		et1.num = 5;
		et1.affiche();
		
		Etudiant et2 = new Etudiant("Vroman","Marie",6);
		et2.affiche();
	}
}

