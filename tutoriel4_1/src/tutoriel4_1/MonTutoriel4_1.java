package tutoriel4_1;

import tutoriels.json.ValeurJson;
import tutoriels.tutoriel4_1.ChargeurJson;
import tutoriels.tutoriel4_1.Tutoriel4_1;

public class MonTutoriel4_1 extends Tutoriel4_1{

	@Override
	public ValeurJson<Boolean> fournirBooleenJson() {
		// TODO Auto-generated method stub
		return new MonBooleenJson();
	}

	@Override
	public ValeurJson<String> fournirChaineJson() {
		// TODO Auto-generated method stub
		return new MaChaineJson();
	}

	@Override
	public ChargeurJson fournirChargeurJson() {
		// TODO Auto-generated method stub
		return new MonChargeurJson();
	}

	@Override
	public ValeurJson<Double> fournirNombreJson() {
		// TODO Auto-generated method stub
		return new MonNombreJson();
	}

	@Override
	public ValeurJson<Void> fournirNullJson() {
		// TODO Auto-generated method stub
		return new MonNullJson();
	}

	public static void main(String[] args) {
		new MonTutoriel4_1().valider();
	}
	
	
}
