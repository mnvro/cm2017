package semaine5_et_6.forme;

public class Carre extends Shape {
	private double cote;
	public Carre(String mesureDeReference, int abscisse, int ordonnee, double cote) {
		super(mesureDeReference, abscisse, ordonnee);
		this.cote = cote;
	}

	@Override
	public double surface() {
		return cote*cote;
	}

	@Override
	public double perimetre() {
		return cote*4;
	}

	@Override
	public void agrandit(int facteur) {
		cote *= facteur;
	}

	

}
