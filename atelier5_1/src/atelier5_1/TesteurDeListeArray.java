package atelier5_1;

import java.util.Random;

import tutoriels.liste.ListeJava;

public class TesteurDeListeArray extends TesteurDeListeAbstrait{
	
	private static Random alea = new Random();
	
	@Override
	public ListeJava<Character> melangerLaListeEfficace(ListeJava<Character> liste) {
		// TODO Auto-generated method stub
		
		
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
		return new ListeJavaNaive<>(Character.class);
	}


}
