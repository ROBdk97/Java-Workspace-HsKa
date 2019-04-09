package nuetzlich;

import java.math.BigInteger;

import javax.swing.JFrame;
/** 
 * Useful Methods 
 * @author ROBdk97
 */
public class Neutzlich {
	
	public static int[] getCenter(JFrame jF) {
		int[] x = new int[4];
		x[0] = jF.getWidth() / 4;
		x[1] = jF.getWidth() * 3 / 4;
		x[2] = jF.getHeight() / 4;
		x[3] = jF.getHeight() * 3 / 4;
		return x;
	}

	public static void fibonacci(int a, int b, int nummbers) {
		BigInteger f0 = BigInteger.valueOf(a);
		BigInteger f1 = BigInteger.valueOf(b);
		BigInteger f2 = BigInteger.ZERO;
		for (int i = nummbers; i >= 0; i--) {
			f2 = f0.add(f1);
			float x = f0.floatValue();
			float y = f1.floatValue();
			System.out.println(f2 + "   -> " + f1 + "/" + f0 + "=" + (y / x));

			f0 = f1;
			f1 = f2;
		}
	}

	public static int ggt(int a, int b) {
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
