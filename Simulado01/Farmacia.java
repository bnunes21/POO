package Simulado01;

public class Farmacia extends Empresa{

	private Estoque estoque;

	public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public Farmacia() {
		super();
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public String recuperarResponsavelEstoque() {
		
		return this.getEstoque().getResponsavel();
	}

	public double calcularTotalEstoque() {
		double total = 0;
		for(int i= 0; i<this.getEstoque().getRemedios().length; i++) {
			total += this.getEstoque().getRemedios()[i].getPreco();
			
		}
		
		return total;
	}

	public double calcularTotalEstoqueLab(String laboratorio) {
		double total =0;
		for (int i=0; i<this.getEstoque().getRemedios().length; i++) {
			if (this.getEstoque().getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(laboratorio)) {
			total+= this.getEstoque().getRemedios()[i].getPreco();
		}
		}
		return total;
	}
public void recuperarInfoLab(String lab) {
	Laboratorio laboratorio =null;
	for (int i=0; i<this.getEstoque().getRemedios().length; i++) {
		if(this.getEstoque().getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(lab)) {
			laboratorio = this.getEstoque().getRemedios()[i].getLaboratorio();
		}
	}
	System.out.println("Informações do Laborátorio: " +lab);
	System.out.println(laboratorio);

}

}

	


