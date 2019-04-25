package sonstiges_aus_vorlesung;

import java.text.ParseException;

public class WrapperExamples {

	public static void main(String[] args) throws ParseException {
		// Datei WrapperExamples.java
		// Strings in einfache Zahlen wandeln
		int zahl = Integer.parseInt("11");
		System.out.println(zahl);
		
		zahl = Integer.parseInt("11", 2);
		System.out.println(zahl);
		
		zahl = Integer.parseInt("11", 7);
		System.out.println(zahl);
		
		long l = Long.parseLong("FFFFFFFF", 16); // 2^32
		System.out.println(l);
		
		System.out.println(Integer.toBinaryString(3));
		// System.out.println(Double.parseDouble("3,1415"));
		double pi = java.text.DecimalFormat.getInstance().parse("3,1415").doubleValue();
		System.out.println(pi);
		
		// Einfache Zahlen in Wrapper:
		byte b=127; Byte bW = new Byte(b);
		bW = Byte.valueOf(b);
		bW = b;
		System.out.println(bW.toString());
		
		// Wrapper in einfache Zahl:
		b = bW.byteValue();
		b = bW;
		
		// Polymorphie:
		Object[] merkZettel = {
				42, 3.1415, new Person("Kai", "Hai"), "0721-123321",  'A'
		};
		for(Object merker: merkZettel) {
			System.out.printf("%s, ", merker);
		}

		
	}

}
