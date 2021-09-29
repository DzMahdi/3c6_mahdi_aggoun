package atelier2_6;



public  abstract class Animal implements Dormeur, Formateur {

	public Animal(int heuresTotalesDeSommeil) {
		this.heuresTotalesDeSommeil = heuresTotalesDeSommeil;
	}
	
	private int heuresTotalesDeSommeil;
	
	
	protected abstract int heuresMinimalesDeSommeil();


	protected abstract String nomAnimal();
	
	

	protected abstract String typeDeCri(); 
		

	@Override
	public  void dormir(int heures) {
		if (heures > heuresMinimalesDeSommeil()) {
			heuresTotalesDeSommeil = heures + heuresTotalesDeSommeil;
		} else {
			heuresTotalesDeSommeil = heuresMinimalesDeSommeil() + heuresTotalesDeSommeil;
		}

	}

	@Override
	public  String formater() {

		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour, je suis un ");
		builder.append(nomAnimal());
		builder.append(" et mon type de cri est le ");
		builder.append(typeDeCri() + ".");
		builder.append(" Depuis le début du programme, j'ai dormi un total de ");
		builder.append(heuresTotalesDeSommeil + " heures.");
		builder.append(" D'ailleurs, quand je dors c'est au minimum " + heuresMinimalesDeSommeil() + " heures.");
		
		return builder.toString();
	}



	

}
