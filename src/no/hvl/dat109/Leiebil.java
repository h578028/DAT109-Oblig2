package no.hvl.dat109;

/**
 * Definerer en leiebil
 * @author Audun
 *
 */
public class Leiebil {
	private String regNummer;
	private String merke;
	private String modell;
	private String farge;
	private UtleieGruppe leiegruppe;
	private boolean ledig;
	private UtleieKontor kontor;
	private int kmStand;
	
	/**
	 * Lager ny leiebil
	 * @param regNummer
	 * @param merke
	 * @param modell
	 * @param farge
	 * @param leiegruppe
	 * @param kontor
	 */
	public Leiebil(String regNummer, String merke, String modell, String farge, UtleieGruppe leiegruppe,
			UtleieKontor kontor) {
		this.regNummer = regNummer;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.leiegruppe = leiegruppe;
		this.kontor = kontor;
		kmStand = 0;
		ledig = true;
	}

	public String getRegNummer() {
		return regNummer;
	}

	public void setRegNummer(String regNummer) {
		this.regNummer = regNummer;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}

	public UtleieKontor getKontor() {
		return kontor;
	}

	public void setKontor(UtleieKontor kontor) {
		this.kontor = kontor;
	}

	public int getKmStand() {
		return kmStand;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public String getMerke() {
		return merke;
	}

	public String getModell() {
		return modell;
	}

	public UtleieGruppe getLeiegruppe() {
		return leiegruppe;
	}
	
	
}
