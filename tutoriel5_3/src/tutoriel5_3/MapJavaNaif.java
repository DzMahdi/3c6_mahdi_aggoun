package tutoriel5_3;

import java.util.ArrayList;
import java.util.List;

import tutoriels.map.Cle;
import tutoriels.map.MapJava;

public class MapJavaNaif<C extends Cle<?>, V extends Object> extends MapJava<C, V> {

	private List<C> cles = new ArrayList<>();
	private List<V> valeurs = new ArrayList<>();

	@Override
	public void clear() {

		cles.clear();
		valeurs.clear();
	}

	@Override
	public boolean containsKey(C c) {
		// TODO Auto-generated method stub
		return cles.contains(c);
	}

	@Override
	public boolean containsValue(V v) {
		// TODO Auto-generated method stub
		return valeurs.contains(v);
	}

	@Override
	public V get(C c) {
		V valeur = null;

		int indiceCle = cles.indexOf(c);

		if (indiceCle != -1) {
			valeur = valeurs.get(indiceCle);
		}

		return valeur;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return cles.isEmpty();
	}

	@Override
	public List<C> keys() {
		// TODO Auto-generated method stub
		return cles;
	}

	@Override
	public void put(C c, V v) {
		int indiceCle = cles.indexOf(c);

		if (indiceCle != -1) {
			valeurs.set(indiceCle, v);

		} else {
			cles.add(c);
			valeurs.add(v);
		}

	}

	@Override
	public void remove(C c) {
		int indiceCle = cles.indexOf(c);

		if (indiceCle != -1) {
			cles.remove(indiceCle);
			valeurs.remove(indiceCle);
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cles.size();
	}

}