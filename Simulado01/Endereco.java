package Simulado01;

public class Endereco {
	
	private String rua;
	private int numero;
	private String Bairro;
	private String cidade;
	private String estado;
	public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.Bairro = bairro;
		this.cidade = cidade;
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
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "rua: " + this.getRua()
		+ "\nnumero: " + this.getNumero()
		+ "\nBairro: " + this.getBairro()
		+"\ncidade: " + this.getCidade()
		+"\nestado: " + this.getEstado();	

	}
		
}
