package atelier5_3;

import tutoriels.map.CleHachable;

public class ChaineHashc extends CleHachable<String> {

	public ChaineHashc(String valeurJava) {
		super(valeurJava);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int indice() {
		// TODO Auto-generated method stub
		return valeurJava().length();
	}

}
