package RafazendoExercicio1;

public class Eletrodomestico {
	
	private String modelo;
	private String fabricante;
	private double consumo;
	
	public Eletrodomestico(String modelo, String fabricante, double consumo) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.consumo = consumo;
	}
	public Eletrodomestico() {
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
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public double calcMensal () {
		return consumo*30;
	}
	
	
	public double thenDay() {
		return consumo*10;
	}
			
}
