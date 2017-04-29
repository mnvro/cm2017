package semaine5_et_6;

public class Rectangle extends FormeGeometrique {
	private double largeur;
	private double longueur;
	public Rectangle() {
	}
	public Rectangle(double largeur, double longueur, String mersureDeReference) {
		super(mersureDeReference);
		double temp;
		if (largeur >longueur){
			temp = largeur;
			largeur = longueur;
			longueur = temp;
		}
		this.largeur = largeur;
		this.longueur = longueur;
	}
	@Override
	public double aire() {
		return largeur*longueur;
	}
	@Override
	public double perimetre() {
		return (largeur+longueur)*2;
	}
	@Override
	public String toString() {
		String s = "largeur = "+largeur+" "+mesureDeReference+
				" longueur = "+longueur+" "+mesureDeReference+"\n";
		s+= super.toString();
		return s;
	}
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,6,"m");
		System.out.println(rectangle);		
	}
}
