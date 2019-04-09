package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungKegel() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(610, 420);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungKegel();
	}

	/**
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.meinKegel(g);
	}

	public void meinKegel(Graphics g) {
		int x25 = this.getWidth() / 4; // x-Koordinate bei 25% der Fensterbreite (von links)
		int x75 = this.getWidth() * 3 / 4; // x-Koordinate bei 75% der Fensterbreite (von links)
		int y25 = this.getHeight() / 4; // y-Koordinate bei 25% der Fensterbreite (von oben)
		int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)

		// Linie Oben/Unten
		g.setColor(Color.black);
		g.drawLine(x25, y25, x75, y25);
		g.drawLine(x25, y75, x75, y75);
		// Kegel
		final int LINES = 40;
		int horizontalStep = (x75 - x25) / (LINES);
		// Kegel
		for (int i = 0; i <= LINES; i++) {
			if (i == 0 | i == 40) {
				g.setColor(Color.black);
			} else {
				g.setColor(Color.lightGray);
			}
			g.drawLine(x25 + (horizontalStep * i), y25, x75 - (horizontalStep * i), y75);
		}
	}
}