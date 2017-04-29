package semaine5_et_6.forme;

public class Cercle extends Shape {
	private double rayon;

	public Cercle(String mesureDeReference, int abscisse, int ordonnee, int rayon) {
		super(mesureDeReference, abscisse, ordonnee);
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public double perimetre() {
		return 2*Math.PI*rayon;
	}

	@Override
	public void agrandit(int facteur) {
		rayon *= facteur;
		// rayon = rayon * facteur;
		
	}

}
