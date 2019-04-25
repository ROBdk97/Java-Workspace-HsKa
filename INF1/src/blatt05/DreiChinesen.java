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
		String[] textlines= text.split("\n"); //Auftrennen des Strings be \n in mehrere Strings
		int maxLength=0;
		for(int i=0;i<textlines.length;i++) {	//Forschleife zum erfassen ders längsten string und speichern dieser länge
			if(textlines[i].length()>maxLength) {
				maxLength=textlines[i].length();
			}
		}
		for (String string : textlines) { //Schleife die alle Strings durchgeht und Ausgibt
			System.out.println(getSpaces((maxLength-string.length())/2)+string);	//erzeugen von Spaces + Ausgeben
			//System.out.printf("%"+((maxLength-string.length())/2)+"s",string);
		}
		System.out.println();	//Absatz
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
		String[] vowels = {"a","e","i","o","u","ä","ö","ü"};	//Alle Vokale
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
	
	/**
	 * @param ammount
	 * @return ammount of blanks as String
	 */
	public static String getSpaces(int ammount) {
		String spaces="";
		for(int i=0;i<=ammount;i++) {
			spaces=spaces+" ";
		}
		return spaces;
	}
}
