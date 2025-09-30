package Simulado02;

public class programaEscola {

	public static void main(String[] args) {
Endereco end1 = new Endereco("Rua das Jujubas", 100, "Campeche", "Florianópolis", "Santa Catarina");
Endereco end2 = new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "Santa Catarina");
Endereco end3 = new Endereco("Rua dos Caramelos", 300, "Kobrasol", "São José", "Santa Catarina");
Endereco end4 = new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianópolis", "Santa Catarina");
Endereco end5 = new Endereco("Rua dos Chicletes", 500, "Aririú", "Palhoça", "Santa Catarina");

Endereco end6 = new Endereco("Rua dos Bombons", 600, "Forquilinhas", "São José", "Santa Catarina");
Endereco end7 = new Endereco("Rua das Balas", 700, "Copoeiras", "Florianópolis", "Santa Catarina");
Endereco end8 = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "Santa Catarina");
Endereco end9 = new Endereco("Rua dos Doces", 900, "Campeche", "Florianópolis", "Santa Catarina");
Endereco end10 = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianópolis", "Santa Catarina");

Endereco end11 = new Endereco("Rua das Enciclopédias", 500, "Centro", "Florianópolis", "Santa Catarina");
Endereco end12 = new Endereco("Rua dos Dicionários", 750, "Centro", "Florianópolis", "Santa Catarina");
Endereco end13 = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "Santa Catarina");


Aluno aluno1 = new Aluno(end1, "Juliana Silva", 15);
Aluno aluno2 = new Aluno(end2, "Daniele Veiga", 14);
Aluno aluno3 = new Aluno(end3, "Bruna Andrade", 13);
Aluno aluno4 = new Aluno(end4, "Helena Andrade", 16);
Aluno aluno5 = new Aluno(end5, "Mary Souza", 15);

Aluno aluno6 = new Aluno(end6, "Paula Vieira", 14);
Aluno aluno7 = new Aluno(end7, "Renata Augusta", 15);
Aluno aluno8 = new Aluno(end8, "Luiza Pires", 15);
Aluno aluno9 = new Aluno(end9, "Beatriz Santos", 14);
Aluno aluno10 = new Aluno(end10, "Suellen Lima", 17);

Professor prof1 = new Professor(end11,"Zeca", 45, "Matemática");
Professor prof2 = new Professor(end12,"Pires", 40, "Português");

Aluno[] alunosTurmaA = {aluno1, aluno2, aluno3, aluno4, aluno5};
Aluno[] alunosTurmaB = {aluno6, aluno7, aluno8, aluno9, aluno10};
Aluno[] alunosAB = {aluno1, aluno2, aluno3, aluno4, aluno5,aluno6, aluno7, aluno8, aluno9, aluno10};

Turma turmaA = new Turma(7,alunosTurmaA, prof1 );
Turma turmaB = new Turma(8,alunosTurmaB, prof2 );

Turma [] turmas = {turmaA, turmaB };

Escola escola = new Escola (end13, "Escola Básica das Meninas de FLorianópolis", "3232-3232", turmas);

escola.contabilizarAlunas();

System.out.println(escola.localizarEnderecoRegente("Pires"));

escola.localizarAlunosPorSerie(7);

escola.identificarRegenteNovo();

escola.identificarAlunosCidade("São José");

	}

}
