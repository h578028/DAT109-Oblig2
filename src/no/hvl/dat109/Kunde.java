package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer en kunde
 * @author Audun
 *
 */
public class Kunde {
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private int telefonnummer;
	private List<Leieavtale> leieavtaler;
	
	/**
	 * Lager ny kunde
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param telefonnummer
	 */
	public Kunde(String fornavn, String etternavn, Adresse adresse, int telefonnummer) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		leieavtaler = new ArrayList<Leieavtale>();
	}

	/**
	 * Legger til en ny avtale hos kunden
	 * @param avtale
	 */
	public void leggTilAvtale(Leieavtale avtale) {
		leieavtaler.add(avtale);
	}
	
	/**
	 * Fjerner en avtale hos kunden
	 * @param avtale
	 */
	public void fjernAvtale(Leieavtale avtale) {
		leieavtaler.remove(avtale);
	}
	
	public List<Leieavtale> getLeieavtaler() {
		return leieavtaler;
	}
	
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	
}
