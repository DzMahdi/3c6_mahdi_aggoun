package examen33;
import tutoriels.examen_gr2.Examen3Gr2;
import tutoriels.gr1gr2.Melangeur;
import tutoriels.gr1gr2.Tableau;

public class MonExamen3 extends Examen3Gr2{

	@Override
	protected Object creerSommet(int valeur) {
		// TODO Auto-generated method stub
		return new Sommet();
	}

	@Override
	protected Tableau<String> creerTableauChaines() {
		// TODO Auto-generated method stub
		return new MonTableau<String>();
	}

	@Override
	protected Tableau<Double> creerTableauDoubles() {
		// TODO Auto-generated method stub
		return new MonTableau<Double>();
	}

	@Override
	protected Tableau<Integer> creerTableauEntiers() {
		// TODO Auto-generated method stub
		return new MonTableau<Integer>();
	}

	@Override
	public Object fournirGraphe() {
		// TODO Auto-generated method stub
		return new MonGraphe<>();
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurEfficace() {
		// TODO Auto-generated method stub
		return new MelangeurEfficace<C>();
	}

	@Override
	public <C extends Comparable<C>> Melangeur<C> fournirMelangeurNaif() {
		// TODO Auto-generated method stub
		return new MelangeurNaif<>();
	}

	public static void main(String []args) {
		(new MonExamen3()).valider();
		
	}
	
	
	
}
