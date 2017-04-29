package semaine5_et_6.ip;
public class TrenteDeuxBits {
	protected int valeur ;
	public TrenteDeuxBits(){
	}
	/**
	 * @param ipString l'adresse IP sous format chaîne de caractères 
	 * par exemple "192.168.0.1"
	 */
	public TrenteDeuxBits(String ipString){
		String octString[] = ipString.split("\\."); 
//		octString[] vaudra {"192","168","0","1"}
		int oct[] = new int[4]; 
//		oct[] vaudra {192,168,0,1}
		for (int i = 0; i < octString.length; i++) {
			oct[i]=Integer.parseInt(octString[i]);
		}
		valeur = (oct[0]<<24)+(oct[1]<<16)+(oct[2]<<8)+oct[3]; 
//		valeur vaudra 
//		11000000	10101000	00000000	00000001 en binaire 
//		et donc -1.616.117.760 en décimal  

	}	
	public int getOct1(){
		return valeur>>>24 ; 
	}
	public int getOct2(){
		return valeur>>16 & 0xFF ; // ou bien ‘& 255’
	}
	public int getOct3(){
		return valeur>>8 & 0xFF ;
	}
	public int getOct4(){
		return valeur & 0xFF ;
	}
	public String toString(){
		return getOct1()+"."+getOct2()+"."+getOct3()+"."+getOct4();
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}

