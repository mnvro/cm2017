package semaine9.exercice1;

import java.util.ArrayList;

public class Etu {
	private String nom = "Vroman";
	private String prenom = "Toto";
	private ArrayList<Double> cotes = new ArrayList<Double>();
	
	public void ajouterCote(double cote){
		cotes.add(cote);
	}
	
	public double moyenne(){
		if (cotes.size() == 0) return 0;
		double somme = 0;
		for (Double d : cotes) {
			somme += d;
		}
		return somme/cotes.size();
	}
	
	public String toString(){
		String s="Voici les résultats\n=============\n\n";
		for (Double d : cotes) {
			s += d+"\n";
		}
		s += "\nmoyenne = "+moyenne();
		return s;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Double> getCotes() {
		return cotes;
	}

	public void setCotes(ArrayList<Double> cotes) {
		this.cotes = cotes;
	}
	
	
}
