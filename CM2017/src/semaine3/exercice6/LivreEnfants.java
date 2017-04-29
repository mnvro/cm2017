package semaine3.exercice6;

public class LivreEnfants extends Livre {
	private int ageMin;
	private int ageMax;
	public LivreEnfants() {
	}

	public LivreEnfants(String titre, String auteur, int nbPages, int ageMin, int ageMax) {
		super(titre, auteur, nbPages, "Livre pour enfant");
		this.ageMin = ageMin;
		this.ageMax = ageMax;
	}

	@Override
	public String toString() {
		return  super.toString() +", de " + ageMin + " ans à " + ageMax +  " ans";
	}

	public static void main(String[] args) {
		LivreEnfants le = new LivreEnfants(
				"T'choupi va à l'école", "Thierry Courtin", 32, 0, 2);
		Livre l = new Livre("Programmer en Java","Claude Delannoy", 916, "Informatique");
		System.out.println(le);
		System.out.println(l);
		LivreEnfants le2 = new LivreEnfants("La couleur des émotions","Anne Llenas",20,3,5);
		Livre l2 = new Livre("L'étranger", "Albert Camus", 191, "Roman");
		Livre l3 =  new Livre("101 expériences de philosophie quotidienne", "Roger-Pol Droit", 
				259, "Philosophie");
		System.out.println(le2);
		System.out.println(l2);
		System.out.println(l3);
		//System.out.println("âge minimum pour ce livre : "+((LivreEnfants)l3).ageMin); // classCastException
		Livre l4 = new LivreEnfants("La couleur des émotions","Anne Llenas",20,3,5);
		System.out.println(l4);
		System.out.println("âge minimum pour ce livre : "+((LivreEnfants)l4).ageMin);
	}

}
