package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungStern() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungStern();
	}

	/**
	 * Bitte hier Lösung zum Zeichnen des Sterns entwickeln:
	 * 
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.meinStern(g);
	}

	private void meinStern(Graphics g) {

		double mitteX = this.getWidth() / 2;
		double mitteY = this.getHeight() / 2;
		int n = 100;
		double phi = 0;
		int r = 150;
		int tempR=0;

		for (double i = 0; i < n; i++) {
			phi = i * (2 * Math.PI) / n;
			double y = Math.sin(phi);
			double x = Math.cos(phi);
			//System.out.println(phi+", "+y + ", " + x);
			if(i%2==0) {
				tempR=r;
				g.setColor(Color.BLUE);
			}else {
				g.setColor(Color.magenta);
				tempR=r/2;
			}
			g.drawLine((int) mitteX, (int) mitteY, (int) (mitteX+tempR * x), (int) (mitteY+tempR * y));

		}

	}
	
	public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
		double phi = 0;
		int n = 100;
		int tempR=0;
		for (double i = 0; i < n; i++) {
			phi = i * (2 * Math.PI) / n;
			double y = Math.sin(phi);
			double x = Math.cos(phi);
			if(i%2==0) {
				tempR=r;
				g.setColor(Color.BLUE);
			}else {
				g.setColor(Color.magenta);
				tempR=r/2;
			}
			g.drawLine((int) midX, (int) midY, (int) (midX+tempR * x), (int) (midY+tempR * y));

		}
	}
}