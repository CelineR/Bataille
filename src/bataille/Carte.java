package bataille;

public class Carte {

	private static String tabColor[] = {"pique", "carreau", "trefle", "coeur"};
	private static int tabvaleur[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13 } ;
	
	private  String Color;
	private  int valeur;
	
	
	public Carte (String C, int v){
		
				this.Color= C;
				this.valeur= v;
		
	}
	
	public String getColor(){
		
		return Color;
	}
	
	public int getValeur(){
		
		
		return valeur;

	}
	
	public boolean Comparateur(Carte carte){
		
		  
		  return this.valeur>carte.valeur;


	}
	
	public static String[] getTabColor(){
		
		return tabColor;
	}
	
	public static int[] getTabValeur(){
		
		return tabvaleur;
	}
}
