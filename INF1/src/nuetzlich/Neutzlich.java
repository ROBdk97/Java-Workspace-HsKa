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
	
	public static String loremIpsum() {
		String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.\r\n" + 
				"\r\n" + 
				"Aenean massa.\r\n" + 
				"\r\n" + 
				"Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\r\n" + 
				"\r\n" + 
				"Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem.\r\n" + 
				"\r\n" + 
				"Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu.\r\n" + 
				"\r\n" + 
				"In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.\r\n" + 
				"\r\n" + 
				"Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus.\r\n" + 
				"\r\n" + 
				"Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.\r\n" + 
				"\r\n" + 
				"Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.\r\n" + 
				"\r\n" + 
				"Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.\r\n" + 
				"\r\n" + 
				"Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi.\r\n" + 
				"\r\n" + 
				"Nam eget dui. Etiam rhoncus.\r\n" + 
				"\r\n" + 
				"Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum.\r\n" + 
				"\r\n" + 
				"Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus.\r\n" + 
				"\r\n" + 
				"Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,";
		return text;
	}
}
