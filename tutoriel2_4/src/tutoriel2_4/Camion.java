package tutoriel2_4;

public class Camion extends Vehicule {

	private double consomationDeBase = 14;
	private double chargementEnKilos = 0;

	public void accepterChargement(double chargementEnKilos) {
		this.chargementEnKilos = chargementEnKilos;
	}

	private double calculerConsomationSelonChargement() {
		return (1 + chargementEnKilos / 1E6) * consomationDeBase;
	}

	@Override
	protected double consomationLitresParKilometre() {

		return calculerConsomationSelonChargement();
	}

	@Override
	protected boolean siNomFeminin() {
		return false;
	}

	@Override
	protected String nomVehicule() {

		return "camion";
	}

}
