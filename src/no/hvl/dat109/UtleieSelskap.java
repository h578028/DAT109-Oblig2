package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer et utleieselskap
 * @author Audun
 *
 */

//***************************************************
//Har ingen tester grunnet mangel på metoder å teste
//***************************************************
public class UtleieSelskap {
	private String firmaNavn;
	private int tlfNr;
	private Adresse firmaAdr;
	private List<UtleieKontor> kontorer;
	
	/**
	 * Lager et nytt selskap
	 * @param firmaNavn
	 * @param tlfNr
	 * @param firmaAdr
	 */
	public UtleieSelskap(String firmaNavn, int tlfNr, Adresse firmaAdr) {
		this.firmaNavn = firmaNavn;
		this.tlfNr = tlfNr;
		this.firmaAdr = firmaAdr;
		kontorer = new ArrayList<UtleieKontor>();
	}
	
	/**
	 * Metode for å søke, og skrive leiekontrakt. Ble ikke ferdig grunnet tid
	 * @param kontor
	 * @param datoUt
	 * @param klokkeUt
	 * @param antDager
	 */
	public void sok(UtleieKontor kontor, String datoUt, String klokkeUt, int antDager) {
		List<Leiebil> biler = kontor.getLeiebiler();
		for(UtleieGruppe g : UtleieGruppe.values()) {
			boolean gruppeLedig = false;
			for(Leiebil bil : biler) {
				if(bil.getLeiegruppe() == g) {
					gruppeLedig = true;
					break;
				}
			}
			if(gruppeLedig) {
				System.out.println("Gruppe " + g + ": " + g.getPris());
				
			}
		}
	}
	
	/**
	 * Legger til et kontor i selskapet
	 * @param kontor
	 */
	public void leggTilKontor(UtleieKontor kontor) {
		kontorer.add(kontor);
	}
	
	/**
	 * Fjerner et kontor fra selskapet
	 * @param kontor
	 */
	public void fjernKontor(UtleieKontor kontor) {
		kontorer.remove(kontor);
	}
	
	public List<UtleieKontor> getKontorer() {
		return kontorer;
	}
	
	public String getFirmaNavn() {
		return firmaNavn;
	}
	public void setFirmaNavn(String firmaNavn) {
		this.firmaNavn = firmaNavn;
	}
	public int getTlfNr() {
		return tlfNr;
	}
	public void setTlfNr(int tlfNr) {
		this.tlfNr = tlfNr;
	}
	public Adresse getFirmaAdr() {
		return firmaAdr;
	}
	public void setFirmaAdr(Adresse firmaAdr) {
		this.firmaAdr = firmaAdr;
	}
	
	
}

