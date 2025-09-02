package RafazendoExercicio1;

public class Fogao extends Eletrodomestico {
	
	private int bocas;

	public Fogao(String modelo, String fabricante, double consumo, int bocas) {
		super(modelo, fabricante, consumo);
		this.bocas = bocas;
	}
	public Fogao() {
		super();
	}

	public Fogao(String modelo, String fabricante, double consumo) {
		super(modelo, fabricante, consumo);
	}

	public int getBocas() {
		return bocas;
	}

	public void setBocas(int bocas) {
		this.bocas = bocas;
	}


}
