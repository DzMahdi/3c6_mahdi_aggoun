package tutoriel5_4;

import tutoriels.arbre.Arbre;
import tutoriels.tutoriel5_4.Tutoriel5_4;

public class MonTutoriel5_4 extends Tutoriel5_4 {

	@Override
	public Arbre<Character> fournirArbre() {
		// TODO Auto-generated method stub
		return new MonArbre<Character>();
	}
	
	
	public static void main(String[] args) {
		
		new MonTutoriel5_4().valider();
	}

}
