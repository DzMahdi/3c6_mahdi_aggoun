package atelier2_1;

import tutoriels.atelier2_1.Formateur;

public class MonFormateur implements Formateur {

	@Override
	public String formater(String valeur) {
		String i;
		
		i = valeur.substring(0,1) + valeur.length();
		
		return i;
		
		
	}

}
