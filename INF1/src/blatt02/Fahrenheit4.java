
// Datei Fahrenheit4.java
package blatt02;

public class Fahrenheit4 {
	/**
	 * Geg.: Temperaturbereich in Â°F <br/>
	 * Ges.: Temperaturliste in Â°C
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		final int UPPER = 250; // obere Grenze
		final int LOWER = 0; // untere Grenze
		final int STEP = 25; // Schrittweite
		final int NUM_PER_ROW = 5;
		int zaehler = 0;

		for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP)
		// Initialisierung ; Bedingung ; Fortsetzung: Schleifenvariable erhoehen
		{
			zaehler++;
			int celsius = 5 * (fahrenheit - 32) / 9;
			System.out.print(fahrenheit + "°F = " + celsius + "°C   ");
			if (zaehler % NUM_PER_ROW == 0) {
				System.out.println("");
			}
		}
	}
}
