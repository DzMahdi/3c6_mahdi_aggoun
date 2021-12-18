package tutoriel5_3;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import tutoriels.map.Cle;
import tutoriels.map.MapJava;

public class TesteurDeMapNaif extends TesteurDeMapAbstrait{

	@Override
	public void accederAuClesDansOrdre(MapJava<Cle<String>, Integer> map) {
		List<Cle<String>> cles = map.keys();
		List<String> valeurCles = new ArrayList<>();
		
		for(Cle<String> cle : cles){
			valeurCles.add(cle.valeurJava());
		}
		
		Collections.sort(valeurCles);
		
		for(String valeurCle : valeurCles) {
			System.out.println("MAP : " + valeurCle);
		}
		
	}

	@Override
	public MapJava<Cle<String>, Integer> nouveauMap() {
								
		return new MapJavaNaif<Cle<String>,Integer>();
	}

	@Override
	public Cle<String> nouvelleCle(String valeur) {
		// TODO Auto-generated method stub
		return new Cle<String>(valeur);
	}

}
