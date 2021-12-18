package tutoriel5_3;

import tutoriels.map.TesteurDeMap;
import tutoriels.tutoriel5_3.Tutoriel5_3;

public class MonTutoriel5_3 extends Tutoriel5_3 {

	@Override
	public TesteurDeMap fournirTesteurDeMapNaif() {
		// TODO Auto-generated method stub
		return new TesteurDeMapNaif();
	}
	
	public static void main(String[] args) {
			new MonTutoriel5_3().valider();
	}

}
