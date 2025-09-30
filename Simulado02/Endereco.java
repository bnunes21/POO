package Simulado02;

public class Endereco {
	
	private String rua; 
	private int Numero;
	private String Bairro;
	private String Cidade;
	private String estado;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
		super();
		this.rua = rua;
		Numero = numero;
		Bairro = bairro;
		Cidade = cidade;
		this.estado = estado;
	}
	public Endereco() {
		super();
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return ""
				+ "\nRua: " + this.getRua() 
		+ "\nNumero: " + this.getNumero() 
		+ "\nBairro: " + this.getBairro() 
		+ "\nCidade: " + this.getCidade() 
		+ "\nestado: "+ this.getEstado();
	}
	
	
}
