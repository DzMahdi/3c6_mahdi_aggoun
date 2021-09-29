package atelier2_5;

public class ChatPersan extends Chat {
	
	
	
	@Override
	protected String typeDeCri() {
		return rendreJoli(" miaulement"); 
	}
	
	@Override
	protected String nomAnimal() {
		return rendreJoli(" chat persan");
	}
	
	@Override
	protected int heuresMinimalesDeSommeil() {
		return 5;
	}
	
	
	
	private String rendreJoli(String mot) {
		
			return "joli" + mot;
	}
	
	
	
	
}
