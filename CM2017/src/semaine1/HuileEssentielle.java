package semaine1;

public class HuileEssentielle {
	String nom;
	double conditionnement;
	double prix;
	
	void affiche(){
		System.out.println(nom+" "+conditionnement+ " ml "+
				prix+ " euros"
		);
	}
	public static void main(String[] args) {
		HuileEssentielle h1 = new HuileEssentielle();
		h1.nom = "Laurier";
		h1.conditionnement = 10;
		h1.prix=5.5;
		
		HuileEssentielle h2 = new HuileEssentielle();
		h2.nom = "Basilic";
		h2.conditionnement = 10;
		h2.prix=2.7;
		
		h1.affiche();
		h2.affiche();
		
	}
}
