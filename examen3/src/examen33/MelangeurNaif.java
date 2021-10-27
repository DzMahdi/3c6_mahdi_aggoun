package examen33;

import java.util.Collection;
import java.util.Random;

import tutoriels.gr1gr2.Liste;
import tutoriels.gr1gr2.Melangeur;

public class MelangeurNaif<C extends Comparable<C>> implements Melangeur<C> {
	
	
	private Random alea = new Random();
	
	
	@Override
	public Liste<C> melanger(Liste<C> entree) {

		

		Liste<C> liste = new Liste<C>();

		int index;

		for (int i = entree.longueur() - 1; i > 0; i--) {

			index = alea.nextInt(i + 1);
			liste.ajouter(entree.obtenirValeur(index));

		}

		return liste;
	}

}
