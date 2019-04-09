package blatt02;

public class Konto2 {

	public static void main(String[] args) {

		final double zins = 2.0;
		final double aufbuchung = 1000;
		double ziel = 100000.0;
		int jahr = 0;

		double guthaben = 0.0;
		while (guthaben < ziel) {
			jahr++;
			guthaben = guthaben * ((100 + zins) / 100);
			guthaben += aufbuchung;
		}
		System.out.println("Guthaben nach dem " + jahr + ". Jahr: " + guthaben);

	}
}
