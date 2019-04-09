package blatt03;

import java.awt.*;
import javax.swing.JFrame;

import nuetzlich.Center;

/**
 * Klasse für erste eigene einfache Zeichnung
 */
public class LoesungDiagonalen extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungDiagonalen() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("L�sung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungDiagonalen();
	}

	/**
	 * Paint-Methode. Nichts zu ändern hier. Diese Methode wird beim Öffnen des
	 * Fensters automatisch aufgerufen. Die Methode wird auch aufgerufen, wenn die
	 * Größe des Fensters verändert wird.
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void paint(Graphics g) {
		/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.meineDiagonalen(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Bitte den gegebenen Code unten aus der Methode meinPaint der Klasse
	 * LoesungsBeispiel so abändern, dass:
	 * <ol>
	 * <li>Das Rechteck komplett und in schwarz gemalt wird.</li>
	 * <li>Die Diagonale von links oben nach rechts unten in rot gezeichnet wird.
	 * </li>
	 * <li>Die Diagonale von rechts oben nach links unten in blau gezeichnet wird.
	 * </li>
	 * </ol>
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void meineDiagonalen(Graphics g) {

		// Benutzung ausgelagerter Methode um die Mitte zu finden
		int[] center = Center.getCenter(this);
		int x25 = center[0];
		int x75 = center[1];
		int y25 = center[2];
		int y75 = center[3];

		// TODO: Komplettes Rechteck zeichnen
		g.drawLine(x75, y25, x25, y25);
		g.drawLine(x25, y25, x25, y75);

		// Beispiel für Einsatz anderer Farbe
		g.setColor(Color.black);
		g.drawLine(x25, y75, x75, y75);
		g.drawLine(x75, y25, x75, y75);
		// TODO: rote Diagonale zeichnen
		g.setColor(Color.red);
		g.drawLine(x25, y25, x75, y75);
		// TODO: blaue Diagonale zeichnen
		g.setColor(Color.blue);
		g.drawLine(x25, y75, x75, y25);
	}
}
