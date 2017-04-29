package semaine1;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		et.setNom("Durand");
		et.setPrenom("Toto");
		et.setNum(5);
		et.affiche();
		//System.out.println("Nom : "+et.getNom());
		
		Livre l = new Livre(); 
		l.setAuteur(et.getNom());
		l.setTitre(", \"A la recherche du temps perdu\", ");
		l.setNbPages(1500);
		l.affiche();
	}

}
