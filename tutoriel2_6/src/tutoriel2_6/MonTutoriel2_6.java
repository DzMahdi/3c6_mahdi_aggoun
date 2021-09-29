package tutoriel2_6;

import tutoriels.tutoriel2_6.Tutoriel2_6;

public class MonTutoriel2_6 extends Tutoriel2_6 {

	@Override
	public Object creerAuto(double kilometrage) {
		// TODO Auto-generated method stub
		return new Auto(kilometrage);
	}

	@Override
	public Object creerCamion(double kilometrage, double chargementEnKilos) {
		// TODO Auto-generated method stub
		return new Camion(kilometrage, chargementEnKilos);
	}

	@Override
	public Object creerMobilette(double kilometrage) {
		// TODO Auto-generated method stub
		return new Mobilette(kilometrage);
	}

	@Override
	public Object creerMoto(double kilometrage) {
		// TODO Auto-generated method stub
		return new Moto(kilometrage);
	}

	
	public static void main(String [] args) {
		new MonTutoriel2_6().valider();
	}
	
}
