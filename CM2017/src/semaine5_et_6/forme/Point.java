package semaine5_et_6.forme;

public class Point extends Shape {

	public Point(int abscisse, int ordonnee) {
		super("m", abscisse, ordonnee);
	
	}

	@Override
	public double surface() {
		return 0;
	}

	@Override
	public double perimetre() {
		return 0;
	}

	@Override
	public void agrandit(int facteur) {
	}

}
