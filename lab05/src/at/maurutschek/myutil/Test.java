package at.maurutschek.myutil;

/**
 * Testet Methoden aus Rekursion
 * 
 * @author Fabian Maurutschek
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Rekursionen r = new Rekursionen();
		int[] n = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Fakultät: " + r.fakultaet(0));
		System.out.println("GGT: " + r.ggT(1, 2));
		System.out.println("Summe: " + r.getSummel(4));
		System.out.print("Teilbar: ");
		r.teilbar(-8, 20, 6);
		System.out.println();
		System.out.println("sumIterativ(): ");
		r.sumIterativ(n);
		System.out.println();
		System.out.println("sumRekursiv(): ");
		r.sumRekursiv(n);
		System.out.println();
		System.out.println("sumRekursivRueckwaerts(): ");
		r.sumRekursivRueckwaerts(n);
		System.out.println();
		System.out.print("folge1(): ");
		r.folge1(50, 40);
		System.out.println();
		System.out.println("ziffernsumme(): " + r.ziffernsumme(546));
		System.out.println("baum(): ");
		r.baum(5);
		System.out.println("void falling(): ");
		r.falling(500, 5);
	}

}
