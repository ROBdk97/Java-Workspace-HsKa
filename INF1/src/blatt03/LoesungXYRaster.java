package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungXYRaster() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(604, 417);
		this.setTitle("L�sung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungXYRaster();
	}

	/**
	 * Hier bitte die Lösung, um das Grid zu zeichnen
	 * 
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.meinRaster(g);
	}

	public void meinRaster(Graphics g) {
		int x25 = this.getWidth() / 4; // x-Koordinate bei 25% der Fensterbreite (von links)
		int x75 = this.getWidth() * 3 / 4; // x-Koordinate bei 75% der Fensterbreite (von links)
		int y25 = this.getHeight() / 4; // y-Koordinate bei 25% der Fensterbreite (von oben)
		int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)

		final int LINES = 11;
		// Komplettes Rechteck zeichnen
		g.drawLine(x75, y25, x25, y25);
		g.drawLine(x25, y25, x25, y75);
		g.drawLine(x25, y75, x75, y75);
		g.drawLine(x75, y25, x75, y75);

		// Raster Zeichen		
		int horizontalStep = (y75 - y25) / (LINES + 1);
		int verticalStep = (x75 - x25) / (LINES + 1);
		for (int i = 1; i <= LINES; i++) {
			if ((i % 2) == 0) {
				g.setColor(Color.black);
			} else {
				g.setColor(Color.lightGray);
			}
			// Horizontal
			g.drawLine(x25, y25 + (horizontalStep * i), x75, y25 + (horizontalStep * i));
			//Vertical
			g.drawLine(x25 + (verticalStep * i), y25, x25 + (verticalStep * i), y75);
		}
	}

}
