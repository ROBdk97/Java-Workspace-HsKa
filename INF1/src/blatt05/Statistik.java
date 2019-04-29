package blatt05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistik {

	final static int[] numbers = { 35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67, 66, 31, 45, 7, 100,
			96, 93, 12, 20, 57, 22, 62, 51 };

	public static void main(String[] args) {
		berechnen(numbers);
		int[] testEmpty = {};
		berechnen(testEmpty);
		int[] testNegativUndGleich = { -1, -1, -1, -1 };
		berechnen(testNegativUndGleich);
		int[] testEinElement = { 1 };
		berechnen(testEinElement);
	}

	static void berechnen(int[] numbers) {
		if (numbers.length != 0) {
			double mittelwert = 0;
			int minWert = Integer.MAX_VALUE;
			int maxWert = Integer.MIN_VALUE;
			for (int i : numbers) {
				mittelwert += i;
				if (i > maxWert)
					maxWert = i;
				if (i < minWert)
					minWert = i;
			}
			mittelwert = mittelwert / numbers.length;
			System.out.println("Mittelwert: " + mittelwert + " MinWert: " + minWert + " MaxWert: " + maxWert + "\n");
			for (int i : numbers) {
				System.out.print(i + ", ");
			}
			System.out.println("\n");
			Arrays.parallelSort(numbers);
			for (int i : numbers) {
				System.out.print(i + ", ");
			}
			if (numbers.length % 2 == 0) {
				System.out.println(
						(numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2);
			} else {
				System.out.println(numbers[(numbers.length - 1) / 2]);
			}

			System.out.println();
		} else {
			System.out.println("ERORR: No Array/Empty Array");
		}

	}

}
