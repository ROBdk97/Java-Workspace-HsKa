	
package sonstiges_aus_vorlesung;

/**
	 * Klasse  für Personen, die mit einem anderen Personen vergleichbar sind
	 */
	public class PersonWithEquals extends Person {
		/**
		 * Konstruktor
		 * @param vorname
		 * @param nachname
		 */
		public PersonWithEquals(String vorname, String nachname) {
			super(vorname, nachname); // Konstruktor der Mutterklasse aufrufen
		}
		
		@Override
		public String toString() {
			return (this.vorname+" "+this.nachname);
			
		}
		
		@Override
		public boolean equals(Object obj) {
			return this.toString().equalsIgnoreCase(obj.toString());			
		}
		
		/**
		 * Tests
		 * @param args unused
		 */
		public static void main(String[] args) {
			PersonWithEquals[] persons = {	// Reihung mit drei Persunen, davon zwei mit gleichem Namen
					new PersonWithEquals("Kai", "Hai"),
					new PersonWithEquals("May", "Lin"),
					new PersonWithEquals("May", "Lin"),
			};
			for(PersonWithEquals a : persons) {
				for(PersonWithEquals b : persons) {
					System.out.println( a + " == " + b + ": " + a.equals(b));
				}
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		/** Person in Zeichenkette ausgeben
//		 * 
//		 */
//		@Override
//		public String toString() {
//			return String.format("%s, %s", this.nachname, this.vorname);
//		}
//		
//		
//		/** Personen vergleichen
//		 * 
//		 */
//		@Override
//		public boolean equals(Object obj) {
//			boolean ret;
//			PersonWithEquals person = (PersonWithEquals) obj;
//			ret = this.nachname.equals(person.nachname);
//			ret &= this.vorname.equals(person.vorname);
//			return ret;
//		}
//
	}	
	