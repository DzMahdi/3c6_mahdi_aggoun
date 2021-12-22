package atelier4_2;

import tutoriels.generer_atelier4_2.solution.MonChargeurJson;
import tutoriels.json.Dictionnaire;
import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ListeJava;
import tutoriels.json.MaListeJava;
import tutoriels.json.MonDictionnaire;
import tutoriels.json.ValeurJson;

public class MonObjetJson extends ValeurJson {

	private static final char OUVERTURE = '[';
	private static final char SEPARATEUR = ',';
	private static final char FERMETURE = ']';
	
	private Dictionnaire<ValeurJson> dictionnaire = new MonDictionnaire<> (ValeurJson.class);
			
	
	
	
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		String resteDuTexte = texteJson;
		MonChargeurJson chargeur = new MonChargeurJson();
		
		resteDuTexte = retirerCaractere(resteDuTexte, OUVERTURE);
		
		while (true) {
			
			
			MaChaineJson chaine = new MaChaineJson();			
			
			resteDuTexte = chaine.chargerEtRetournerResteDuTexte(resteDuTexte);
			
			resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);
			
			ValeurJson valeurJson = chargeur.chargerValeur(resteDuTexte);
			
			
			dictionnaire.entreposerValeur(resteDuTexte, null);
			
			try {
				resteDuTexte = retirerCaractere(resteDuTexte, SEPARATEUR);
			} catch (ErreurDeChargement e) {
				break;
			}
			
			
		}
		
		resteDuTexte = retirerCaractere(resteDuTexte, FERMETURE);
		
	
			
		return resteDuTexte;
	}

	private String retirerCaractere(String texteJson, char caractere) throws ErreurDeChargement{
		if (!(texteJson.charAt(0)== caractere)) {
			throw new ErreurDeChargement(String.format("Il manque un %s au début %s", caractere, texteJson));
		}
		
		return texteJson.substring(1);
	}

	public Dictionnaire<ValeurJson> dictionnaire() {
		// TODO Auto-generated method stub
		return dictionnaire();
	}

	@Override
	public Object valeurJava() {
		// TODO Auto-generated method stub
		return valeurJava();
	}
	
	



}
