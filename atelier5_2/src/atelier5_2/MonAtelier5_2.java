package atelier5_2;

import tutoriels.atelier5_2.Atelier5_2;
import tutoriels.liste.ListeJava;
import tutoriels.liste.TesteurDeListe;

public class MonAtelier5_2 extends Atelier5_2 {
	
	
	@Override
	public ListeJava<Character> fournirListeArray() {
		// TODO Auto-generated method stub
		return new ListeJavaArray<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeChaineeDouble() {
		// TODO Auto-generated method stub
		return new ListeJavaChaineeDouble<Character>(Character.class);
	}

	@Override
	public ListeJava<Character> fournirListeChaineeSimple() {
		// TODO Auto-generated method stub
		return new ListeJavaChaineeSimple<Character>(Character.class);
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeArray() {
		// TODO Auto-generated method stub
		return new TesteurDeListeArray();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeDouble() {
		// TODO Auto-generated method stub
		return new TesteurDeListeChaineeDouble();
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeSimple() {
		// TODO Auto-generated method stub
		return new TesteurDeListeChaineeSimple();
	}

	public static void main(String[] args) {
		(new MonAtelier5_2()).valider();
	}

}
