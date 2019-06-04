package blatt10;

/**
 * Klasse für Würfel, befreit von Klassen-Variablen und -Methoden
 */
public class Entscheider {
	private Statistik stat; // Statistik für _diesen_ Würfel
	private String name;
	private static EntscheidungsWerte letzteEntscheidung;

	private enum EntscheidungsWerte {
		Nein, Ja
	}

	/**
	 * Konstruktor
	 * 
	 * @param name des Würfels
	 * 
	 */
	Entscheider(String name) {
		this.name = name;
		this.stat = new Statistik(this.name);
	}

	/**
	 * Wuerfel werfen und Wert zurückgeben
	 * 
	 * @return Anzahl Augen in 1 ... 6
	 */
	private int wuerfeln() {
		int ret = (int) (1 + Math.random() * 6.0);
		this.stat.addWert(ret);
		return ret;
	}

	public EntscheidungsWerte setValue(int value) {
		switch (value) {
		case 0:
			return EntscheidungsWerte.Nein;
		case 1:
			return EntscheidungsWerte.Ja;
		default:
			System.out.println("Error");
			return null;			
		}
	}

	private int entscheiden() {
		int ret = (int)(Math.random()*10%2);
		this.stat.addWert(ret);
		letzteEntscheidung=setValue(ret);
		return ret;
	}

	public static void main(String[] args) {
		Entscheider e = new Entscheider("KinoGehen");
		System.out.printf("Ausgabe der Statistik für viele Entscheidungen:\n");
		for (long l = 0L; l < 10_000_000L; l++) {
		 e.entscheiden();
		}
		System.out.printf("%s: %s\n", e.getName(), e.letzteEntscheidung );
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		Entscheider e = new Entscheider("KinoGehen");
		 return String.format("%s: %s\n", e.getName(), e ); 
		}
}
