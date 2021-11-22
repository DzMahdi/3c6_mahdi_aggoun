package tutoriel4_2;

import tutoriels.tutoriel4_2.Chercheur;
import tutoriels.tutoriel4_2.Tutoriel4_2;

public class MonTutoriel4_2 extends Tutoriel4_2 {

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurEfficace() {
		// TODO Auto-generated method stub
		return new ChercheurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurNaif() {
		// TODO Auto-generated method stub
		return new ChercheurNaif<C>();
	}

	
	
	public static void main(String[] args) {
		new MonTutoriel4_2().valider();
	}
}
