package tutoriel5_2;

import java.util.Random;

import tutoriels.liste.ListeJava;

public class TesteurDeListeChaineeSimple extends TesteurDeListeAbstrait {

	private static Random alea = new Random();
	
	
	@Override
	public ListeJava<Character> melangerLaListeEfficace(ListeJava<Character> liste) {
		ListeJava<Character> resultat = nouvelleListe();

		while (!liste.isEmpty()) {
			int positionAuHasard = alea.nextInt(liste.size());

			Character elementAuHasard = liste.get(positionAuHasard);

			resultat.add(elementAuHasard);

			liste.remove(positionAuHasard);

		}
		return resultat;
	}

	@Override
	public ListeJava<Character> nouvelleListe() {
		// TODO Auto-generated method stub
		return new ListeJavaChaineeSimple<>(Character.class);
	}

}
