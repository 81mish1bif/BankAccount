package mish1bif_hft_stuttgart.de;

public interface IKonto {
 
	public final double MAXSUMMEUEBERWEISUNG = 1000;
	
	abstract double ueberweisung(double aktuellSt);
	abstract double geldAbziehen();
	abstract double guthaben();
}
