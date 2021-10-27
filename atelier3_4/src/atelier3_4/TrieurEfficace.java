package atelier3_4;

import java.io.Console;
import java.util.Iterator;

import tutoriels.atelier3_4.MonTableau;
import tutoriels.atelier3_4.Tableau;
import tutoriels.atelier3_4.Trieur;

public class TrieurEfficace<C extends Comparable<C>> implements Trieur<C> {

	@Override
	public Tableau<C> trier(Tableau<C> entree) {
		// TODO Auto-generated method stub

		Tableau<C> resultat = null;

		if (entree.longueur() <= 1) {
			resultat = entree;
		} else {

			resultat = diviserTab(entree);
			trier(entree);
			
		}

		return resultat;

	}

	private Tableau<C> diviserTab(Tableau<C> entree) {

		Tableau<C> resultat;

		int longueur = entree.longueur();
		
		int milieu = longueur / 2;

		Tableau<C> gauche = tab(entree, 0, milieu - 1);
		Tableau<C> droite = tab(entree, milieu, longueur -1);

		gauche = diviserTab(gauche);
		droite = diviserTab(droite);

		resultat = fusionner(gauche, droite);

		return resultat;
	}

	private Tableau<C> tab(Tableau<C> entree, int debut, int fin) {

		Tableau<C> resultat = new MonTableau<C>();

		for (int i = debut; i < fin; i++) {
			resultat.ajouter(entree.obtenirValeur(i));

		}

		return resultat;
	}

	public Tableau<C> fusionner(Tableau<C> gauche, Tableau<C> droite) {

		Tableau<C> resultat = fusionnerTab(gauche, droite);

		resultat = fusionnerElement(gauche, resultat);
		resultat = fusionnerElement(droite, resultat);

		return resultat;

	}

	private Tableau<C> fusionnerElement(Tableau<C> source, Tableau<C> destination) {
		while (source.siVide() != true) {

			source.retirer(0);

		}
		return destination;
	}

	private Tableau<C> fusionnerTab(Tableau<C> gauche, Tableau<C> droite) {

		Tableau<C> resultat = new MonTableau<>();

		while (!gauche.siVide() && !droite.siVide()) {

			if (gauche.obtenirValeur(0).compareTo(droite.obtenirValeur(0)) < 0) {
				resultat = fusionnerDebutElement(gauche, resultat);
			} else {
				resultat = fusionnerDebutElement(droite, resultat);
			}

		}

		return resultat;
	}

	private Tableau<C> fusionnerDebutElement(Tableau<C> gauche, Tableau<C> droite) {

		Tableau<C> resultat = new MonTableau<>();
		
		for(int i = 0; i < gauche.longueur() + droite.longueur(); i++) {
		resultat.ajouter(gauche.obtenirValeur(i));
		gauche.retirer(i);	
		
		}
		
		
		
		return resultat;

	}

}
	

