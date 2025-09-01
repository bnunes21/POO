package Exercicios_2;

public class Serrote extends Marcenaria {

	private int dentes ;

	public Serrote(String modelo, String fabricante, int rotacao_rpm, int potencia, int volts, String tipo, int tamanho,
			int kg, double hora_uso, int dentes) {
		super(modelo, fabricante, rotacao_rpm, potencia, volts, tipo, tamanho, kg, hora_uso);
		this.dentes = dentes;
	}

	public Serrote() {
		super();
	}

	public Serrote(String modelo, String fabricante, int rotacao_rpm, int potencia, double volts, String tipo, int tamanho,
			int kg, double hora_uso) {
		super(modelo, fabricante, rotacao_rpm, potencia, volts, tipo, tamanho, kg, hora_uso);
	}

	public int getDentes() {
		return dentes;
	}

	public void setDentes(int dentes) {
		this.dentes = dentes;
	}

	
}
