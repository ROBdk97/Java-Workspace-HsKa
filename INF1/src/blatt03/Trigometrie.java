package blatt03;

public class Trigometrie {

	public static void main(String[] args) {
		final int LOWER = -4;
		final int UPPER = 4;
		final double STEP = .5;
		System.out.println("Alle Sinus, Cosinus von " + LOWER + "..." + UPPER + "in " + STEP + "er Schritten:");
		for (double i = LOWER; i <= UPPER; i += STEP) {
			System.out.println("x, sin(x), cos(x): " + i + ", " + Math.sin(i)+", "+Math.cos(i));
		}

	}

}
