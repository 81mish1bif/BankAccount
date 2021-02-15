package mish1bif_hft_stuttgart.de;

import java.util.Scanner;

public class MainClass extends Konto{
 static Konto kunde;  
 static Scanner input = new Scanner(System.in);
	
	public MainClass(double kontoNummer, String KontoInhaber, double kontoStand) {
		super(kontoNummer, KontoInhaber, kontoStand);
		
	}

	public static void main(String[] args) {
	 kunde = kunde(KontoNummer, kontoInhaber, KontoNummer);
	 System.out.print(kunde.toString());
	}
 

	public Konto getKunde() {
		return kunde;
	}

	public void setKunde(Konto kunde) {
		this.kunde = kunde;
	}

	private static Konto kunde(double KontoNr, String kontoIn, double kontoSt) {
		System.out.println("bitte Daten angeben:" + KontoNr );
		System.out.println("bitte Daten angeben:" + kontoIn );
		System.out.println("bitte Daten angeben:" + kontoSt );
		KontoNr = input.nextDouble();
		kontoIn = input.nextLine();
		kontoSt = input.nextDouble();
		return kunde;}
	
	

}
