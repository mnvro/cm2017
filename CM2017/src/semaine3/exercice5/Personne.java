package semaine3.exercice5;

public class Personne {
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "";
	}
	public Personne(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne() {
		super();
	}
	
	
	

}
