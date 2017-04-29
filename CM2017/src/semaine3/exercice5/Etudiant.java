package semaine3.exercice5;

public class Etudiant extends Personne {
	private int num;
	private static int nbEtu;
	public Etudiant(String nom, String prenom, Date dateNaissance) {
		super(nom, prenom, dateNaissance);
		this.num = ++nbEtu;
	}
	public Etudiant() {
		super();
		this.num = ++nbEtu;
	}
	@Override
	public String toString() {
		return super.toString() +", num=" + num ;
	}
	
	
	
	
}
