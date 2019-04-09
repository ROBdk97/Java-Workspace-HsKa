package Kaesten;

public class Sporttabelle {

	public static void main(String[] args) {
		// Variabeln
		final int STARTJAHR = 2018;
		final int ANZAHLJAHRE = 10;
		// For Schleife
		for (int jahr = STARTJAHR; jahr <= (STARTJAHR + ANZAHLJAHRE); jahr++) {
			// Wenn gerade
			if (jahr % 2 == 0) {
				if (jahr % 4 == 0) {
					System.out.println(jahr + " gibt es eine Sommerolympiade");
				} else {
					System.out.println(jahr + " gibt es eine Fußballweltmeisterschaft");
				}
			}
		}
	}
}
