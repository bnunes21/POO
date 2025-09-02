package RafazendoExercicio1;

public class LavaLouca extends Eletrodomestico{

	private double litros;
	
	public LavaLouca() {
		super();
	}

	public LavaLouca(String modelo, String fabricante, double consumo) {
		super(modelo, fabricante, consumo);
	}

	public LavaLouca(String modelo, String fabricante, double consumo, double litros) {
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
