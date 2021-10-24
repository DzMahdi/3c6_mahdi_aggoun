package atelier3_2;

import tutoriels.atelier3_2.Planteur;

public class MonPlanteur implements Planteur{


	@Override
	public boolean planter() {
		
		MaPaire <Integer>paires = new MaPaire(1,2);
		paires.obtenirPlusPetit().compareTo(2);
		
		return false;
	}

}
