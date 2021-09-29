package tutoriel2_6;

public class Moto extends Vehicule {

	
	public Moto(double totalKilometres) {
		super(totalKilometres);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double consomationLitresParKilometre() {
		return 3.5;
	}

	@Override
	protected boolean siNomFeminin() {
		return true;
	}

	@Override
	protected String nomVehicule() {
		return "moto";
	}

}
