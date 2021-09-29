package atelier2_1;

import java.util.Iterator;

import tutoriels.atelier2_1.Accepteur;

public class MonAccepteur implements Accepteur {

	@Override
	public boolean accepter(String valeur) {
		boolean x = true;

		for (int i = 0; i < valeur.length(); i++) {

			char lettre = valeur.charAt(i);
		
			
			for (int j = 0; j < valeur.length(); j++) {

				char lettre2 = valeur.charAt(j);

				if (lettre != lettre2) {
					
				x = false;
				
				
				}
		
			}



		}
		return x;

	}

}