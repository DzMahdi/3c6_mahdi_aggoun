package atelier4_1;


import tutoriels.atelier4_1.ChargeurJson;
import tutoriels.json.Dictionnaire;
import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJson;
import tutoriels.json.ObjetJson;
import tutoriels.json.ValeurJson;

public class MonChargeurJson implements ChargeurJson {

	private String resteDuTexteJson;

	@Override
	public ListeJson chargerListe(String texteJson) throws ErreurDeChargement {

		ListeJson listeJson = new MaListeJson();
		resteDuTexteJson = listeJson.chargerEtRetournerResteDuTexte(texteJson);

		return listeJson;
	}



	@Override
	public ValeurJson chargerValeur(String texteJson) throws ErreurDeChargement {
		ValeurJson[] valeursPossibles = new ValeurJson[] { new MonNullJson(), new MonBooleenJson(), new MaChaineJson(),
				new MonNombreJson() };

		ValeurJson valeurChargee = null;

		for (ValeurJson valeurPossible : valeursPossibles) {

			try {

				resteDuTexteJson = valeurPossible.chargerEtRetournerResteDuTexte(texteJson);
				valeurChargee = valeurPossible;
				break;

			} catch (ErreurDeChargement e) {
			}

		}
		if (valeurChargee == null) {
			throw new ErreurDeChargement("Impossible de charger une valeur au début " + texteJson);
		}
		return valeurChargee;
	}

	@Override
	public String resteDuTexteJson() {
    
		return resteDuTexteJson;
	}



	@Override
	public ObjetJson chargerObjet(String texteJson) throws ErreurDeChargement {
		
		ObjetJson objet = new ObjetJson() {
			
			@Override
			public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dictionnaire<ValeurJson> dictionnaire() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		// TODO Auto-generated method stub
		return objet;
	}

}
