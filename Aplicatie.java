package VM_MAX;

public class Aplicatie {
	public static void main(String args[])
	{
		Automobil masina = new Automobil(120,"masin",TipCombustibilSursaPutere.PeMotorina, 
				TipTransmisie.Manuala);
		masina.afisare();
		masina.salvare("FisierulMeuMAX.txt");
	}
}
