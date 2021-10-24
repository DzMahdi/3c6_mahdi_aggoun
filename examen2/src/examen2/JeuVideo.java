package examen2;

public abstract class JeuVideo implements Formateur {

	
	
	protected abstract String typeDeJeu();
	
	protected abstract String titreDuJeu();
	
	
	
	
	public JeuVideo(double heuresJouees) {
	
		this.heuresJouees = heuresJouees;

	}

	private double heuresJouees;

	
	public void jouer(double nombreHeures) {
		
	}
	
		
	
	
	
	@Override
	public String titreCommeNomDeMethode() {
		String nom;
		
		for (int i = 0; i < titreDuJeu().length(); i++) {
			if (condition) {
				
			}
		}
		
		
		
		return titreDuJeu();
	}
	
	
	
	
	@Override
	public String formater() {

		StringBuilder builder = new StringBuilder();
		builder.append("On a joué");
		builder.append(" 200 heures ");
		builder.append(" à ");
		builder.append(titreDuJeu());
		builder.append(", il sagit d'un ");
		
		if (typeDeJeu() != "jeu d'équipe") {
			builder.append(typeDeJeu());
		}else {
			builder.append(typeDeJeu());
			builder.append(" à " + " 5 joueur" );
		}
		
		
		
		return builder.toString();

	}

}
