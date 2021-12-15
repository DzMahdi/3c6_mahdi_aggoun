package tutoriel5_1;

import tutoriels.liste.ListeJava;

public class TesteurDeListeNaive extends TesteurDeListeAbstrait {
	
	
	@Override
	public ListeJava<Character> nouvelleListe() {
		// TODO Auto-generated method stub
		return new ListeJavaNaive<>(Character.class);
	}
	

}
