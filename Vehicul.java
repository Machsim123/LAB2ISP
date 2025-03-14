package VM_MAX;

public class Vehicul {
	protected int vitezaMaxima;
	protected String model;
	public Vehicul(int vit, String mod)
	{
		this.vitezaMaxima = vit;
		this.model = mod;
	}
	public void afisare()
		{
			System.out.println("vitezaMaxima: " + vitezaMaxima);
			System.out.println("model: " + model);
			System.out.println();
		}
}
