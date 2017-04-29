package semaine2;
import javax.swing.JOptionPane;

public class Etudiant2 {
	private String nom;
	private String prenom;
	private int nbCalculs = 0;
	private int nbOK = 0;
	
	public double moyenne(){
		return ((double)nbOK)/nbCalculs;
	}

	public static void main(String[] args) {
		
		// 1. il faut toujours créer un instance
		Etudiant2 et = new Etudiant2();
		
		// 2. je mets à jour les variables d'instance nom et prénom
		et.nom = JOptionPane.showInputDialog("Quel est ton nom?");
		et.prenom = JOptionPane.showInputDialog("Quel est ton prénom?");
		
		// dans une boucle, je propose tous les calculs
		for (int i = 0 ; i < 3 ; i++){
			
			// Je choisis aléatoirement deux valeurs arg1 et arg2
			int arg1 = (int)(Math.random()*20);
			int arg2 = (int)(Math.random()*20);
			
			// J'affiche le calcul dans un popup et attends la réponse que je range dans rep
			// showInputDialog me retourne une string. Il faudra la convertir en int
			int rep = Integer.parseInt(JOptionPane.showInputDialog(arg1+" + "+arg2+" = "));
			
			// l'étudiant a reçu un calcul en plus
			et.nbCalculs++;
			if (rep == arg1+arg2){
				// l'étudiant a une bonne réponse de plus
				et.nbOK++;
			}
		}
		
		// A la fin j'affiche Durant Toto tu as trouvé x réponses sur y
		JOptionPane.showMessageDialog(null, et.nom +" "+et.prenom+
				" tu as "+et.moyenne()*100+" %"
		);
	}

}
