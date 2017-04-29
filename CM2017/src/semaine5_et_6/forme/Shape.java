package semaine5_et_6.forme;

public abstract class Shape implements Transformable {
	protected String mesureDeReference;
	private int identifiant;
	protected int abscisse;
	protected int ordonnee;
	private static int nbFormes=0;
	public abstract double surface();
	public abstract double perimetre();
	
	public Shape(String mesureDeReference, int abscisse, int ordonnee) {
		super();
		this.mesureDeReference = mesureDeReference;
		this.identifiant = ++nbFormes;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	
	public String getNom(){
		String s = this.getClass().getSimpleName();
		s += "-"+identifiant;
		return s;
	}
	@Override
	public String toString() {
		return getNom()+"\n("+abscisse+","+ordonnee+")\n"+
				"perimètre = "+perimetre()+" "+mesureDeReference+
				"\nsurface = "+surface()+" "+mesureDeReference+"²\n";		
	}
	@Override
	public void deplace(int deltaX, int detaY) {
		this.abscisse += deltaX;
		this.ordonnee += detaY;
	}
	public static void main(String[] args) {
		Carre carre = new Carre("m", 0, 0, 5);
		System.out.println(carre);
		Point point = new Point(5, 5);
		System.out.println(point);
		Cercle cercle = new Cercle("cm", 0, 0,5);
		System.out.println(cercle);
	}
}
