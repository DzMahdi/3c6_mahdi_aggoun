package tutoriel5_1;

import tutoriels.liste.ListeJava;
import tutoriels.tutoriel5_1.TesteurDeListe;
import tutoriels.tutoriel5_1.Tutoriel5_1;

public class MonTutoriel5_1 extends Tutoriel5_1 {

	@Override
	public ListeJava<Character> fournirListeNaive() {
		// TODO Auto-generated method stub
		return new ListeJavaNaive<Character>(Character.class);
	}

	@Override
	public TesteurDeListe fournirTesteurDeListeNaive() {
		// TODO Auto-generated method stub
		return new TesteurDeListeNaive();
	}

	public static void main(String[] args) {
		new MonTutoriel5_1().valider();
	}

}
