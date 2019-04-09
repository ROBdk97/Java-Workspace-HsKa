package blatt03;

public class Quadratzahlen {

	public static void main(String[] args) {
		final int LOWER = -4;
		final int UPPER = 4;
		final double STEP = .5;
		System.out.println("Alle Quadratzahlen von " + LOWER + "..." + UPPER + "in " + STEP + "er Schritten:");
		for (double i = LOWER; i <= UPPER; i += STEP) {
			System.out.println("x, x^2: " + i + ", " + Math.pow(i, 2));
		}

	}

}
