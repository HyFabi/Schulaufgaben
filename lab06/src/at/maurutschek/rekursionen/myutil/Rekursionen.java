package at.maurutschek.rekursionen.myutil;

import java.io.File;

/**
 * Rekursionenklasse: Klasse mit Beispielen wo ausschließlich Rekursursionen
 * vorhanden sind
 * 
 * @author Fabian Maurutschek
 *
 */
public class Rekursionen {

	/**
	 * Liestet Files von einer Directory
	 * 
	 * @param dir: Die Directory, welche durchsuchten werden soll
	 * @param tabs: String welcher die Tabs zählt nur für die Rekursion wichtig
	 */
	public void listFiles(File dir, String tabs) {
		try {
			if (!dir.exists())
				return;
			System.out.println(tabs + dir.getName());
			if (dir.isDirectory()) {
				tabs += "  ";//Sieht schöner aus als \t
				for (File f : dir.listFiles())
					listFiles(f, tabs);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 

	/**
	 * Gibt die Größe einer File/Directory auf dem Datenträger zurück
	 * 
	 * @param dir: Die Directory
	 * @return Die Größe
	 */
	public long getGroesse(File dir) {
		return getGroesse(dir, 0);
	}

	/**
	 * Hilfsmethode (wahre Methode) von getGroesse(Lied l)
	 */
	public long getGroesse(File dir, long groesse) {
		if (dir.isFile())
			return dir.length();
		if (dir.isDirectory()) {
			for (File f : dir.listFiles())
				groesse += getGroesse(f, groesse);
			return groesse;
		}
		return 0;
	}

	/**
	 * Überprüft per "Binäre Suche" aus einem Array ein Element auf Existens
	 * 
	 * @param a: Das Array
	 * @param s: Das gesuchte Element
	 * @return Ob es vorhanden ist oder nicht
	 */
	public boolean binSuche(int[] a, int s) {
		return binSuche(0, a.length, a, s);
	}

	/**
	 * Hilfsmethode (wahre Methode) von binSuche(Lied l)
	 */
	public boolean binSuche(int l, int r, int[] ar, int s) {// Ziemlich viel komplieziertes-ich weiß
		if (ar[(r + l) / 2] == s) {
			System.out.println(s + " Gefunden an Stelle: " + (r + l) / 2);
			return true;
		}
		if (r - l == 1) {
			System.out.println(s + " nicht gefunden!");
			return false;
		}
		if (s > ar[(r + l) / 2])
			return binSuche((r + l) / 2, r, ar, s);
		if (s < ar[(r + l) / 2])
			return binSuche(l, (r + l) / 2, ar, s);
		return false;
	}
}
