package tutoriel2_1;

import tutoriels.tutoriel2_1.Accepteur;
import tutoriels.tutoriel2_1.Formateur;

public class MonAccepteur implements Accepteur {

	@Override
	public boolean accepter(int valeur) {
		// TODO Auto-generated method stub
		return valeur >= 10 && valeur <= 99;

	}

}
