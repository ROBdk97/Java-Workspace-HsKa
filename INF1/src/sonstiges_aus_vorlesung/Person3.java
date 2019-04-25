	
	// Datei Person3.java 
	package sonstiges_aus_vorlesung;
	
	/**
	 * Einfache Klasse für Personen mit Druckzähler
	 */
	public class Person3 {
		protected String vorname; // Instanzvariable
		protected String nachname; // Instanzvariable
		
	
		public Person3(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}
	
		static int numPrints=0; // Klassenvariable
		public void print() {
			// Zähler erhöhen
			Person3.numPrints = Person3.numPrints + 1;
			System.out.printf("%10s, %-10s (DruckNr. %d)\n", 
					nachname, vorname, Person3.numPrints);
		}

		public static void main(String[] args) {
			Person3 p1 = new Person3("Thea", "Mi"); 
			Person3 p2 = new Person3("Kai", "Hai");
			p1.print(); 
			p2.print();
			p2.print();
			p1.print();
		}
	}