package atelier2_3;

import tutoriels.atelier2_3.Formateur;
import tutoriels.atelier2_3.animaux.Animal;
import tutoriels.atelier2_3.animaux.Chat;
import tutoriels.atelier2_3.animaux.Chien;
import tutoriels.atelier2_3.animaux.Dalmatien;

public class MonFormateur implements Formateur {

	@Override
	public String formater(Animal animal) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();

		if (animal instanceof Chat) {
			builder.append("Je suis un chat");
			Chat chat = (Chat) animal;
			if (chat.nombreOiseauxAttrapes() > 6) {
				builder.append(" et je suis un bon chasseur.");
			} else {
				builder.append(", mais je suis un mauvais chasseur.");
			}
		} else {

		
			builder.append("Je suis un chien");
			
			if (animal instanceof Dalmatien) {
				Dalmatien dalmatien = (Dalmatien) animal;
				builder.append(" et j'ai "+ dalmatien.getNombreDeTaches());
				builder.append( " taches.");
			
				} else {
					builder.append(", mais je n'ai pas de taches.");
				}

			}

		
		return builder.toString();
	}
}
