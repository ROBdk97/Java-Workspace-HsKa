package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe: Klasse für das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungSterneAufSpirale() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungSterneAufSpirale();
	}

	/**
	 * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.sternSpirale(g);
	}

	public void sternSpirale(Graphics g) {
		double mitteX = this.getWidth() / 2;
		double mitteY = this.getHeight() / 3;
		double r = mitteX / 2;
		final int STERNE = 20;
		for (double i = 1; i < STERNE; i++) {
			double phi = 2. * Math.PI / STERNE * i;
			double x = Math.cos(phi) * r / STERNE * (STERNE - i);
			double y = Math.sin(phi) * r / STERNE * (STERNE - i);
			LoesungStern.zeichneEinenStern(g, (int) (mitteX + x), (int) (mitteY + y), (int) (r / (i + 1)), Color.green,
					Color.RED);
		}
	}
}
