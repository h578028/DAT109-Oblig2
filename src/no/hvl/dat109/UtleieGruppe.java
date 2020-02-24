package no.hvl.dat109;

/**
 * Definerer en utleiegruppe
 * @author Audun
 *
 */
public enum UtleieGruppe {
	A(200), B(300), C(400), D(500);
	
	private int pris;
	
	/**
	 * Henter verdien av en gruppe
	 * @return pris
	 */
	public int getPris() {
		return pris;
	}
	
	private UtleieGruppe(int pris) {
		this.pris = pris;
	}
	
}
