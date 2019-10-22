package at.maurutschek.rekursionen.liederbaum.test;

import at.maurutschek.rekursionen.liederbaum.data.Lied;
import at.maurutschek.rekursionen.liederbaum.data.LiederBaum;

/**
 * Testklasse für Lied/LiederBaumKnoten/Liederbaum. Überprüft alle Methoden
 * 
 * @author Fabian Maurutschek
 *
 */
public class TestLiederBaum {

	public static void main(String[] args) throws Exception {
		Lied l1 = new Lied("affa", "a b", "C:\\", 100);
		LiederBaum lb = new LiederBaum(l1);
		
		System.out.println(lb.vorhanden(l1));
		System.out.println(lb.add(new Lied("affe", "a b", "C:\\", 100)));
		System.out.println(lb.add(new Lied("affx", "a b", "C:\\", 100)));
		System.out.println(lb.add(new Lied("affh", "a b", "C:\\", 100)));
		System.out.println(lb.add(new Lied("affy", "a b", "C:\\", 100)));
		lb.ausgeben();
		System.out.println(lb.sumLiederLaenge());
	}
}
