package mish1bif_hft_stuttgart.de;

import java.util.Scanner;

public class MainClass extends Konto{
 
public MainClass(double kontoNummer, String KontoInhaber, double kontoStand) {
		super(kontoNummer, KontoInhaber, kontoStand);
		// TODO Auto-generated constructor stub
	}

static Konto kunde;  
 static Scanner input = new Scanner(System.in);
	
 

	public static void main(String[] args) {
	 kunde = new Konto( 1,"Mustermann", 121);
	 System.out.print(kunde().toString());
	}
 

	public Konto getKunde() {
		return kunde;
	}

	public void setKunde(Konto kunde) {
		this.kunde = kunde;
	}

	private static Konto kunde( ) {
  
		return kunde ;
		}
	
	
	 
}
