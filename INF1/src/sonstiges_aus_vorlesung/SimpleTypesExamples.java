package sonstiges_aus_vorlesung;

public class SimpleTypesExamples {

	public static void main(String[] args) {

		// Boolscher Typ
		boolean mitSosse = true; // oder: false
		if(mitSosse) 
			System.out.println("OK, mit Soße.");

		// Integer-Typen
		byte  b = Byte.MAX_VALUE;  		// 1 Byte
		short s	= Short.MAX_VALUE; 		// 2 Bytes
		int   i = Integer.MAX_VALUE;	// 4 Byte
		long  l = Long.MIN_VALUE;		// 8 Byte
				// ^ Wrapper-KLASSEN, später mehr
		
		String fmt = "%n%nb=%17x\ns=%17x\ni=%17x\nl=%17x";
		System.out.printf(fmt,
				b, s, i, l);
		System.out.printf(fmt.replaceAll("x", "d"),
				b, s, i, l);
		
		// Wie binär ausgeben?
		System.out.printf("%n%s",  Integer.toBinaryString(i) );
		
		// Gleitpunkt-Typen
		float f  = Float.MAX_VALUE;		// 4 Byte
		double d = Double.MAX_VALUE;	// 8 Byte
		
		fmt = "\n\n%e\n%e\n";
		System.out.printf(fmt, f,d);
		System.out.printf(fmt.replaceAll("e", "f"),
				f, d);
	}

}



