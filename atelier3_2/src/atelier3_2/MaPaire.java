package atelier3_2;

public class MaPaire <C extends Comparable <C>> implements Paire<C>{

	
	private C droite;
	private C gauche;

	public MaPaire (C gauche, C droite) {
					this.droite = droite;
					this.gauche = gauche;
	} 
	
	
	@Override
	public C obtenirGauche() {
		// TODO Auto-generated method stub
		return gauche;
	}

	@Override
	public C obtenirDroite() {
		// TODO Auto-generated method stub
		return droite;
	}

	@Override
	public void modifierGauche(C gauche) {
		// TODO Auto-generated method stub
		this.gauche = gauche;
	}

	@Override
	public void modifierDroite(C droite) {
		// TODO Auto-generated method stub
		this.droite = droite;
	}

	@Override
	public C obtenirPlusPetit() {
		C valeurMinimale = droite;
		
		if (gauche.compareTo(valeurMinimale) < 0) {
			valeurMinimale = gauche;
		}
		
		return valeurMinimale;
	}

}
