package sonstiges_aus_vorlesung;

public class SomeTestsAndExamples {
	
	/** Überschrift ausgeben */
	public static void h1(String h1) {
		System.out.printf("\n-- %-50s %s\n", h1, "------------------");
	}
	/** Int-Ausdruck und dessen Bitmuster ausgeben */
	public static void prtVar(String name, int val, boolean binToo) {
		System.out.printf("%18s == %-12d %36s\n", name, val,
				binToo ? Integer.toBinaryString(val) : ""
				);
	}
	/** Int-Ausdruck ausgeben */
	public static void prtVar(String name, int val) {
		prtVar(name, val, false);
	}
	
	// Funktionen, die lediglich ihren Namen ausgeben, 
	// um die Reihenfolge zu betrachten:
	public static int f() {System.out.print("f() "); return 1;}
	public static int g() {System.out.print("g() "); return 2;}
	public static int h() {System.out.print("h() "); return 3;}
	
	public static int biVariat(int a, int b) {System.out.println(" biVariat");return 4;}
	
	public static void main(String[] args) {
		int a=0, b, x;
		long l;
		
		h1("Beispiele ternärer Operator");
		boolean mitMWST = true; final double MWST = 0.19; double preis = 10.;
		double endPreis =  preis * (mitMWST     ? 1. + MWST  : 1.);
							//       ^ Boolscher 
							//         Ausdruck
		
							//				    ? ^ Wert, falls 
							//					    true	
		
							//				    ?            : ^ Wert, falls false				
		System.out.println(endPreis);

		int[] zahlen = { 2, 0, 3, 7, };
		for(int zahl: zahlen) {
			System.out.println(
					zahl + " ist " + 
					(zahl % 2 == 0 ?  "gerade" : "ungerade")
				+ "."
				);
		}

		
		
		h1("Beispiele Operator-Vorränge");
		boolean bx, bo = true;  // TODO 2.5.19
		bx = bo = 1 + a == a * 2;
// 		  15<  15<  5>  8>   4>				// Prio.-Stufe/Richtung (Assoziativität)
		System.out.println(bx + "," + bo);

		// Bei Typwandlungen (cast) manchmal fehlerträchtig:
		System.out.println((int)  3.5 +  2.0);
		//					3<        5>
		System.out.println((int) (3.5 +  2.0));

		
		h1("Methodenaufrufe von links nach rechts");
		biVariat( biVariat(f(), g()),      h() );

		h1("Rechtsassoziaivität ");
		prtVar("a = b = -10", a = b = -10);

		Object o = (long) (byte) a; 
		System.out.println(o.getClass().getSimpleName());

		
		a = f() + g() * h(); // Nicht rechtsassoz.
		prtVar("a", a); 
		// Weiter mit Folien ...

		h1("Ternärer Operator: Betrag berechnen");
		a=-12; b=3; 
		prtVar("a>=0 ? a : -a", a>=0 ? a : -a);
		
		// Nebeneffekte oft überraschend:
		x = a<b ? a++ : ++b;
		prtVar("x", x);
		prtVar("a", a);
		prtVar("b", b);

		
		h1("Unäre Operatoren von rechts nach links"); 
		prtVar("~-1", ~-1);
		prtVar("-~1", -~1);
		
		
		h1("Arithmetische Operatoren");
		byte b1 = 5;
		byte b2 = 7;
		byte b3;
		int i;
		// Nogo: b3 = b1 + b2; // Compilerfehler: b3 hat falschen Typ
		b3 = (byte) (b1 + b2);
		i = b1 + b2;
		prtVar("i",  i);
		
		// Nogo System.out.println(i % "".length() ); // ArithmeticException 
		
		h1("Bit-Operatoren: Logik");
		a = ~0;	// 0en Invertieren -> lauter 1en
		prtVar("a",  a, true);
		a = a & 255; // Bitweises UND
		prtVar("a",  a, true);
		a = a ^ 15; // Bitweises X-Oder
		prtVar("a",  a, true);
		a = a | 1024; // Bitweises ODER
		prtVar("a",  a, true);
		/* Ausgabe:
		 a == -1               11111111111111111111111111111111
         a == 255                                      11111111
         a == 240                                      11110000
         a == 1264                                  10011110000
		 */
		
		h1("Shift-Operatoren: Einsatzzweck");
		a = 100;
		// Oft genutzt, um mit 2^n zu multiplizieren:
		int n=4;
		prtVar("a", a, true);
		prtVar("a << n", a << n, true);
		// Auch oft genutzt, um mit 2^n zu dividieren:
		prtVar("a >>> n", a >>> n, true);
		/* Ausgabe:
                 n == 4                                             100
            a << n == 1600                                  11001000000
           a >>> n == 6                                             110
		 */
		
		h1("Shift-Operatoren: Performance");
		final long nTests = 4_000_000L;
		float sum = 0;
		n = 4;
		int zweiHochN = 1 << n;
		// Stoppuhr nullen:
		StringVsStringBufferExamples.printTimePerWorkItem(0);
		
		System.out.print(nTests + " mal <<n: ");
		for(i=0; i<nTests; i++) {
			sum += b << n;}
		StringVsStringBufferExamples.printTimePerWorkItem(nTests);
		
		System.out.print("\n" + nTests + " mal *16: ");
		for(i=0; i<nTests; i++) {
			sum += b * zweiHochN;}
		StringVsStringBufferExamples.printTimePerWorkItem(nTests);
		
		/* Ausgabe:
		2000000000 mal <<n: Dauer: 5,743777s; je Stück: 2,871889e-09s
		2000000000 mal *16: Dauer: 5,826090s; je Stück: 2,913045e-09s
		// Gemessen auf jre 1.8.0_40, Intel I7-4650U, Win10 
		*/
		
		h1("\nShift-Operatoren: Unterschied >> vs. >>>");
		b = -10;
		prtVar("b", b, true);
		prtVar("-10 >> 1", -10 >> 1, true);
		prtVar("-10 >>> 1", -10 >>> 1, true);
		/* Ausgabe:
                 b == -10              11111111111111111111111111110110
          -10 >> 1 == -5               11111111111111111111111111111011
         -10 >>> 1 == 2147483643        1111111111111111111111111111011
		 */

		h1("Vergleichsoperatoren");
		/* Nogo:
		boo = 1 < a < 8  ist semantisch inkorrekt, da 
		  				die Datentypen der Operanden
            			(1 < a) < 8     links boolean, rechts int. */
            			
		boolean boo = (1 < a) & (a < 8); // Besser. Übung: Klammern nötig?
		
		// Zeit für ein Mathe-Paper?
		if(0.0 != Math.sin(Math.PI/4.) - Math.sqrt(2.)/2.0) {
			System.out.println(
					"Sensation in Karlsruhe: sin(π/4) doch nicht gleich √2/2! ");
		}  // Übung: was übersieht der Autor des Papers?

		// Übung: wie besser machen?
		
		
		
		double rest = Math.sin(Math.PI/4.) / (Math.sqrt(2.) / 2.0)  -    1.0;
		//			 |- erster Wert     -|   |- zweiter Wert    -|   |- perfekter Wert -|		
		System.out.printf("frac: %e\n", rest);
		if(Math.abs(rest) < 1.e-12) {
			System.out.println(
					"Doch keine Sensation in Karlsruhe ...");
		}  
		// Weites Feld: Numerische Mathematik.
		
		h1("Boolsche Operatoren / Aufgabe: Arbeiten mit Booleschen Operatoren ");
		{
			boolean[] tests = {false, true};
			System.out.printf(" Dammbruch| See leer | Es regnet -> Straße nass\n");
			for(boolean dammGebrochen : tests)
				for(boolean seeLeer : tests)
					for(boolean esRegnet: tests) {
						System.out.printf("%8b %10b %12b -> %8b\n",
								dammGebrochen, seeLeer, esRegnet,
																					            				(dammGebrochen && !seeLeer) | esRegnet
								);
					}
		}
		
		h1("Kombinierter Zuweisungsoperator"); 
		x = b = 5;
		prtVar("x += b += a = 5", x += b += a = 5);
		prtVar("a", a);
		prtVar("b", b);
		prtVar("x", x);

		a = 3;
		a ^= 7;
		prtVar("a", a);
		a ^= 7;
		prtVar("a", a);
		
		boo = false;
		boo |= true;
		System.out.println("boo " + boo);
		
		h1("Inkrementoperatoren / Unterschied zwischen a++ und ++a ");
		prtVar("b = a=7", b=a=7);
		b = a++; // b ist 7, a ist 8
		prtVar("b = a=7", b=a=7);
		b = ++a; // b ist 8, a ist 8
		
		h1("Nichtnachahmenswerte Beispiele");
		a = 2;
		b = (a++)*a ;    // b ist 6, a ist 3
		b = (--a)*a;       // b ist 4, a ist 2
		
		h1("Auswertungsreihenfolge/Titelbild/Aufgabe Ende 7.6");
		prtVar("a=7", a=7);
		
		prtVar("x = a++ - a", x = a++ - a);
		prtVar("x = a - a++", x = a - a++);
		prtVar("a", a);

		prtVar("x = a++ - ++a",x = a++ - ++a);
		prtVar("a", a);

		prtVar("x = a++ - a++",x = a++ - a++);
		prtVar("a", a);
		
		// Mehr dazu: https://gynvael.coldwind.pl/?id=372
		
		
		h1("Narrowing");
		l = Integer.MAX_VALUE * 4l;
		System.out.println(Long.toBinaryString(l));
		System.out.println("l: " + l);
		a = (int) l;
		prtVar("a", a, true);
		prtVar("Integer.MAX_VALUE",Integer.MAX_VALUE, true);
		
		h1("'Erlaubte' Nebeneffekte");
		double phi = 0.;
		final int N = 8;
		for(i = 0; i <= N; i++){ 
			// ...
			System.out.printf("sin(%6f) == %6f\n", phi, Math.sin(phi));
			phi += Math.PI / 8.;
		}
		
	}
}

