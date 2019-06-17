package blatt10;

public class IntegerValueObject {

	private final int i;

	/**
	 * Werte zusammenzählen
	 * 
	 * @param j zweiter Summand
	 * @return this.i + j als neues Value-Object
	 */
	public IntegerValueObject add(int j) {
		return new IntegerValueObject(this.i + j);
	}

	/**
	 * Werte ausmultiplizieren
	 * 
	 * @param j zweiter Faktor
	 * @return this.i * j als neues Value-Object
	 **/
	public IntegerValueObject mul(int j) {
		return new IntegerValueObject(this.i*j);
	}
	/**
	 * Konstruktor
	 * 
	 * @param i der Wert mit dem Instanziiert werden soll
	 */
	public IntegerValueObject(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		System.out.println(new IntegerValueObject(2).mul(3).add(4).mul(5));

	}
	@Override
	public String toString() {
		return "Lösung: "+this.i;
	}

}
