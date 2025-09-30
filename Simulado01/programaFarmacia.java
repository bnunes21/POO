package Simulado01;

import java.util.ArrayList;

public class programaFarmacia {

	public static void main(String[] args) {
	
	Endereco endereco1 = new Endereco("RUA DOS REMEDIOS", 100, "Centro", "Palhoça", "Santa Catarina");	
	Endereco endereco2 = new Endereco("RUA DA MEDICAÇÃO", 200, "Estreito", "Florianópolis", "Santa Catarina");
	Endereco endereco3 = new Endereco("RUA JARDIM SILVA", 360, "Centro", "Florianópolis", "Santa Catarina");
	
	Laboratorio legrand = new Laboratorio ("Legrand", "12.345.678/0001-11", endereco1);
	Laboratorio medley = new Laboratorio ("Medley", "12.345.678/0001-22", endereco2);
	
	Remedio Rosuvas = new Remedio("Rosuvas", 55.00, legrand);
	Remedio Glifage = new Remedio("Glifage", 35.00, legrand);
	Remedio Aradois = new Remedio("Aradois h", 50.00, legrand);
	Remedio Trandilax = new Remedio("Trandilax", 10.00, legrand);
	
	Remedio Rosuvastatina = new Remedio("Rosuvastatina", 50.00, medley);
	Remedio Lexotan = new Remedio("Lexotan", 40.00, medley);
	Remedio Lozartana = new Remedio("Lozartana", 45.00, medley);
	Remedio Torcilax = new Remedio("Torcilax", 15.00, medley);
	
	Remedio[] remedios = {Rosuvas, Rosuvas, Rosuvas, Rosuvas, 
			Glifage, Glifage, Glifage, 
			Aradois, Aradois, 
			Trandilax, 
			Rosuvastatina, 
			Lexotan, Lexotan, 
			Lozartana, Lozartana, Lozartana, 
			Torcilax, Torcilax, Torcilax };
	
	Estoque estoque = new Estoque("Luciano",remedios);
	Farmacia farm = new Farmacia("Farmácia do Senac", "12.345.678/0001-33", endereco3, estoque);
	
	//3a
	// String responsavel = farm.recuperarResponsavelEstoque(); - esse é uma outra opção
	System.out.println("Responsavel pelo estoque "+farm.recuperarResponsavelEstoque());
	
	//3b
	double totalEstoque = farm.calcularTotalEstoque();
	System.out.println("O Estoque total da farmacia é: R$ " +totalEstoque);
	
	//3c
	double totalEstoqueLegrand = farm.calcularTotalEstoqueLab("legrand");
	System.out.println("O estoque total de remédios legrand: " +totalEstoqueLegrand);
	
	
	//3d
	farm.recuperarInfoLab("Medley");

}
}
