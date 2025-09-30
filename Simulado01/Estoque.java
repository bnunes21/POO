package Simulado01;

import java.util.ArrayList;

public class Estoque {
private String Responsavel;
private Remedio []remedios;
public Estoque(String responsavel, Remedio[] remedios) {
	super();
	Responsavel = responsavel;
	this.remedios = remedios;
}
public Estoque() {
	super();
}
public String getResponsavel() {
	return Responsavel;
}
public void setResponsavel(String responsavel) {
	Responsavel = responsavel;
}
public Remedio[] getRemedios() {
	return remedios;
}
public void setRemedios(Remedio[] remedios) {
	this.remedios = remedios;
	
	}

}





