package atelier5_3;

import tutoriels.atelier5_3.Atelier5_3;
import tutoriels.map.TesteurDeMap;

public class MonAtelier5_3 extends Atelier5_3{
	
	
	
	
	public static void main(String [] args) {
		(new MonAtelier5_3()).valider();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHasha() {
		// TODO Auto-generated method stub
		return new TesteurDeMapHasha();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHashb() {
		// TODO Auto-generated method stub
		return new TesteurDeMapHashb();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapHashc() {
		// TODO Auto-generated method stub
		return new TesteurDeMapHashc();
	}

	@Override
	public TesteurDeMap fournirTesteurDeMapNaif() {
		// TODO Auto-generated method stub
		return new TesteurDeMapNaif();
	}

	
	
}
