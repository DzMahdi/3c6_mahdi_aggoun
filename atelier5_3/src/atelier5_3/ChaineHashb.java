package atelier5_3;

import tutoriels.map.CleHachable;

public class ChaineHashb extends CleHachable<String>{

	public ChaineHashb(String valeurJava) {
		super(valeurJava);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int indice() {
		// TODO Auto-generated method stub
		return valeurJava().length();
	}

}
