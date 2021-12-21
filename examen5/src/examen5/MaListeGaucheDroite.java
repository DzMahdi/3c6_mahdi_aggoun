package examen5;

import java.util.Iterator;

import tutoriels.examen_gr2.ElementListeGaucheDroite;
import tutoriels.examen_gr2.ListeGaucheDroite;

public class MaListeGaucheDroite <V extends Object> extends ListeGaucheDroite<V>{
	
	ElementListeGaucheDroite<V> gauche = null;
	ElementListeGaucheDroite<V> droite = null;
	
	int tailleGauche = 0;
	int tailleDroite = 0;

	public MaListeGaucheDroite(Class<V> typeValeur) {
		super(typeValeur);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ElementListeGaucheDroite<V> atteindreElement(int indiceListe) {
		
		ElementListeGaucheDroite<V> element = gauche;
		
		for (int i = 0; i < indiceListe; i++) {
			if (element != null) {
				element = element.getNext();
			}
		}		
		
		return element;
	}

	@Override
	protected void decalerVersLaGauche() {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			
		}
	}

	@Override
	protected int indiceGauche(int indiceListe) {

		
		return indiceListeAPartirIndiceGauche(indiceListe);
	}

	@Override
	protected int indiceListeAPartirIndiceDroite(int indiceDroite) {
		// TODO Auto-generated method stub
		return indiceListeAPartirIndiceDroite(indiceDroite);
	}

}
