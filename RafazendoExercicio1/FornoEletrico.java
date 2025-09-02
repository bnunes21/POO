package RafazendoExercicio1;

public class FornoEletrico extends Eletrodomestico {

	private double litros;
	public FornoEletrico() {
		super();
	}

	public FornoEletrico(String modelo, String fabricante, double consumo) {
		super(modelo, fabricante, consumo);
	}
	
	
	
public FornoEletrico(String modelo, String fabricante, double consumo, double litros) {
		super(modelo, fabricante, consumo);
		this.litros = litros;
	}

public double getLitros() {
	return litros;
}

public void setLitros(double litros) {
	this.litros = litros;
}
public double consumoDia () {
return getConsumo()*0.25;
}
public double consumoDias () {
	return consumoDia()* 10 + this.thenDay() ;
}
public double consumoMensal () {
	return consumoDia()* 30 + this.calcMensal();
}
}

