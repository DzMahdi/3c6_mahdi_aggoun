package atelier2_6;

public class ChatPersan extends Chat {
	
	
	
	public ChatPersan(int heuresTotalesDeSommeil, int nombreOiseauxAttrapes) {
		super(heuresTotalesDeSommeil, nombreOiseauxAttrapes);
		// TODO Auto-generated constructor stub
	}

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
