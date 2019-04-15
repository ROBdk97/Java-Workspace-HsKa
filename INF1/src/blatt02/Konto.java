package blatt02;

public class Konto {

	final static int JAHRE = 30;
	final static double ZINS = 2.0;
	final static double AUFBUCHUNG = 1000;

	public static void main(String[] args) {
		double guthaben = 0.0;
		for (int i = 1; i <= JAHRE; i++) {
			guthaben = guthaben * ((100 + ZINS) / 100);
			guthaben += AUFBUCHUNG;
			System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);
		}

	}
}