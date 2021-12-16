package atelier5_2;

public class ElementChaineDouble <E> {
	
	private E valeur;
	
	private ElementChaineDouble<E> suivant = this;
	private ElementChaineDouble<E> precedent = this;
	
	public ElementChaineDouble(E e) {
		this.valeur = e;
	}
	
	public ElementChaineDouble suivant() {
		return suivant;
	}
	
	public ElementChaineDouble precedent() {
		return precedent;
	}
	
	public E valeur() {
		return valeur;
	}
	
	public void set(E e) {
		this.valeur = e;
	}
	
	public void setSuivant(ElementChaineDouble<E> suivant) {
		this.suivant = suivant;
	}
	
	public void setPrecedent(ElementChaineDouble<E> precedent) {
		
		this.precedent = precedent;
	}
	
		public void insererApres(E e) {
		
		ElementChaineDouble<E> nouveau = new ElementChaineDouble<E>(e);
		
		if (this.suivant != null) {
			nouveau.setSuivant(this.suivant);
		}
		
		this.suivant = nouveau;
	}

}
