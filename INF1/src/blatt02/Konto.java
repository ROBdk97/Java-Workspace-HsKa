package blatt02;

public class Konto {

	final static int JAHRE = 30;
	final static double zins = 2.0;
	final static double aufbuchung = 1000;

	public static void main(String[] args) {
		double guthaben = 0.0;
		for (int i = 1; i <= JAHRE; i++) {
			guthaben = guthaben * ((100 + zins) / 100);
			guthaben += aufbuchung;
			System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);
		}

	}
}