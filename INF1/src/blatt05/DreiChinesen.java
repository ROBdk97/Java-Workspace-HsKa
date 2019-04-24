package blatt05;

public class DreiChinesen {
	static final String text = 
			  "Drei Chinesen mit dem Kontrabass\n" 
			+ "saﬂen auf der Straﬂe und erz‰hlten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n"
			+ "Drei Chinesen mit dem Kontrabass.\n\n"
			;

	/**
	 * Einen Text zentriert ausgeben. Es gen√ºgt eine L√∂sung f√ºr nichtproportionale
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
			if((maxLength-string.length())!=0) {
				String format=("%"+(maxLength-string.length())+"s\n");
			}
			System.out.printf(format, string);
		}
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text
	 *            Text mit Vokalen
	 * @param replacement
	 *            Ersatz f√ºr Vokale
	 * @return Text mit ge√§nderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		return text; // TODO
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "‰"));
	}

}
