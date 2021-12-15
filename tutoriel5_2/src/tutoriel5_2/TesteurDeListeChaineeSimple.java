package tutoriel5_2;

import tutoriels.liste.ListeJava;

public class TesteurDeListeChaineeSimple extends TesteurDeListeAbstrait {

	@Override
	public ListeJava<Character> melangerLaListeEfficace(ListeJava<Character> liste) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListeJava<Character> nouvelleListe() {
		// TODO Auto-generated method stub
		return new ListeJavaChaineeSimple<>(Character.class);
	}

}
