package examen2;

import tutoriels.examen_gr1.Accepteur;
import tutoriels.examen_gr1.Examen2Gr1;

public class MonExamen2 extends Examen2Gr1 {

	
	public static void main(String[] args) {
		(new MonExamen2()).valider();
	}
	
	
	
	@Override
	public Object creerDoom(double heuresJouees) {
		// TODO Auto-generated method stub
		return new Doom(heuresJouees);
	}

	@Override
	public Object creerLeagueOfLegends(double heuresJouees, int nombreDeJoueursParEquipe) {
		// TODO Auto-generated method stub
		return new LeagueOfLegends(heuresJouees, nombreDeJoueursParEquipe);
	}

	@Override
	public Object creerStarCraft(double heuresJouees) {
		// TODO Auto-generated method stub
		return new StarCraft(heuresJouees);
	}

	@Override
	public Object creerValorant(double heuresJouees, int nombreDeJoueursParEquipe) {
		// TODO Auto-generated method stub
		return new Valorant(heuresJouees, nombreDeJoueursParEquipe);
	}

	@Override
	public Accepteur fournirAccepteur() {
		// TODO Auto-generated method stub
		return new MonAccepteur();
	}

	
	
}
