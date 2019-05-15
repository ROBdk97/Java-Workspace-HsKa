package blatt07;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class TernaryMedian {
	/** Median durch verschachtelte ?-Operatoren finden 
	 * @return Median (mittlere Zahl) von a, b, c 
	 * */
	static int median(int a, int b, int c)	{
		int median = a < b ? b < c ? b : a < c ? c : a : b < c ? a < c ? a : c : b;
		return  median; // TODO: Median mit ?:-Ausdrücken berechnen
	}

	/** Median durch Sortieren ermitteln 
	 * @return Median (mittlere Zahl) von a, b, c 
	 * */
	static int medianSort(int a, int b, int c) { 
		int[] arr = new int[3];
		int i = 0;
		arr[i++] = a;
		arr[i++] = b;
		arr[i++] = c;
		Arrays.sort(arr);
		return arr[arr.length/2];
	}

	static void testMedian() {
		int tests[ ] = {0, 1, 2};
		// Prüfausdruck:
		for(int a: tests) { 
			for(int b: tests) {
				for(int c: tests) {
					int v0 = medianSort(a, b, c); 
					int v1 = median(a, b, c);
					if(v0 != v1) { // Mediane verschieden -> Fehler
						System.err.printf("%2d %2d %2d -> %2d != %2d\n", a,b,c, v0, v1); 
					}
				} // c
			} // b
		} // a
	}
	
	public static void main(String[] args) {
		testMedian();
	}

}
