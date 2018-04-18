package exemplo;

import java.util.HashMap;

public class Main {
	private static HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
	public static void main(String[] args) {
		cadastrarAluno("Chica do Pote", "25", "gilmar@");
		cadastrarAluno("Cebruthius", "40", "cece_bruthius@");
		cadastrarAluno("Dona Maria", "13", "dona_maria@gmail");
		System.out.println("Alunos cadastrados com sucesso");
		System.out.println("Total de pessoas cadastrados: " + quantidadeDePessoasCadastrados());		
		removerAluno("25"); 
		System.out.println(verificaSeAlunoEstaCadastrado("13"));
		System.out.println(recuperaAluno("13"));	
		
	}
	
	private static Aluno criaAluno(String nome, String matricula, String email) {
		Aluno aluno = new Aluno(nome, matricula, email);
		return aluno;
	}
	
	//utilize o método criaAluno() para cadastrar um novo aluno no mapa.
	//importante: a chave(o que identifica um aluno) é a matrícula.
	//Ex: Para cadastrar um funcionario que tem como identificador único a String pis. 
	// funcionarios.put(pis, funcionario);
	private static void cadastrarAluno(String nome, String matricula, String email) {

		
	}
	// remova um aluno do mapa. Esse método é solucionado com apenas uma linha de código.
	private static void removerAluno(String matricula) {
		
		
	}
	//verifique a quantidade alunos cadastrados. Esse método é solucionado com apenas uma linha de código.
	private static int quantidadeDePessoasCadastrados() {
		
	}
	//verifique se um aluno está cadastrado. Com apenas uma linha de codigo.
	private static boolean verificaSeAlunoEstaCadastrado(String matricula) {
		
	}
	//exibe um determindado aluno cadastrado. Com apenas uma linha de codigo.
	private static String recuperaAluno(String matricula) {