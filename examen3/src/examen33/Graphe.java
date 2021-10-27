package examen33;

public interface Graphe<C extends Comparable<C>> {

	void insererSommet(C sommet);

	C sommetLePlusHaut();

	C sommetLePlusBas();

}
