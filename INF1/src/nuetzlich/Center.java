package nuetzlich;

import javax.swing.JFrame;

public class Center {

	public static int[] getCenter(JFrame jF) {
		int[] x= new int[4];
		x[0]=jF.getWidth() / 4;
		x[1] = jF.getWidth() * 3 / 4;
		x[2] = jF.getHeight() / 4;
		x[3] = jF.getHeight() * 3 / 4;
		return x;
	}
}
