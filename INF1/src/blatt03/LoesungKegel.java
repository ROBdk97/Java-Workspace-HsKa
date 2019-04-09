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
		this.setTitle("L�sung in der Klasse " + this.getClass().getName());
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
		double x25 = this.getWidth() / 4;
		double x75 = this.getWidth() * 3 / 4;
		double y25 = this.getHeight() / 4;
		double y75 = this.getHeight() * 3 / 4;
		// Linie Oben/Unten
		g.setColor(Color.black);
		g.drawLine((int) x25, (int) y25, (int) x75, (int) y25);
		g.drawLine((int) x25, (int) y75, (int) x75, (int) y75);
		// Variabeln
		final int LINES = 40;
		final double STEP = (x75 - x25) / LINES;
		// Kegel
		for (int i = 0; i <= LINES; i++) {
			if (i == 0 | i == LINES) {
				g.setColor(Color.black);
			} else {
				if (g.getColor() != Color.LIGHT_GRAY) {
					g.setColor(Color.lightGray);
				}
			}
			g.drawLine((int) (x25 + STEP * i), (int) y25, (int) (x75 - STEP * i), (int) y75);
		}
	}
}