package semaine4;

public class IP extends TrenteDeuxBits {
	
	public char getClasse(){
		if (valeur >>> 31 == 0) return 'A';
		if (valeur >>> 30 == 2) return 'B';
		
		return 'Z';
	}

	public IP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
