package Exercicios_2;

public class Martelo extends Marcenaria{

	public Martelo() {
		super();
	}

	public Martelo(String modelo, String fabricante, int rotacao_rpm, int potencia, double volts, String tipo, int tamanho,
			int kg, double hora_uso) {
		super(modelo, fabricante, rotacao_rpm, potencia, volts, tipo, tamanho, kg, hora_uso);
	}
	
}
