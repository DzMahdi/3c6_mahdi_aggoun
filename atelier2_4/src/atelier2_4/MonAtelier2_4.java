package atelier2_4;

import tutoriels.atelier2_4.Atelier2_4;
import tutoriels.atelier2_4.Dormeur;

public class MonAtelier2_4 extends Atelier2_4 {

	@Override
	public Dormeur creerBouledogue() {
		// TODO Auto-generated method stub
		return new Bouledogue();
	}

	@Override
	public Dormeur creerChatGouttiere() {
		// TODO Auto-generated method stub
		return new ChatGouttiere();
	}

	@Override
	public Dormeur creerChatPersan() {
		// TODO Auto-generated method stub
		return new ChatPersan();
	}

	@Override
	public Dormeur creerShihtzu() {
		// TODO Auto-generated method stub
		return new Shihtzu();
	}
	
	public static void main(String[] args) {
		(new MonAtelier2_4()).valider();
	}

}
