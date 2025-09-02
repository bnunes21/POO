package RafazendoExercicio1;

public class Geladeira extends Eletrodomestico{
	private double litros;
	
	public Geladeira() {
		super();
	}

	public Geladeira(String modelo, String fabricante,  double consumo) {
		super(modelo, fabricante, consumo);
	}

	public Geladeira(String modelo, String fabricante, double consumo, double litros) {
		super(modelo, fabricante, consumo);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	
}
