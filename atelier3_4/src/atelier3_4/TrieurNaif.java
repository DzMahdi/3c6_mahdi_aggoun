package atelier3_4;

import java.util.Iterator;	

import tutoriels.atelier3_4.MonTableau;
import tutoriels.atelier3_4.Tableau;
import tutoriels.atelier3_4.Trieur;

public class TrieurNaif<C extends Comparable<C>> implements Trieur<C>{
	
	
	private C valeurMinimale(Tableau<C> tableau) {
	
		C min = null;
		
			if (tableau.longueur() > 0) {
				min = tableau.obtenirValeur(0);
			}
			
			for (int i = 0; i < tableau.longueur(); i++) {
				if (tableau.obtenirValeur(i).compareTo(min) < 0) {	
						min = tableau.obtenirValeur(i);
				}
			}
		
	
		return min;
	}
	

	
	
		
		

	@Override
	public Tableau<C> trier(Tableau<C> entree) {
		
		Tableau<C> resultat = new MonTableau<C>();
		
		while(entree.siVide() != true) {
			
			C valeur = valeurMinimale(entree);
			entree.retirer(valeur);
			resultat.ajouter(valeur);
			
			
		}
			
		
		
		return resultat;
	}

}
