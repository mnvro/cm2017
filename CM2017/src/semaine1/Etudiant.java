package semaine1;

public class Etudiant {
	
	// *********************** Les variable d'instance
	private String nom;
	private String prenom;
	private int num;
	
	// ********************** Le constructeur
	public Etudiant(){
	}
	
	// ********************** Les getteurs et les setteurs
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	// ******************** Les méthodes
	public void affiche(){
		System.out.println(nom+" "+prenom+" "+num);
	}
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.nom = "Durand";
		et1.prenom = "Toto";
		et1.num = 5;
		et1.affiche();

		Etudiant et2 = new Etudiant();
		et2.nom = "Vroman";
		et2.prenom = "Marie";
		et2.num = 6;
		et2.affiche();
	}
}

