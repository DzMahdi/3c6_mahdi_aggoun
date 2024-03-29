package atelier4_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



import tutoriels.json.ErreurDeChargement;
import tutoriels.json.ValeurJson;

public class MonNombreJson  extends ValeurJson<Double>{

	private static final String PATRON = "^-?[0-9]*[.]?[0-9]+";
	private static final Pattern pattern = Pattern.compile(PATRON);
	
	private double valeur;
	
	@Override
	public String chargerEtRetournerResteDuTexte(String texteJson) throws ErreurDeChargement {
		
		Matcher matcher = pattern.matcher(texteJson);
		
		String resteDuTexte = texteJson;
		
		if (matcher.find()) {
			
			String texteValeur = matcher.group(0);
			
			valeur = Double.parseDouble(texteJson);
			
			resteDuTexte = matcher.replaceFirst("");	
						
		}else {
			throw new ErreurDeChargement("Impossible de charger un nombre au début de" + texteJson);
		}
		
		
		
		return resteDuTexte;
	}

	@Override
	public Double valeurJava() {
		
		return valeur;
	}

}
