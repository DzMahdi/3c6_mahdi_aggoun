package atelier3_2;

import tutoriels.atelier3_2.Animal;
import tutoriels.atelier3_2.Atelier3_2;
import tutoriels.atelier3_2.Planteur;

public class MonAtelier3_2 extends Atelier3_2{

	@Override
	public Object creerPaireAnimaux(Animal gauche, Animal droite) {
		// TODO Auto-generated method stub
		return new MaPaire<Animal>(gauche, droite);
	}

	@Override
	public Object creerPaireChaines(String gauche, String droite) {
		// TODO Auto-generated method stub
		return new MaPaire<String>(gauche, droite);
	}

	@Override
	public Object creerPaireEntiers(int gauche, int droite) {
		// TODO Auto-generated method stub
		return new MaPaire<Integer>(gauche, droite);
	}

	@Override
	public Planteur fournirPlanteur() {
		// TODO Auto-generated method stub
		return new MonPlanteur();
	}

	public static void main(String[] args) {
		(new MonAtelier3_2()).valider();
	}
	
	
}
