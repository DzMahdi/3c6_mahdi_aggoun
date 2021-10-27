package atelier3_4;

import tutoriels.atelier3_4.Atelier3_4;
import tutoriels.atelier3_4.Trieur;

public class MonAtelier3_4 extends Atelier3_4{

	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurEfficace() {
		// TODO Auto-generated method stub
		return new TrieurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Trieur<C> fournirTrieurNaif() {
		// TODO Auto-generated method stub
		return new TrieurNaif<C>();
	}

	
	public static void main(String[]args) {
		
		(new MonAtelier3_4()).valider();
		
	}
	
}
