package RafazendoExercicio1;

public class LavadoraRoupa extends Eletrodomestico{

	private double capacidadeQuilo;

	public LavadoraRoupa(String modelo, String fabricante, double consumo, double capacidadeQuilo) {
		super(modelo, fabricante, consumo);
		this.capacidadeQuilo = capacidadeQuilo;
	}

	public LavadoraRoupa() {
		super();
	}

	public LavadoraRoupa(String modelo, String fabricante, double consumo) {
		super(modelo, fabricante, consumo);
	}

	public double getCapacidadeQuilo() {
		return capacidadeQuilo;
	}

	public void setCapacidadeQuilo(double capacidadeQuilo) {
		this.capacidadeQuilo = capacidadeQuilo;
	}

	
}
