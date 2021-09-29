
public class sandbox_Atelier2_1 {

	public static void main(String[] args) {
		String x = "aaaaaaaaaaav";
		boolean y = true;
		for (int i = 0; i < x.length(); i++) {

			char lettre = x.charAt(i);
		
			
			for (int j = 0; j < x.length(); j++) {

				char lettre2 = x.charAt(j);

				if (lettre != lettre2) {
					
				y = false;
				
				
				}
		
			}



		}
			System.out.println(y);
			
	}

}
