package no.hvl.dat109;

/**
 * Definerer en leieavtale
 * @author Audun
 *
 */
public class Leieavtale {
	private int kredittkort;
	private String regNummer;
	private int kmStand;
	private String datoUt;
	private String klokkeUt;
	private String datoForventetInn;
	private String klokkeForventetInn;
	private String datoFaktiskInn;
	private String klokkeFaktiskInn;
	private int kmStandEtter;
	private Kunde kunde;
	
	/**
	 * Lager en ny leieavtale
	 * @param kredittkort
	 * @param regNummer
	 * @param kmStand
	 * @param datoUt
	 * @param klokkeUt
	 * @param datoForventetInn
	 * @param klokkeForventetInn
	 * @param kunde
	 */
	public Leieavtale(int kredittkort, String regNummer, int kmStand, String datoUt, String klokkeUt,
			String datoForventetInn, String klokkeForventetInn, Kunde kunde) {
		this.kredittkort = kredittkort;
		this.regNummer = regNummer;
		this.kmStand = kmStand;
		this.datoUt = datoUt;
		this.klokkeUt = klokkeUt;
		this.datoForventetInn = datoForventetInn;
		this.klokkeForventetInn = klokkeForventetInn;
		this.kunde = kunde;
		datoFaktiskInn = "Ukjent";
		klokkeFaktiskInn = "Ukjent";
		kmStandEtter = -1;
	}

	public int getKredittkort() {
		return kredittkort;
	}

	public void setKredittkort(int kredittkort) {
		this.kredittkort = kredittkort;
	}

	public String getRegNummer() {
		return regNummer;
	}

	public void setRegNummer(String regNummer) {
		this.regNummer = regNummer;
	}

	public int getKmStand() {
		return kmStand;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public String getDatoUt() {
		return datoUt;
	}

	public void setDatoUt(String datoUt) {
		this.datoUt = datoUt;
	}

	public String getKlokkeUt() {
		return klokkeUt;
	}

	public void setKlokkeUt(String klokkeUt) {
		this.klokkeUt = klokkeUt;
	}

	public String getDatoForventetInn() {
		return datoForventetInn;
	}

	public void setDatoForventetInn(String datoForventetInn) {
		this.datoForventetInn = datoForventetInn;
	}

	public String getKlokkeForventetInn() {
		return klokkeForventetInn;
	}

	public void setKlokkeForventetInn(String klokkeForventetInn) {
		this.klokkeForventetInn = klokkeForventetInn;
	}

	public String getDatoFaktiskInn() {
		return datoFaktiskInn;
	}

	public void setDatoFaktiskInn(String datoFaktiskInn) {
		this.datoFaktiskInn = datoFaktiskInn;
	}

	public String getKlokkeFaktiskInn() {
		return klokkeFaktiskInn;
	}

	public void setKlokkeFaktiskInn(String klokkeFaktiskInn) {
		this.klokkeFaktiskInn = klokkeFaktiskInn;
	}

	public int getKmStandEtter() {
		return kmStandEtter;
	}

	public void setKmStandEtter(int kmStandEtter) {
		this.kmStandEtter = kmStandEtter;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	
}
