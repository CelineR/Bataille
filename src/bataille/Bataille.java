package bataille;

import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Joueur J1 = new Joueur();
		Joueur J2 = new Joueur();
		
		ArrayList<Carte> Paquetcarte = new ArrayList<Carte>();
		
		for(int i=0;i<Carte.getTabColor().length;i++){
			
			 for(int j=0; j<Carte.getTabValeur().length; j++){
				 
				 		Paquetcarte.add(new Carte(Carte.getTabColor()[i], Carte.getTabValeur()[j]));
				 
			 }
				
		}
		
		Collections.shuffle(Paquetcarte);
		
		for(int k=0; k<Paquetcarte.size(); k=k+2){
			
			J1.tireunecarte(Paquetcarte.get(k));
			J2.tireunecarte(Paquetcarte.get(k+1));
			
		}
		
		
		for (int a=0; a<26;a++){
			
			
			if (J1.getCartes(a).Comparateur(J2.getCartes(a))){
				
				J1.setCompteur(J1.getCompteur() +1);
				
			}else{
				
				J2.setCompteur(J2.getCompteur() +1);

			}
				
			
		}
		
		
		if(J1.getCompteur()>J2.getCompteur()){
			
			System.out.println("Le Gagant est le J1 ! Il a :" + J1.getCompteur() +" points, Le J2 lui a: " + J2.getCompteur()+ " points");
		
		}else{
			
			System.out.println("Le Gagnant est le J2 ! Il a :" +J2.getCompteur() +" points, Le J1 lui a: "+ J1.getCompteur()+ " points");
		}

		
		

		
		
		


}

}