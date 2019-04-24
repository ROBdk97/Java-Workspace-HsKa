package blatt05;
import nuetzlich.*;
public class DreiChinesen {
	static final String text = 
			  "Drei Chinesen mit dem Kontrabass\n" 
			+ "saßen auf der Straße und erzählten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n"
			+ "Drei Chinesen mit dem Kontrabass.\n\n"
			;

	/**
	 * Einen Text zentriert ausgeben. Es genägt eine Lösung für nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text
	 *            Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] textlines= text.split("\n");
		int maxLength=0;
		for(int i=0;i<textlines.length;i++) {
			if(textlines[i].length()>maxLength) {
				maxLength=textlines[i].length();
			}
		}
		for (String string : textlines) {
			System.out.println(Neutzlich.getSpaces((maxLength-string.length())/2)+string);
		}
		System.out.println();
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text
	 *            Text mit Vokalen
	 * @param replacement
	 *            Ersatz für Vokale
	 * @return Text mit geänderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		String[] vowels = {"a","e","i","o","u","ä","ö","ü"};
		for (String string : vowels) {
			text = text.replaceAll(string, replacement);
		}		
		
		return text;
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		String[] vowels = {"a","e","i","o","u","ä","ö","ü"};
		for (String variant : vowels) {
			DreiChinesen.printCentered(DreiChinesen.changeVowels(text, variant));
		}
		printCentered(changeVowels("", ""));
		printCentered(changeVowels("ä", "ä"));
		
		
		printCentered(changeVowels(Neutzlich.loremIpsum(), "ä"));
	}
}
