package atelier3_2;

public interface Paire<C extends Comparable<C>> {
	
	C obtenirGauche ();
	
	C obtenirDroite ();
	
	void modifierGauche (C gauche);
	void modifierDroite(C droite);
	
	C obtenirPlusPetit ();
	
}
