package semaine3;

public class Cercle {
	private double rayon;
	public double aire(){
		return Math.PI*rayon*rayon;
	}
	public double perimetre(){
		return 2*Math.PI*rayon;
	}	
	public String toString() {
		return "rayon = " + rayon + " m, aire() = " + aire() + " m², perimetre() = " + perimetre() + " m";
	}
	public static void main(String[] args) {
		Cercle c = new Cercle();
		c.rayon = 1;
		System.out.println(c);
	}
}
