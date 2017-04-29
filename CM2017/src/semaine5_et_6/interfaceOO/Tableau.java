package semaine5_et_6.interfaceOO;

public class Tableau {
	public static void affiche(Affichable tab[]){
		for (int i = 0; i < tab.length; i++) {
			tab[i].affiche();
		}
	}
	public static void main(String[] args) {
		Etu tabEtu[] = new Etu[5];
		for (int i = 0; i < tabEtu.length; i++) {
			tabEtu[i]= new Etu("Vroman",new Date("30/12/1969"));
		}
		Tableau.affiche(tabEtu);
	}
}
