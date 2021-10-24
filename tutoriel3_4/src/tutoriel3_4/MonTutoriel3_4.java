package tutoriel3_4;

import tutoriels.tutoriel3_4.Chercheur;
import tutoriels.tutoriel3_4.Tutoriel3_4;

public class MonTutoriel3_4 extends Tutoriel3_4 {

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
		new MonTutoriel3_4().valider();
			}
	
	
	
	
}
