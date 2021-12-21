package examen5;

import tutoriels.examen_gr2.Examen5Gr2;
import tutoriels.liste.ListeJava;

public class MonExamen5 extends Examen5Gr2 {
	
	
	public static void main(String[] args) {
		(new MonExamen5()).valider();
	}

	@Override
	public ListeJava<Character> fournirListeArray() {
		// TODO Auto-generated method stub
		return new MaListeArray<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeGaucheDroite() {
		// TODO Auto-generated method stub
		return new MaListeArray<Character>(Character.class);
	}

}
