
package semaine3.exercice5;

public class Employe extends Personne {
	private double salaire;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, Date dateNaissance, double salaire) {
		super(nom, prenom, dateNaissance);
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", salaire=" + salaire ;
	}

	public static void main(String[] args) {
		Date d = new Date("30/12/1969");
		Personne p = new Personne("Vroman","MN",d);
		Etudiant et = new Etudiant("Castiaux", "Julien", new Date("1/3/1997"));
		Employe emp = new Employe("Castiaux", "Laurane", new Date ("12/9/1998"), 1500);
		System.out.println(p);
		System.out.println(et);
		System.out.println(emp);
	}


}
