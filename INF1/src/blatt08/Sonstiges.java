package blatt08;

public class Sonstiges {
	enum KartenFarbe {
		KARO, HERZ, PIK, KREUZ
	}

	static int farbenWert(KartenFarbe farbe) {
		int colorReturn;
		switch (farbe) {
		case KARO:
			colorReturn=9;
			break;
		case HERZ:
			colorReturn=10;
			break;
		case PIK:
			colorReturn=11;
			break;
		default:
			colorReturn=12;
			break;		
		}
		return colorReturn;
	}
	//TODO: Methoden die sich selbst aufrufen!!!!!!!!!!
	 public static void prt1234(long n){
		 if(n<=0)return;
		 for (long i = 1; i <= n; i++) {
			System.out.print(i+", ");
		}
		 System.out.println();
	 }
	 
	 public static void prtSqr1234 (long n) {
		 if(n<=0)return;
		 for (int i = 1; i*i <= n*n; i++) {
			 System.out.print(i*i+", ");
		}
		 System.out.println();
	}
	 
	 public static void prt2468(long n) {
		 if(n<=1)return;
		 long m=n;
		 if(n%2==0) {
			 m--;
		 }		 
		 for (int i = 2;  i <= m; i+=2) {
			 System.out.print(i+", ");
		}
		 System.out.println();
		 
	 }
	
	public static void main(String[] args) {
		System.out.println(farbenWert(KartenFarbe.KARO));
		prt1234(Long.parseLong(args[0]));
		prtSqr1234(13);
		prt2468(13);
	}
}
