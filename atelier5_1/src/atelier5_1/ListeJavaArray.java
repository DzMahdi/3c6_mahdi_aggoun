package atelier5_1;

import tutoriels.liste.ListeJava;

public class ListeJavaArray<E extends Object> extends ListeJava<E> {

	private E[] elements = nouveauTableau(0);
	
	public ListeJavaArray(Class<E> typeElement) {
		super(typeElement);
		
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
		elements = nouveauTableau(0);
		
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return indexOf(o) != -1;
	}

	@Override
	public E get(int position) {
		// TODO Auto-generated method stub
		return elements[position];
	}

	@Override
	public int indexOf(Object o) {
		int indice = -1;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(o)) {
				indice = i;
				break;
			}
		}

		return indice;
	}

	@Override
	public void insert(int position, E e) {
		E[] nouveauElements = nouveauTableau(elements.length + 1);

		copier(elements, 0, position - 1, nouveauElements, 0);

		nouveauElements[position] = e;

		copier(elements, position, elements.length - 1, nouveauElements, position + 1);

		elements = nouveauElements;
		
	}
	
	private void copier(E[] src, int debutSrc, int finSrc, E[] dst, int debutDst) {

		int decalage = debutDst - debutSrc;

		for (int i = debutSrc; i <= finSrc; i++) {

			dst[i + decalage] = src[i];
		}

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return elements.length == 0;	
		}

	@Override
	public void remove(int position) {
		E[] nouveauxElements = nouveauTableau(elements.length - 1);

		copier(elements, 0, position - 1, nouveauxElements, 0);
		copier(elements, position + 1, elements.length-1, nouveauxElements, position);

		elements = nouveauxElements;
		
	}

	@Override
	public void removeValue(Object o) {
		int indice = indexOf(o);
		if (indice >= 0) {
			remove(indice);
		}
		
	}

	@Override
	public void set(int position, E e) {
		// TODO Auto-generated method stub
		elements[position] = e;
	}

	@Override
	public int size() {	
		// TODO Auto-generated method stub
		return elements.length;
	}

}
