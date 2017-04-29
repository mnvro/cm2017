package semaine3.exercice5;

import java.util.GregorianCalendar;

public class Date {
	
	private int jj;
	private int mm;
	private int aaaa;
	
	public Date(){
		super();
	}
	public Date(String s){
		super();
		String[] tabS = s.split("/");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}
	
	public String toString(){
		return jj+"/"+mm+"/"+aaaa;
	}
	
	public boolean estBissextile(){
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(this.aaaa);
	}
	public static void main(String[] args) {
		Date d1 = new Date("30/12/1969");
		System.out.println(d1);
		System.out.println("Cette année est une année bissextile? "+d1.estBissextile());
		Date d2 = new Date("30/12/2000");
		System.out.println(d2);
		System.out.println("Cette année est une année bissextile? "+d2.estBissextile());
		Date d3 = new Date("30/12/2016");
		System.out.println(d3);
		System.out.println("Cette année est une année bissextile? "+d3.estBissextile());
		
	}

}
