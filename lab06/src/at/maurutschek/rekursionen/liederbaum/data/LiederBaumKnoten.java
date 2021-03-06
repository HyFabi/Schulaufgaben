package at.maurutschek.rekursionen.liederbaum.data;

/**
 * Liederbaumknoten - Ein einzelner Knoten
 * 
 * @author Fabian Maurutschek
 *
 */
public class LiederBaumKnoten {
	private Lied l;
	private LiederBaumKnoten rechts;
	private LiederBaumKnoten links;

	/**
	 * Konstrukter bekommt ein Lied
	 * 
	 * @param l: Lied
	 */
	public LiederBaumKnoten(Lied l) {
		setLied(l);
	}

	/**
	 * GIbt das Lied zurück
	 * 
	 * @return
	 */
	public Lied getLied() {
		return this.l;
	}

	/**
	 * Setzt das Lied Darf nicht null sein
	 * 
	 * @param l: Lied
	 */
	public void setLied(Lied l) {
		if (l != null)
			this.l = l;
	}

	/**
	 * Gibt den Knoten rechts zurück
	 * 
	 * @return der knoten wenn null dann null
	 */
	public LiederBaumKnoten getRechts() {
		return this.rechts;
	}

	/**
	 * setzt den Kenoten rechts
	 * 
	 * @param rechts: Knoten
	 */
	public void setRechts(LiederBaumKnoten rechts) {
		this.rechts = rechts;
	}

	/**
	 * Gibt den Knoten links zurück
	 * 
	 * @return der knoten wenn null dann null
	 */
	public LiederBaumKnoten getLinks() {
		return this.links;
	}

	/**
	 * setzt den Kenoten links
	 * 
	 * @param links: Knoten
	 */
	public void setLinks(LiederBaumKnoten links) {
		this.links = links;
	}

}
