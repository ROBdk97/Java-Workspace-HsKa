package sonstiges_aus_vorlesung;

public class SimpleStringExamples {
	public static void main(String[] args) {
		char cArr[] = { 'a', 'b', 'c', };
		String s1 = new String(cArr);
		System.out.println( s1);
		s1 = s1 + 'd'; // s1 zeigt jetzt auf neuen String in Heap
		System.out.println( s1 );
		
		String s2 = "abc"; String s3 = "abc";
		System.out.println( s2 == s3 );
		
		String s4 = new String("abc" );
		System.out.println( s2 == s4 );
		
		System.out.println( s2.equals(s4) );

		System.out.println( s2.equalsIgnoreCase("ABC") 	 );
		System.out.println( "Spaß".equalsIgnoreCase("SPAẞ")  );
		
		System.out.println( " ABC \t".length() );		// Ausgabe: 6
		System.out.println( " ABC \t".trim().length() );// 3

		System.out.println( "ABC".toLowerCase() );		// abc
		System.out.println( "abc".toUpperCase() );		// ABC
		
		System.out.println( "abc".substring(1) );		// bc
		System.out.println( "abc".substring(0, 2)  );	// ab
		
		System.out.println( "abc".charAt(1)  );			// b
		
		System.out.println( "abc".replaceAll("a", "aa")); // aabc
		System.out.println( 
				"ab23c".replaceAll("[a-z]", "?")  );  	// ??23?	//Reguläre Ausdrücke
		
		System.out.println( "abc".indexOf("bc"));		// 1
		System.out.println( "abc".endsWith("c"));		// true

	}

}
