package semaine5_et_6.interfaceOO;

import java.util.Arrays;

/**
 * @author mnv
 *
 */
public class Etu implements Affichable, Comparable<Etu> {
	private int num;
	private String nom;
	private static int nbEtu=0;
	private Date dateNaissance;
	/**
	 * Constructeur qui ...
	 * @param nom le nom de la personne
	 * @param dateNaissance la date de naissance de l'étudiant
	 */
	public Etu(String nom,Date dateNaissance){
		num = ++nbEtu;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	public String toString() {
		return "Num : "+num+" Nom : "+nom+ " "+dateNaissance.toString();
	}
	public void affiche() {
		System.out.println(this.toString());
	}
	@Override
	public int compareTo(Etu et) {
		// TODO Auto-generated method stub
		return this.dateNaissance.compareTo(et.dateNaissance);
	}
	public static void main(String[] args) {
//		Ayoub	08-12-1974
//		EL MOSTAFA	25-08-1975
//		Thibault	24-03-1985
//		Younes	03-05-1985
//		Karim	15-02-1990
//		VAN GRUNDERBEEK	Mickaël	29-07-1988


		Etu tabEtu[] = {
			new Etu("Ayoub",new Date("8/12/1974")),
			new Etu ("Vroman",new Date("30/12/1969")),
			new Etu("Karim",new Date("15/02/1990")),
			new Etu("Younes",new Date("03/05/1985")),
			new Etu("Thibault", new Date("24/03/1985")),
			new Etu("El Mostafa", new Date("25/08/1975")),
			new Etu("Michkaël", new Date("29/7/1988"))
		};
		System.out.println("Avant le tri\n=======");
		Tableau.affiche(tabEtu);
		Arrays.sort(tabEtu);
		System.out.println("Après le tri\n=======");
		Tableau.affiche(tabEtu);
	}
}
