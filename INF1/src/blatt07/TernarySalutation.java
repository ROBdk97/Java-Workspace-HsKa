package blatt07;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class TernarySalutation {

	/**
	 * Alle möglichen Anreden ausgeben
	 */
	private static void testSalutation() {
		boolean bools[] = { true, false };
		for (boolean firstNameBase : bools) {
			for (boolean female : bools) {
				System.out.println(salutation(firstNameBase, female, "Kim", "May"));
			}
		}
	}

	/**
	 * Anrede abhängig vom Geschlecht und Bekanntheitsgrad ausgeben
	 * 
	 * @return Anrede
	 * @param onFirstNameBase Per-Du?
	 * @param female          Weiblich?
	 * @param given           Vorname
	 * @param name            Nachname
	 */
	static String salutation(boolean onFirstNameBase, boolean female, String given, String name) {
		String returnString;
		returnString = onFirstNameBase ? "Liebe" + (female ? " " : "r ") : "Sehr geehrte" + (female ? " " : "r ");
		returnString += onFirstNameBase ? given : (female ? "Frau " : "Herr ") + name;
		return returnString;
	}

	public static void main(String[] args) {
		testSalutation();
	}

}
