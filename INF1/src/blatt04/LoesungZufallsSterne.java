package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungZufallsSterne() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungZufallsSterne();
	}

	/**
	 * Bitte ab hier Lösung zum Zeichnen der zufälligen Sterne entwickeln.
	 */
	/**
	 * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
	 * 
	 * @param g    Grafikbereich, auf dem gezeichnet wird
	 * @param midX x-Koordinate des Mittelpunkts des Sterns
	 * @param midY y-Koordinate des Mittelpunkts des Sterns
	 * @param r    Radius des Sterns
	 */
	public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
	}

	/**
	 * Zweite Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.meineZufallsSterne(g);
	}

	private void meineZufallsSterne(Graphics g) {
		final int STERNE = (int) (getWidth()/10);
		for (int i = 0; i <= STERNE; i++) {
			LoesungStern.zeichneEinenStern(g, (int) (2*Math.random() * this.getHeight()),
					(int) (2*Math.random() * this.getWidth()), (int) (200 * Math.random()));
		}

	}
}
