package bataille;

import java.util.ArrayList;

public class Joueur {
	
	
	private ArrayList<Carte> MesCartes = new ArrayList<Carte>();
	private int compteur;
	
	
	public Joueur(){
		
		compteur=0;
	}
	
	public void tireunecarte(Carte carte){
		
		MesCartes.add(carte);
		
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public Carte getCartes(int i){
		
		return MesCartes.get(i);
	}


	public int getCompteur() {
		return compteur;
	}


	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	 
	

}
