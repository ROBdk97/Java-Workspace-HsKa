package blatt05;

public class Schadensfaelle {

	public static void main(String[] args) {
		double[][] schadensFaelle = { { 0, 74.4 }, { 350, 18.2 }, { 1500, 6.1 }, { 5000, 1.3} };
		System.out.println(erwartetterSchaden(schadensFaelle));

	}

	static double erwartetterSchaden(double[][] faelle) {
		double ergebniss = 0;
		for (int i = 0; i < faelle.length; i++) {
			ergebniss += faelle[i][0] * (faelle[i][1] / 100);
		}

		return ergebniss;
	}

}
