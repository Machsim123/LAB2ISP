package VM_MAX;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Automobil extends Vehicul {
	TipCombustibilSursaPutere tip;
	TipTransmisie cutieViteze;
	public Automobil(int vit, String mod, TipCombustibilSursaPutere comb, TipTransmisie trans)
	{
		super(vit,mod);
		this.tip = comb;
		this.cutieViteze = trans;
	}
	public void afisare()
	{	
		super.afisare();
		System.out.println("tip: " + tip);
		System.out.println("cutieViteze: " + cutieViteze);
		System.out.println();
	}
	public void salvare(String numeFisier)
	{ 
		  File logFile = new File(numeFisier); 
		  PrintWriter filePrint; 
		  try 
		  {  
			  logFile.createNewFile(); 
		  }catch (IOException e1)
		  { // TODO Auto-generated catch block 
		       e1.printStackTrace(); 
		  } 
		  FileWriter testWriter; 
		  try
		  { 
			  testWriter = new FileWriter(logFile); 
			  filePrint = new PrintWriter(testWriter,true); 
			  filePrint.println("Viteza maxima: " + this.vitezaMaxima);
			  filePrint.println("Model: " + this.model);
			  filePrint.println("TipCombustibilSursaPutere: " + this.tip);
			  filePrint.println("TipTransmisie: " + this.cutieViteze);
		  }catch (IOException e)
		  { // TODO Auto-generated catch block 
		      e.printStackTrace(); 
		 
		  } 
	} 
}

