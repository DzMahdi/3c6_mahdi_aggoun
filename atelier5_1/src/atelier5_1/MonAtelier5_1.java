package atelier5_1;

import atelier5_1.ListeJavaNaive;
import tutoriels.atelier5_1.Atelier5_1;
import tutoriels.atelier5_1.TesteurDeListe;
import tutoriels.liste.ListeJava;

public class MonAtelier5_1 extends Atelier5_1 {

	@Override
	public ListeJava<Character> fournirListeArray() {
		// TODO Auto-generated method stub
		return new ListeJavaArray<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeNaive() {
		// TODO Auto-generated method stub
		return new ListeJavaNaive<Character>(Character.class);
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeArray() {
		// TODO Auto-generated method stub
		return new TesteurDeListeArray();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeNaive() {
		// TODO Auto-generated method stub
		return new TesteurDeListeNaive();
	}
	
	public static void main(String[] args) {
		new MonAtelier5_1().valider();
	}

}
