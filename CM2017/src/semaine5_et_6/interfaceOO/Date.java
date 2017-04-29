package semaine5_et_6.interfaceOO;
import java.util.Arrays;
public class Date implements Comparable<Date>, Affichable {
	private int aaaa;
	private int mm;
	private int jj;
	public Date(String s){
		String[] tabS = s.split("/");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}	
	public String toString(){
		return jj+"/"+mm+"/"+aaaa;
	}
	public int compareTo(Date date) {
		return (this.aaaa*10000+this.mm*100+this.jj)-
				(date.aaaa*10000+date.mm+date.jj);
	}
	public void affiche() {		System.out.println(this);	}	
	public static void main(String[] args) {
		Date [] tabDate = {new Date("30/12/1969"), new Date("3/05/1985"),
				new Date("24/03/1985"), new Date("8/12/1974"),
				new Date("15/02/1990"),new Date("25/08/1975")};
		System.out.println("Avant le tri\n=======");
		Tableau.affiche(tabDate);
		System.out.println("Après le tri\n=======");
		Arrays.sort(tabDate);
		Tableau.affiche(tabDate);
	}
}
