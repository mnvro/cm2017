package semaine2;

public class Livre {
	private String auteur;
	private String titre;
	private int nbPages;
	
	public Livre(String auteur, String titre, int nbPages) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
	}
	
	public Livre() {
	}

	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	public void affiche(){
		System.out.println(auteur+" "+titre+" "+nbPages+ " pages");
	}
	public static void main(String[] args) {
		Livre l1 = new Livre();
		l1.auteur = "Delannoy";
		l1.titre = "Programmer en java";
		l1.nbPages = 816;
		l1.affiche();
		
		Livre l2 = new Livre("Game of Thrones","George R. R. Martin",476);
		l2.affiche();
		
	}

}
