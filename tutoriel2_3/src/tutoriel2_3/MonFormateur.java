package tutoriel2_3;

import tutoriels.tutoriel2_3.Formateur;
import tutoriels.tutoriel2_3.vehicules.Vehicule;

public class MonFormateur implements Formateur {

	@Override
	public String formater(Vehicule vehicule) {
		
		StringBuilder builder = new StringBuilder();
		
		if (vehicule instanceof Auto) {
			builder.append("Une auto");	
		}
		
		return null;
	}

}
