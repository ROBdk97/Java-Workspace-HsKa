package blatt08;

public class Sonstiges {
	enum KartenFarbe {
		KARO, HERZ, PIK, KREUZ
	}

	static int farbenWert(KartenFarbe farbe) {
		int colorReturn;
		switch (farbe) {
		case KARO:
			colorReturn = 9;
			break;
		case HERZ:
			colorReturn = 10;
			break;
		case PIK:
			colorReturn = 11;
			break;
		default:
			colorReturn = 12;
			break;
		}
		return colorReturn;
	}

	// TODO: Methoden die sich selbst aufrufen!!!!!!!!!!
	public static void prt1234(long n) {
		if (n <= 0) {
			System.out.println();
			return;
		}
		prt1234(n - 1);
		System.out.print(n + ", ");
	}

	public static void prtSqr1234(long n) {
		if (n <= 0) {
			System.out.println();
			return;
		}
		prtSqr1234(n - 1);
		System.out.print(n * n + ", ");
	}

	public static void prt2468(long n) {
		if (n <= 1)
			return;
		if (n % 2 != 0) {
			n--;
		}
		prt2468(n - 2);
		System.out.print(n + ", ");
	}

	static void xxx(long n) {
		while(n>0) {
			System.out.print(n+", ");
			n--;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(farbenWert(KartenFarbe.KARO));
		prt1234(Long.parseLong(args[0]));
		System.out.println();
		prtSqr1234(13);
		System.out.println();
		prt2468(13);
		System.out.println();
		xxx(13);
	}
}
