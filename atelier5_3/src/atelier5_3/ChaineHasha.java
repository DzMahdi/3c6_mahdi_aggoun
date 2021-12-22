package atelier5_3;

import tutoriels.map.CleHachable;

public class ChaineHasha  extends CleHachable<String>{

	public ChaineHasha(String valeurJava) {
		super(valeurJava);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int indice() {
		// TODO Auto-generated method stub
		return valeurJava().hashCode();
	}

}
