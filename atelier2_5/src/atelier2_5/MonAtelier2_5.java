package atelier2_5;

import tutoriels.atelier2_5.Atelier2_5;

public class MonAtelier2_5 extends Atelier2_5 {

	@Override
	public Object creerBouledogue() {
		// TODO Auto-generated method stub
		return new Bouledogue();
	}

	@Override
	public Object creerChatGouttiere() {
		// TODO Auto-generated method stub
		return new ChatGouttiere();
	}

	@Override
	public Object creerChatPersan() {
		// TODO Auto-generated method stub
		return new ChatPersan();
	}

	@Override
	public Object creerShihtzu() {
		// TODO Auto-generated method stub
		return new Shihtzu();
	}

	
	public static void main(String[] args) {
		
		new MonAtelier2_5().valider();
	}
}
