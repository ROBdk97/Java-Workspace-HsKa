package sonstiges_aus_vorlesung;

public class Person {

	protected String vorname;
	protected String nachname;
	
	/**
	 * 
	 * @param vorname
	 * @param nachname
	 */
	public Person(String vorname, String nachname) {
		this.vorname=vorname;
		this.nachname=nachname;
	}
	/**
	 * Gibt Vorname und Nachname der Person aus
	 */
	public void print() {
		System.out.printf("\nVorname: %12s, Nachname: %10s", this.vorname,this.nachname);
	}
	public void print(boolean newLine) {
		String format= "Vorname: %12s, Nachname: %10s";
		if(newLine) {
			format="\nVorname: %12s, Nachname: %10s";
		}
		System.out.printf(format, this.vorname,this.nachname);
	}

	
	public void printEnglish() {
		System.out.printf("\nFirstname: %10s, Surname: %11s",this.vorname,this.nachname);
	}
	public void printUP() {
		
	}
	
	//Test zeug
	public static void main(String[] args) {
		Person x = new Person("Hans", "Peter");
		x.print();
		x.printEnglish();
		x.print(true);
		x.print(false);
	}

}
