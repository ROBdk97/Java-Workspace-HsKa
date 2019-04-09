package onwtests;

import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		fibonacci(0,1,100);
		System.out.println("ggT: "+ggt(21312,26412));

	}
	
	
	
	public static void fibonacci(int a, int b, int nummbers) {
		BigInteger f0=BigInteger.valueOf(a);
		BigInteger f1=BigInteger.valueOf(b);
		BigInteger f2=BigInteger.ZERO;
		for(int i=nummbers; i>=0; i--) {			
			f2=f0.add(f1);
			float x=f0.floatValue();
			float y=f1.floatValue();
			System.out.println(f2+"   -> "+f1+"/"+f0+"="+(y/x));

			f0=f1;
			f1=f2;
		}
	}
	
	private static int ggt(int a, int b) {
		while (b != 0) {
			if (a > b) {
				a = a - b;
		     } else {
		       b = b - a;
		     }
		}
		return a;
	}
	
}
