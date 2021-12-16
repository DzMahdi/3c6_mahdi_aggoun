package atelier5_2;

import atelier5_2.ElementChaineSimple;
import tutoriels.liste.ListeJava;

public class ListeJavaChaineeDouble<E extends Object> extends ListeJava<E> {

	private int taille = 0;
	private ElementChaineDouble<E> tete = null;

	public ListeJavaChaineeDouble(Class<E> typeElement) {
		super(typeElement);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		insert(size(), e);
	}

	@Override
	public void addAll(E[] elements) {
		// TODO Auto-generated method stub
		for (E e : elements) {
			add(e);
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		tete = null;
		taille = 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		int indice = indexOf(o);
		boolean contains = false;

		if (indice >= 0) {
			contains = true;
		}

		return contains;
	}

	@Override
	public E get(int position) {
		// TODO Auto-generated method stub
		ElementChaineDouble<E> element = atteindreElement(position);

		return element.valeur();
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		int indice = -1;

		ElementChaineDouble<E> curseur = tete;

		for (int i = 0; i < taille; i++) {
			if (curseur != null && curseur.valeur().equals(o)) {
				indice = i;
				break;
			} else if (curseur != null) {
				curseur = curseur.suivant();
			} else {
				break;
			}

		}

		return indice;
	}

	@Override
	public void insert(int position, E e) {
		// TODO Auto-generated method stub
		if (position == 0) {

			ElementChaineDouble<E> nouvelleTete = new ElementChaineDouble<E>(e);
			nouvelleTete.setSuivant(tete);

			tete = nouvelleTete;
		} else {
			ElementChaineDouble<E> element = atteindreElement(position - 1);
			element.insererApres(e);
		}

		taille++;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return taille == 0;
	}

	@Override
	public void remove(int position) {
		// TODO Auto-generated method stub
		if (position == 0) {

			tete = tete.suivant();
			taille--;
		} else {

			ElementChaineDouble<E> curseur = atteindreElement(position - 1);
			retirerElementApres(curseur);

		}
	}

	@Override
	public void removeValue(Object o) {
		// TODO Auto-generated method stub

		if (tete != null && tete.valeur().equals(o)) {

			remove(0);

		} else if (tete != null) {
			retirerValeurApresTete(o);
		}
	}

	private void retirerValeurApresTete(Object o) {

		ElementChaineDouble<E> curseur = tete;

		for (int i = 1; i < taille; i++) {

			ElementChaineDouble<E> suivant = curseur.suivant();

			if (suivant != null && suivant.valeur().equals(o)) {

				retirerElementApres(curseur);
			} else if (suivant != null) {
				curseur = suivant;
			} else {
				break;
			}

		}

	}

	private void retirerElementApres(ElementChaineDouble<E> curseur) {

		if (curseur.suivant() != null) {
			curseur.setSuivant(curseur.suivant().suivant());
		}

		taille--;

	}

	@Override
	public void set(int position, E e) {
		// TODO Auto-generated method stub
		ElementChaineDouble<E> element = atteindreElement(position);

		element.set(e);
	}
	
	

	private ElementChaineDouble<E> atteindreElement(int position) {
		// TODO Auto-generated method stub
		ElementChaineDouble<E> element = tete;

		for (int i = 0; i < position; i++) {
			if (element != null) {
				element = element.suivant();
			}

		}

		return element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return taille;
	}

}
