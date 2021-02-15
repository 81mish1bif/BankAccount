package mish1bif_hft_stuttgart.de;

public class Konto implements IKonto {
	
	protected static double KontoNummer;
	protected static String kontoInhaber;
	protected static double kontoStand;
	
	public Konto(double kontoNummer, String KontoInhaber, double kontoStand) {
		this.KontoNummer = kontoNummer;
		this.kontoInhaber = kontoInhaber;
		this.kontoStand = kontoNummer;
	}
	
   public String toString() {
	   
	   return "Konto Nummer:" + "\t" + this.KontoNummer + "Konto Inhaber:" + "\t" + this.kontoInhaber + "KontoStand:" + "\t" + this.kontoStand ;
   }

@Override
public double ueberweisung(double aktuellSt) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double geldAbziehen() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double guthaben() {
	// TODO Auto-generated method stub
	return 0;
}

}
