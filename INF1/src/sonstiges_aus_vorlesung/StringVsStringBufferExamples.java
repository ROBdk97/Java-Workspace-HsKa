package sonstiges_aus_vorlesung;

public class StringVsStringBufferExamples {
	static long timeStart = 0L;

	public static void printTimePerWorkItem(long numItems) {
		long timeEnd = System.nanoTime();
		if (0L < timeStart) // Beim ersten Mal nicht drucken
		{
			double secs = (timeEnd - timeStart) / 1.e9;
			System.out.printf("Dauer: %fs; je Stück: %es", secs, secs / numItems);
		}
		timeStart = timeEnd;
	}

	private static void stopWatchDifferentStrings() {
		printTimePerWorkItem(0);
		final long NUM = 20_0L;

		{
			String s = ">";
			for (long i = 0; i < NUM; i++) {
				s = '#' + s.substring(1) + "-";
			}
			System.out.println("Länge String: " + s.length());
			printTimePerWorkItem(s.length());
		}

		{
			StringBuilder s = new StringBuilder();
			s.append(">");
			for (long i = 0; i < NUM; i++) {
				s.append("-");
				s.setCharAt(0, '#');
			}
			System.out.println("\nLänge StringBuilder: " + s.length());
			printTimePerWorkItem(s.length());

		}

		{
			StringBuffer s = new StringBuffer();  
			s.append(">");
			for (long i = 0; i < NUM; i++) {
				s.append("-");
				s.setCharAt(0, '#');
			}
			System.out.println("\nLänge Stringbuffer: " + s.length());
			printTimePerWorkItem(s.length());
		}
	}

	public static void main(String[] args) {

		stopWatchDifferentStrings();

	}

}
