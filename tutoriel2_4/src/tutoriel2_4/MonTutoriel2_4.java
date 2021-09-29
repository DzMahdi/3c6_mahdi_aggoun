package tutoriel2_4;

import tutoriels.tutoriel2_4.Rouleur;
import tutoriels.tutoriel2_4.Tutoriel2_4;

public class MonTutoriel2_4 extends Tutoriel2_4 {

	
	public static void main(String[] args) {
		
		new MonTutoriel2_4().valider();
	}
	
	
	@Override
	public Rouleur creerAuto() {
		// TODO Auto-generated method stub
		return new Auto();
	}

	@Override
	public Rouleur creerCamion() {
		// TODO Auto-generated method stub
		return new Camion();
	}

	@Override
	public Rouleur creerMobilette() {
		// TODO Auto-generated method stub
		return new Mobilette();
	}

	@Override
	public Rouleur creerMoto() {
		// TODO Auto-generated method stub
		return new Moto();
	}

}
