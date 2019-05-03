package Kaesten;

public class StrasseNass {

	public static void main(String[] args) {
		boolean[] test= {true,false};
		
		for(boolean dammGebrochen : test) {
			for(boolean seeLeer : test) {
				for(boolean regen : test) {
					boolean strasseNass= dammGebrochen&!seeLeer|regen;
					System.out.println("Dammgebrochen? "+dammGebrochen+" See leer? "+seeLeer+" Regen? "+regen+"      Straﬂe nass? "+strasseNass);
				}
			}
		}

	}

}
