package blatt10;

/** Klasse, um Mittelwert zu berechnen
 * 
 * @author Ulrich.Broeckl@hs-karlsruhe.de 
 *
 */
public class Statistik{
 	private long wertePerLog; // Falls nicht 0: alle wie viele Werte soll Kontrollausgabe kommen?
	
 	private double summe;

	protected double n;
	
	private String name;
	
	
	/** Konstruktor 
	 * @param name Identifikator/Name für die Statistik
	 */
	public Statistik(String name) {
		this.name = name;
		this.wertePerLog = 1_000_000L;
		this.summe = this.n = 0.;
	}
	
	/** Einen neuen Wert der Statistik hinzufügen
	 * 
	 * @param wert
	 */
	public void addWert(double wert) {
		this.n++;
		this.summe += wert;
		
		// Kontrollausgabe ...
		if(this.wertePerLog > 0L &&  this.n % this.wertePerLog  == 0) {
			System.out.println(this);
		}
	}
	/**
	 * 
	 * @return Durchschnitt aller Werte
	 */
	double getDurchschnitt() {
		return this.summe / this.n;
	}
	
	/** Statistik in Zeichenkette ausgeben
	 * 
	 */
	@Override
	public String toString() {
		Entscheider e = new Entscheider("KinoGehen");
		//return String.format("%s: %s\n", e.getName(), e.letzteEntscheidung );
		return String.format("%12s: n==%10.0f, µ==%8f", 
				this.name, this.n, this.getDurchschnitt() );
	}
}