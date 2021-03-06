package at.maurutschek.myutil;

import java.util.Random;

/**
 * Eine Übung zum Thema Rekursion
 * 
 * @author Fabian Maurutschek
 *
 */
public class Rekursionen {

	/**
	 * Gibt den Fakulätwert einer Zahl zurück
	 * 
	 * @param Die Zahl
	 * @return Die Fakultät der Zahl
	 * @throws Wenn Die Zahl < 0 ist
	 */
	public int fakultaet(int n) throws Exception {
		if (n < 0)
			throw new Exception();
		if (n > 1)
			return n * fakultaet(n - 1);
		return n;
	}

	/**
	 * Gibt den größten gemeinsamen Teiler einer Zahl zurück
	 * 
	 * @param Zahl 1
	 * @param Zahl 2
	 * @return GGT von Zahl 1 und 2
	 */
	public int ggT(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		int e = 1;
		if (a < b) {
			int x = a;
			a = b;
			b = x;
		}
		if (a % b == 0)
			return b;
		int x = a % b;
		e = ggT(b, x);
		return e;
	}

	/**
	 * Gibt die Summe von einer gewissen Anzahl an Random-generierten Zahlen [5 -
	 * 10] zurück
	 * 
	 * @param Anzahl wieviele Random gerierte Zahlen gemacht werden sollen
	 * @return Die Summe
	 */
	public int getSummel(int zahl) {
		Random rnd = new Random();
		if (zahl > 0) {
			--zahl;
			return (rnd.nextInt(6) + 5) + getSummel(zahl);
		} else
			return 0;
	}

	/**
	 * Nimmt aus einen eingegebenen Zahlbereich Zahlen heraus, welche durch einer
	 * weiteren Zahl teilbar sind
	 * 
	 * @param von: Der start des Zahlenbereichs
	 * @param bis: Das Ende des Zahlenbereichs
	 * @param zahl: Der Devisor
	 */
	public void teilbar(int von, int bis, int zahl) {
		if (bis < von) {
			int x = bis;
			bis = von;
			von = x;
		}
		if (bis % zahl == 0)
			System.out.print(bis + " ");
		if (von == bis)
			return;
		teilbar(von, bis - 1, zahl);
	}

	/**
	 * Interatives Summieren von Zahlen in einem Array(Schleife)
	 * 
	 * @param n: Das Array
	 * @return Die Summe
	 */
	public int sumIterativ(int[] n) {
		int x = n.length, e = 0;
		for (int i : n) {
			e += i;
			x--;
			System.out.print(i);
			if (x > 0)
				System.out.print(" + ");
		}
		System.out.print(" = " + e);
		return e;
	}

	/**
	 * Interatives Summieren von Zahlen in einem Array(Methodenaufruf)
	 * 
	 * @param Intarray
	 * @return Summe
	 */
	public int sumRekursiv(int[] n) {
		int x = sumRekursiv(n, 0);
		System.out.print(x);
		return x;
	}

	/**
	 * Eine Hilfsmethode für sumRekursiv()
	 */
	private int sumRekursiv(int[] n, int i) {
		if (i == n.length) {
			System.out.print(" = ");
			return 0;
		}
		if (i == n.length - 1)
			System.out.print(i + 1);
		else
			System.out.print(i + 1 + " + ");
		return n[i] + sumRekursiv(n, i + 1);
	}

	/**
	 * Interatives Summieren von Zahlen in einem Array RÜCKWÄRTS(Methodenaufruf)
	 * 
	 * @param Intarray
	 * @return Summe
	 */
	public int sumRekursivRueckwaerts(int[] n) {
		int x = sumRekursivRueckwaerts(n, n.length);
		System.out.print(x);
		return x;
	}

	/**
	 * Eine Hilfsmethode für sumRekursivRueckwaerts()
	 */
	private int sumRekursivRueckwaerts(int[] n, int i) {
		if (i == 0) {
			System.out.print(" = ");
			return 0;
		}
		if (i == 1)
			System.out.print(i);
		else
			System.out.print(i + " + ");
		return n[i - 1] + sumRekursivRueckwaerts(n, i - 1);
	}

	/**
	 * Eine Folge an Zahlen welche in einem bestimmten Bereich vorhanden sind
	 * 
	 * @param a: Anfang des Bereichs
	 * @param b: Ende Des Bereichs
	 */
	public void folge1(int a, int b) {
		folge1(a, b, -1);
	}

	/**
	 * Eine Hilfsmethode für folge1()
	 */
	private void folge1(int a, int b, int x) {
		System.out.print(x + "/" + a + " ");
		if (a <= b)
			return;
		folge1(a - 2, b, x * -3);
	}

	/**
	 * Gibt die Ziffernsumme einer Zahl zurück
	 * 
	 * @param Die Zahl
	 * @return Die Ziffernumme
	 */
	public int ziffernsumme(int zahl) {
		zahl = Math.abs(zahl);
		return ziffernsumme((zahl + "").toCharArray(), 0);
	}

	/**
	 * Eine Hilfsmethode für ziffernsumme()
	 */
	private int ziffernsumme(char[] s, int stelle) {
		if (stelle == s.length)
			return 0;
		return Integer.parseInt(s[stelle] + "") + ziffernsumme(s, stelle + 1);
	}

	/**
	 * Eine Methode welche eine Krone eines Baumes malt (In Sternen)
	 * 
	 * @param hoehe: Höhe bzw. wieviele Reihen Es ausgeben soll
	 * @throws Wenn die Höhe < 0
	 */
	public void baum(int hoehe) throws Exception {
		if (hoehe < 0)
			throw new Exception();
		baum(hoehe, 1, hoehe - 1);
	}

	/**
	 * Eine Hilfsmethode für baum()
	 */
	private void baum(int hoehe, int breite, int leerz) {
		if (hoehe == 0)
			return;
		zeichenAusgeben(' ', leerz);
		zeichenAusgeben('*', breite);
		System.out.println();
		baum(hoehe - 1, breite + 2, leerz - 1);
	}

	/**
	 * Eine Hilfsmethode für baum()
	 */
	private void zeichenAusgeben(char z, int anz) {
		if (anz <= 0)
			return;
		System.out.print(z);
		zeichenAusgeben(z, anz - 1);
	}

	/**
	 * Simuliert den Fall eines Handy von einer gewissen Höhe Endet wenn das Handy
	 * den Boden berührt oder Eine gewisse Zeit vergangen ist
	 * 
	 * @param hoehe: Höhe von wo es abgeworfen wird
	 * @param zeit: Wielange es fallen soll
	 */
	public void falling(int hoehe, int zeit) {
		falling(0, 0, zeit, hoehe);
	}

	/**
	 * Eine Hilfsmethode für falling()
	 */
	private void falling(float hoehe, int zeit, int zeitBis, float hoeheBis) {
		if (hoehe >= hoeheBis) {
			System.out.println("Handy kaputt!");
			return;
		}
		if (zeit >= zeitBis)
			return;
		System.out.println(zeit + " Sek:   " + hoehe + "m");
		zeit += 1;
		hoehe += 0.5 * 9.80665 * (zeit * zeit);
		falling(hoehe, zeit, zeitBis, hoeheBis);
	}
}
