package blatt12;

public class AusnahmenFangen {

	/**
	 * Zwei Werte dividieren
	 * @param z, Zahl die dividiert wird (Zähler)
	 * @param n, Zahl durch die dividiert wird (Nenner)
	 * @return z / n
	 */
	 public static int div(int z, int n) {
		 try {
			 return z / n;
		} catch (Exception e) {

			System.err.println("Fehlergrund: \""+e.getMessage()+"\"");
			e.printStackTrace();
			return Integer.MAX_VALUE;
		}
	 
	 }
	public static void main(String[] args) {
		System.out.println(div(10, 0));

	}

}
