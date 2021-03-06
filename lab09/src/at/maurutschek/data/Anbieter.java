package at.maurutschek.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Fabian Maurutschek
 * @version 1.0 lab09
 *
 */
public class Anbieter{
	List<Handy> handies;

	public Anbieter(){
		handies = new LinkedList<>();
	}

	public int add(Handy h){
		if(handies.contains(h))
			return -1;
		handies.add(h);
		return 0;
	}

	public boolean del(Handy h){
		return handies.remove(h);
	}

	// TODO überprüfen auf alles Ausgeben
	public void ausgeben(String vorwahl){
		if(vorwahl == null)
			vorwahl = "";
		for(Handy h : handies)
			if(h.getTelefonnummer().startsWith(vorwahl))
				System.out.println(h);
	}

	public LinkedList<Handy> abgelaufeneHandys(){
		ueberpruefeObGesperrt();
		LinkedList<Handy> l = new LinkedList<>();
		for(Handy h : handies)
			if(h.isGesperrt())
				l.add(h);
		return l;
	}

	private void ueberpruefeObGesperrt(){
		for(Handy h : handies)
			if(h.wielange().isNegative())
				h.setGesperrt(true);
	}

	public void delGesperrteHandys(){
		ueberpruefeObGesperrt();

		Iterator<Handy> i = handies.iterator();
		while(i.hasNext())
			if(i.next().isGesperrt())
				i.remove();
	}
}
