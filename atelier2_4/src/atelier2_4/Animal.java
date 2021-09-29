package atelier2_4;

import tutoriels.atelier2_4.Dormeur;
import tutoriels.atelier2_4.Formateur;

public class Animal implements Dormeur, Formateur {

	private int heuresTotalesDeSommeil;
	
	
	protected int heuresMinimalesDeSommeil() {
		return 0;
	};

	protected String nomAnimal() {
		return "";
	}

	protected String typeDeCri() {
		return "";
	}

	@Override
	public void dormir(int heures) {
		if (heures > heuresMinimalesDeSommeil()) {
			heuresTotalesDeSommeil = heures + heuresTotalesDeSommeil;
		} else {
			heuresTotalesDeSommeil = heuresMinimalesDeSommeil() + heuresTotalesDeSommeil;
		}

	}

	@Override
	public String formater() {

		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour, je suis un ");
		builder.append(nomAnimal());
		builder.append(" et mon type de cri est le ");
		builder.append(typeDeCri() + ".");
		builder.append(" Depuis le début du programme, j'ai dormi un total de ");
		builder.append(heuresTotalesDeSommeil + " heures.");
		builder.append(" D'ailleurs, quand je dors c'est au minimum " + heuresMinimalesDeSommeil() + " heures.");
		
		return builder.toString();
	}



	

}
