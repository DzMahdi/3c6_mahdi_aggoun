package tutoriel5_4;

import tutoriels.arbre.Noeud;

public class MonNoeud<C extends Comparable<C>> extends Noeud<C> {

	private C valeur;
	private Noeud<C> enfantGauche;
	private Noeud<C> enfantDroit;

	private Noeud<C> parent;

	public MonNoeud(C valeur) {
		this.valeur = valeur;
	}

	public MonNoeud(C valeur, Noeud<C> parent) {
		this.valeur = valeur;
		this.parent = parent;
	}

	@Override
	public Noeud<C> enfantDroit() {
		// TODO Auto-generated method stub
		return enfantDroit;
	}

	@Override
	public Noeud<C> enfantGauche() {
		// TODO Auto-generated method stub
		return enfantGauche;
	}

	@Override
	public void inserer(C valeur) {

		if (valeur.compareTo(valeur()) < 0) {
			insererVersLaGauche(valeur);

		} else if (valeur.compareTo(valeur()) > 0) {
			insererVersLaDroite(valeur);

		} else {

			this.valeur = valeur;

		}

	}

	private void insererVersLaGauche(C valeur) {

		if (enfantGauche() == null) {

			setEnfantGauche(new MonNoeud<C>(valeur, this));
			equilibrer();
		} else {
			enfantGauche().inserer(valeur);
		}
	}

	private void insererVersLaDroite(C valeur) {

		if (enfantDroit() == null) {

			setEnfantDroit(new MonNoeud<C>(valeur, this));
			equilibrer();
		} else {
			enfantDroit().inserer(valeur);
		}

	}

	@Override
	protected Noeud<C> nouveauNoeud(C valeur) {
		// TODO Auto-generated method stub
		return new MonNoeud<C>(valeur);
	}

	@Override
	protected Noeud<C> nouveauNoeud(C valeur, Noeud<C> parent) {
		// TODO Auto-generated method stub
		return new MonNoeud<C>(valeur, parent);
	}

	@Override
	public Noeud<C> parent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	protected void setEnfantDroit(Noeud<C> enfantDroit) {
		this.enfantDroit = enfantDroit;
	}

	@Override
	protected void setEnfantGauche(Noeud<C> enfantGauche) {
		this.enfantGauche = enfantGauche;

	}

	@Override
	protected void setParent(Noeud<C> parent) {
		this.parent = parent;

	}

	@Override
	protected void setValeur(C valeur) {
		this.valeur = valeur;

	}

	@Override
	public C valeur() {
		// TODO Auto-generated method stub
		return valeur;
	}

}
