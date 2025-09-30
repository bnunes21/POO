package Simulado02;

public class Professor extends Pessoa{

	private String Disciplina;

	public Professor(Endereco endereco, String nome, int idade, String disciplina) {
		super(endereco, nome, idade);
		Disciplina = disciplina;
	}

	public Professor() {
		super();
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
	
	
}
