package tutoriel2_1;

import tutoriels.tutoriel2_1.Accepteur;
import tutoriels.tutoriel2_1.Formateur;
import tutoriels.tutoriel2_1.Tutoriel2_1;

public class MonTutoriel2_1 extends Tutoriel2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MonTutoriel2_1().valider();
	}

	@Override
	public Accepteur fournirAccepteur() {
		// TODO Auto-generated method stub
		return new MonAccepteur();
	}

	@Override
	public Formateur fournirFormateur() {

		return new MonFormateur();
	}

}
