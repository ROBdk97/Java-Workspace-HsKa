package blatt07;

import blatt07.HolidayFeatures.Features;
import nuetzlich.*;

/**
 * Klasse, um Merkmale von Hotels und Wünsche von Urlaubern zu speichern
 *
 */
class HolidayFeatures {
	long featureBits = 0L;

	static enum Features {
		Gebirge, Strand, City, Pool, Strandbar, Skipiste, Shopping, Wäscheservice, Chauffeur, Restaurant, Cafe, Bistro,
		Lounge, Disco, Jazzclub, Bar, Karaoke, Korbflechten, Golf, Squash, Jai_Alai, Tennis, Boule, Jetski, Tauchen,
		Tanzen, Aerobic, Yoga, Boccia, Murmeln
	};

	/**
	 * Ein Merkmal setzen
	 * 
	 * @param feature Gewünschtes Merkmal
	 */
	void setFeature(Features feature) {
		// TODO
		featureBits = Neutzlich.modifyBit(featureBits, feature.ordinal(), 1);
	}

	/**
	 * Merkmale in Zeichkette wandeln
	 * 
	 * @return Zeichenkette mit Merkmalen
	 */
	@Override
	public String toString() {
		String ret = "";
		long theBit = 1;
		for (Features f : Features.values()) {
			if ((this.featureBits & theBit) > 0) {
				ret += (f + ", ");

			}
			theBit <<= 1;
		}
		ret = ret.substring(0, ret.length()-2)+".";
		return ret;
	}

	/**
	 * Merkmale zufällig erzeugen
	 */
	public void random() {
		int numFeatures = Features.values().length / 2;
		for (int i = 0; i < numFeatures; i++) {
			this.setFeature(Features.values()[(int) (Math.random() * Features.values().length)]);
		}
	}

	/**
	 * Merkmale matchen
	 * 
	 * @param toMatch Feature, mit dem verglichen wird
	 * @return Anzahl übereinstimmender Features
	 */
	public int match(HolidayFeatures toMatch) {
		return Long.bitCount( toMatch.featureBits ^ featureBits);
			
	}

	/** Main zum Testen ... */
	public static void main(String[] args) {
		HolidayFeatures hf = new HolidayFeatures();
		hf.setFeature(Features.Gebirge);
		System.out.println(hf + " Selbstmatch==" + hf.match(hf));
		HolidayFeatures hf2 = new HolidayFeatures();
		hf.setFeature(Features.Skipiste);
		System.out.println(hf);
		System.out.println("Match hf, hf2==" + hf.match(hf2));
		hf2.setFeature(Features.Skipiste);
		System.out.println("Match hf, hf2==" + hf.match(hf2));
	}

}

/** Klasse für Kunden */
class Customer {
	String name;
	HolidayFeatures features = new HolidayFeatures();
	int bestMatchCount = -1;

	Customer(String name) {
		this.name = name;
		this.features.random();
	}

	/**
	 * Beste Zahl der Matches für Kunden finden
	 * 
	 * @param hotels Array mit Hotels, die matchen sollen
	 */
	void determineBestNumberOfMatches(Hotel hotels[]) {
		this.bestMatchCount = -1;
		for (Hotel hotel : hotels) {
			int numMatches = this.features.match(hotel.features);
			if (numMatches > this.bestMatchCount) {
				this.bestMatchCount = numMatches;
			}
		}

	}

	/**
	 * Beste Matches ausgeben
	 * 
	 * @param hotels Array mit Hotels, die matchen sollen
	 */
	void printBestMatches(Hotel hotels[]) {
		if (this.bestMatchCount < 0) {
			this.determineBestNumberOfMatches(hotels);
		}
		System.out.printf("Kd: %9s, Matches: %2d  %s\n", this.name, this.bestMatchCount, this.features);
		// TODO

	}
}

/** (Test-) Klasse für Hotels */
class Hotel {
	String name;
	static int num = 0;
	HolidayFeatures features = new HolidayFeatures();

	Hotel() {
		this.name = "Hotel_" + ++Hotel.num;
		this.features.random();
	}
}

/**
 * (Test-) Klasse, um Kunde mit einigen Hotels zu testen
 *
 */
public class HolidayMatcher {
	final int N_HOTELS = 1_000;
	private Hotel hotels[]; // Hotels zum Testen
	private Customer customer;

	/**
	 * Konstruktor: Kunde und Hotels generieren ...
	 */
	HolidayMatcher() {
		// Kunden generieren:
		this.customer = new Customer("Ray König");

		/** Array der Hotels füllen */
		this.hotels = new Hotel[N_HOTELS];
		for (int iHotel = 0; iHotel < N_HOTELS; iHotel++) {
			this.hotels[iHotel] = new Hotel();
		}
	}

	/** testen */
	void testHolidayMatching() {
		// Hotels ausgeben, die am besten passen
		this.customer.printBestMatches(hotels);
	}

	public static void main(String[] args) {
		new HolidayMatcher().testHolidayMatching();
	}

}
