package examen5;

import java.util.Iterator;

import tutoriels.examen_gr2.ListeArray;

public class MaListeArray<V extends Object> extends ListeArray<V> {

	private final int TAILLE_INITIALE = 1;

	V[] grosTableau = nouveauTableau(TAILLE_INITIALE);
	int indicePremierElement;
	int indiceDernierElement;

	public MaListeArray(Class<V> typeValeur) {
		super(typeValeur);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void decalerADroite(int indiceDebut, int indiceFin) {
		
		
		for (int i = indiceDebut; i <= grosTableau.length -1; i++) {
			
			
		}
		
	}

	@Override
	protected boolean doitAgrandir() {
		
		if (indiceDernierElement > grosTableau.length) {
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	protected int indiceListe(int indiceGrosTableau) {

		
		
		return indiceGrosTableau;
	}

	@Override
	public void insert(int indiceListe, V valeur) {
		V[] nouveauElement = nouveauTableau(grosTableau.length + 1);

		copier(grosTableau, 0, indiceListe - 1, nouveauElement, 0);

		nouveauElement[indiceListe] = valeur;

		copier(grosTableau, indiceListe, grosTableau.length - 1, nouveauElement, indiceListe + 1);

		grosTableau = nouveauElement;

	}

	private void copier(V[] src, int debutSrc, int finSrc, V[] dst, int debutDst) {

		int decalage = debutDst - debutSrc;

		for (int i = debutSrc; i <= finSrc; i++) {
			dst[i + decalage] = src[i];
		}

	}

	@Override
	public void remove(int indiceListe) {
		V[] nouveauElement = nouveauTableau(grosTableau.length - 1);

		copier(grosTableau, 0, grosTableau.length - 1, nouveauElement, 0);

		copier(grosTableau, indiceListe + 1, grosTableau.length - 1, nouveauElement, indiceListe);

		grosTableau = nouveauElement;

	}

	@Override
	public int size() {

		int size = (indiceDernierElement - indicePremierElement) + 1;

		return size;
	}

}
