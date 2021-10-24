package tutoriel3_3;

import tutoriels.tutoriel3_3.Chercheur;
import tutoriels.tutoriel3_3.Tutoriel3_3;

public class MonTutoriel3_3 extends Tutoriel3_3 {

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurA() {
		// TODO Auto-generated method stub
		return new ChercheurA<C>();
	}

	@Override
	public <C extends Comparable<C>> Chercheur<C> fournirChercheurB() {
		// TODO Auto-generated method stub
		return new ChercheurB<C>();
	}

	
	
	public static void main(String[] args) {
		
		new MonTutoriel3_3().valider();
	}
}
