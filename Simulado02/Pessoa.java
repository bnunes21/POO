package Simulado02;

public abstract class Pessoa {
	private Endereco endereco;
	private String nome;
	private int idade;
	
	public Pessoa(Endereco endereco, String nome, int idade) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		super();
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "\nendereco=" + this.getEndereco() 
		+ "\nnome=" + this.getNome() 
		+ "\nidade=" + this.getIdade();
	}
	
	

}
