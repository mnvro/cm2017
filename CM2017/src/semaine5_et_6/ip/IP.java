package semaine5_et_6.ip;

public class IP extends TrenteDeuxBits {
	
	public char getClasse(){
		if (valeur >>> 31 == 0) return 'A'; // le premier bit vaut 0
		if (valeur >>> 30 == 2) return 'B'; // les 2 premiers bits valent 10
		if (valeur >>> 29 == 6) return 'C'; // les 3 premiers bits valent 110
		if (valeur >>> 28 == 14) return 'D'; // les 4 premiers bits valent 1110
		if (valeur >>> 27 == 30) return 'E'; // les 5 premiers bits valent 11110
		return 'Z';
	}
	public IP getNetwork(){
		IP ip = new IP();
		Masque masque = this.getDefaultMask();
		int entier = this.getValeur() & masque.getValeur();
		ip.setValeur(entier);
		return ip;
	}
	public IP getBroadcast(){
		IP ip = new IP();
		Masque masque = this.getDefaultMask();
		int entier = this.getValeur() | ~masque.getValeur();
		ip.setValeur(entier);
		return ip;
	}
	public boolean isPrivate(){
		if (this.getOct1() == 10) return true;
		if (this.getOct1() == 172 && this.getOct2() >= 16 && this.getOct2()<=31) return true;
		if (this.getOct1() == 192 && this.getOct2() == 168) return true;
		return false;
	}
	
	public Masque getDefaultMask(){
		if (getClasse()=='A')
			return new Masque(8);
		if (getClasse()=='B')
			return new Masque(16);
		if (getClasse()=='C')
			return new Masque(24);
		return new Masque(0);
	}

	public IP() {
		// TODO Auto-generated constructor stub
	}

	public IP(String ipString) {
		super(ipString);
	}

	public static void main(String[] args) {
		IP ip = new IP("192.168.0.1");
		System.out.println("privé ? "+ip.toString()+" "+ip.isPrivate());
		System.out.println("masque par défaut : "+ip.getDefaultMask());
		System.out.println("Adresse réseau : "+ip.getNetwork());
		System.out.println("Adresse de broadcast : "+ip.getBroadcast());
		
		ip = new IP("172.168.0.1");
		System.out.println("privé ? "+ip.toString()+" "+ip.isPrivate());
		System.out.println("masque par défaut : "+ip.getDefaultMask());
		System.out.println("Adresse réseau : "+ip.getNetwork());
		System.out.println("Adresse de broadcast : "+ip.getBroadcast());
		
		ip = new IP("172.17.0.1");
		System.out.println("privé ? "+ip.toString()+" "+ip.isPrivate());
		System.out.println("masque par défaut : "+ip.getDefaultMask());
		System.out.println("Adresse réseau : "+ip.getNetwork());
		System.out.println("Adresse de broadcast : "+ip.getBroadcast());
		
		ip = new IP("11.17.0.1");
		System.out.println("privé ? "+ip.toString()+" "+ip.isPrivate());
		System.out.println("masque par défaut : "+ip.getDefaultMask());
		System.out.println("Adresse réseau : "+ip.getNetwork());
		System.out.println("Adresse de broadcast : "+ip.getBroadcast());

	}

}
