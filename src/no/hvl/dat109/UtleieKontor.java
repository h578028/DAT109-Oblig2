package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer et utleiekontor
 * @author Audun
 *
 */
public class UtleieKontor {
	private int kontorNr;
	private Adresse adresse;
	private int tlfNr;
	private List<Leiebil> leiebiler;
	private List<Kunde> kunder;
	private UtleieSelskap selskap;
	
	/**
	 * Lager et nytt utleiekontor
	 * @param kontorNr
	 * @param adresse
	 * @param tlfNr
	 * @param selskap
	 */
	public UtleieKontor(int kontorNr, Adresse adresse, int tlfNr, UtleieSelskap selskap) {
		this.kontorNr = kontorNr;
		this.adresse = adresse;
		this.tlfNr = tlfNr;
		this.selskap = selskap;
		leiebiler = new ArrayList<Leiebil>();
		kunder = new ArrayList<Kunde>();
	}
	
	/**
	 * Legger til en kunde i kontoret
	 * @param kunde
	 */
	public void leggTilKunde(Kunde kunde) {
		kunder.add(kunde);
	}
	
	/**
	 * Fjerner en kunde fra kontoret
	 * @param kunde
	 */
	public void fjernKunde(Kunde kunde) {
		kunder.remove(kunde);
	}
	
	public List<Kunde> getKunder() {
		return kunder;
	}
	
	/**
	 * Legger en bil til i kontoret
	 * @param bil
	 */
	public void leggTilBil(Leiebil bil) {
		leiebiler.add(bil);
	}
	
	/**
	 * Fjerner en bil fra kontoret
	 * @param bil
	 */
	public void fjernBil(Leiebil bil) {
		leiebiler.remove(bil);
	}
	
	public List<Leiebil> getLeiebiler() {
		return leiebiler;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public int getTlfNr() {
		return tlfNr;
	}
	public void setTlfNr(int tlfNr) {
		this.tlfNr = tlfNr;
	}
	public int getKontorNr() {
		return kontorNr;
	}
	public UtleieSelskap getSelskap() {
		return selskap;
	}
	
	
}
