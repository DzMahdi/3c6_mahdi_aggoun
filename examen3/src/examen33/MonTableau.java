package examen33;
import tutoriels.gr1gr2.Tableau;

public class MonTableau<C extends Comparable<C>> implements Tableau<C> {

	private C[] valeurs;

	@Override
	public void initialiserTableau(C[] valeurs) {
		// TODO Auto-generated method stub
		this.valeurs = valeurs;
	}

	@Override
	public C valeurMaximale() {
		// TODO Auto-generated method stub
		C valeurMaximal = null;

		if (valeurs.length > 0) {
			valeurMaximal = valeurs[0];
		}
		
		for (int i = 1; i < valeurs.length; i++) {
			if (valeurs[i].compareTo(valeurMaximal) > 0) {
				valeurMaximal = valeurs[i];
			}
		}
		
		return valeurMaximal;
	}

}
