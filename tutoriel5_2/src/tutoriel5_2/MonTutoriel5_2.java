package tutoriel5_2;

import tutoriels.liste.ListeJava;
import tutoriels.liste.TesteurDeListe;
import tutoriels.tutoriel5_2.Tutoriel5_2;

public class MonTutoriel5_2 extends Tutoriel5_2{

	@Override
	public ListeJava<Character> fournirListeChaineeSimple() {
		// TODO Auto-generated method stub
		return new ListeJavaChaineeSimple<Character>(Character.class);
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeSimple() {
		// TODO Auto-generated method stub
		return new TesteurDeListeChaineeSimple();
	}

	
	public static void main(String[] args) {
		new MonTutoriel5_2().valider();
	}
}
