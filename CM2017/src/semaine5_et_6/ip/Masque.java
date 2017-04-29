package semaine5_et_6.ip;

public class Masque extends TrenteDeuxBits {

	public Masque() {
		// TODO Auto-generated constructor stub
	}

	public Masque(String ABCD) {
		super(ABCD);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nb1 le nombre de bits à 1 dans le masque 
	 * par exemple /8 ce qui va créer un masque égal à 255.0.0.0
	 */
	public Masque (int nb1){
		int entier = ~0; // 1111 1111 . 1111 1111 . 1111 1111 . 1111 1111
		entier = entier << 32-nb1; 
//		si nb1 vaut 8 alors on aura 
//		1111 1111 . 0000 0000 . 0000 00000 . 0000 0000
		setValeur(entier);
	}
}
