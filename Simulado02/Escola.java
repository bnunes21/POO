package Simulado02;

import java.util.ArrayList;

public class Escola {
	
	private Endereco enderecoEscola;
	private String nome;
	private String telefone;
	private Turma [] turmas;

	
	
	

	public Escola(Endereco enderecoEscola, String nome, String telefone, Turma[] turmas) {
		super();
		this.enderecoEscola = enderecoEscola;
		this.nome = nome;
		this.telefone = telefone;
		this.turmas = turmas;
	}

	public Escola() {
		super();
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}
	public void contabilizarAlunas() {
		int total=0;
		for (Turma turminha : this.getTurmas()) {
			total += turminha.getAlunos().length;
			}
			System.out.println("Total de alunos é : " +total);
		}

	public Endereco localizarEnderecoRegente(String nome) {
		Endereco endereco = null;
		for(Turma turminha : this.getTurmas()) {
		if(turminha.getRegente().getNome().equalsIgnoreCase(nome)) {
			endereco= turminha.getRegente().getEndereco();
		}
	}
		return endereco;
	}
	
	public void localizarAlunosPorSerie(int serie) {
		for(Turma turminha : this.getTurmas()) {
			if(turminha.getSerie()==serie) {
				System.out.println("\nAlunos da serie "+ serie);
					for(Aluno aluno : turminha.getAlunos()) {
						System.out.println(aluno.getNome());
				}
			}
		}
	}
	
	public void identificarRegenteNovo() {
				
		Professor regenteNovo = this.getTurmas()[0].getRegente();
		for(Turma turminha:this.getTurmas()) {
			if(turminha.getRegente().getIdade()<regenteNovo.getIdade()) {
				regenteNovo = turminha.getRegente();
			}
		}
		System.out.println("\n Regente mais novo é: " + regenteNovo.getNome());
	}
	public void identificarAlunosCidade(String cidade) {
		System.out.println("Alunos que moram na cidade : " + cidade);
		for(Turma turminha:this.getTurmas()) {
			for(Aluno aluno: turminha.getAlunos()) {
				if(aluno.getEndereco().getCidade().equalsIgnoreCase(cidade)) {
					System.out.println(aluno.getNome());
				}
			}
		}
	}
}


		
		
	

	

		
	
	
		
	


		
	
	

