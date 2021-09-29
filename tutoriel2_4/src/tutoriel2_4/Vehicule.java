package tutoriel2_4;

import tutoriels.tutoriel2_4.Formateur;
import tutoriels.tutoriel2_4.Rouleur;
import tutoriels.tutoriel2_4.Tutoriel2_4;

public class Vehicule implements Rouleur, Formateur {

	private double totalKilometres = 0;

	protected double consomationLitresParKilometre() {
		return 0.0;
	}

	protected String nomVehicule() {
		return "";
	}

	protected boolean siNomFeminin() {

		return false;

	}

	private double litresEssenceConsomes() {
		return totalKilometres * consomationLitresParKilometre();

	}

	@Override
	public void rouler(double kilometres) {
		totalKilometres = totalKilometres + kilometres;

	}

	@Override
	public String formater() {

		StringBuilder builder = new StringBuilder();

		if (siNomFeminin()) {

			builder.append("Ma ");
		} else {
			builder.append("Mon ");
		}
		builder.append(nomVehicule());
		builder.append(" a roulé ");
		builder.append(totalKilometres);
		builder.append(" kilomètres et consomé ");
		builder.append(litresEssenceConsomes());
		builder.append(" litres d'essence.");

		return builder.toString();

	}

	
}
