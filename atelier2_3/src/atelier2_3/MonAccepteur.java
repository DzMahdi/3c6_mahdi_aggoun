package atelier2_3;

import tutoriels.atelier2_3.Accepteur;
import tutoriels.atelier2_3.animaux.Animal;
import tutoriels.atelier2_3.animaux.Chat;

public class MonAccepteur implements Accepteur {

	@Override
	public boolean accepterLesBonsChasseurs(Animal animal) {
	boolean accepter = true;
		if (animal instanceof Chat) {
		
			Chat chat =(Chat) animal;
			accepter = chat.getNombreOiseauxAttrapes() > 6;
			
		}
		
		return accepter;
	}

	@Override
	public boolean accepterLesChats(Animal animal) {
		
		return animal instanceof Chat;
	}

	@Override
	public boolean accepterLesJappeurs(Animal animal) {
	
		return animal.typeDeCri() == "jappement";
	}

}
