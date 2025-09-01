package Exercicios_2;

public class Marcenaria {
	private String modelo;
	private String fabricante;
	private int Rotacao_rpm;
	private int potencia;
	private double volts;
	private String tipo;
	private int tamanho;
	private int kg;
	private double hora_uso;
	
	
	public Marcenaria(String modelo, String fabricante, int rotacao_rpm, int potencia, double volts, String tipo, int tamanho, int kg, double hora_uso) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.Rotacao_rpm = rotacao_rpm;
		this.potencia = potencia;
		this.volts = volts;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.kg = kg;
		this.hora_uso=hora_uso;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Marcenaria() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getRotacao_rpm() {
		return Rotacao_rpm;
	}

	public void setRotacao_rpm(int rotacao_rpm) {
		Rotacao_rpm = rotacao_rpm;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public double gethora_uso() {
		return hora_uso;
	}

	public void sethora_uso(double hora_uso) {
		this.hora_uso = hora_uso;
	}
	
	public double calcDesgaste (double hora_uso) {
		double calc = (hora_uso*0.100);
		double calculo = (100-calc);
		return calculo;
	}
	public double calcWatts (double hora_uso, double volts) {
		double calc =(hora_uso*volts);
		return calc;
	}
	public double calcSemana (double hora_uso, double volts ) {
		double calc =(hora_uso*volts);
		double semana = calc*7;
		return semana; 
	}
	public double calcMes (double hora_uso, double volts ) {
		double calc =(hora_uso*volts);
		double mes = calc*30;
		return mes; 
	}
		
}
