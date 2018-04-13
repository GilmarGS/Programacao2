package colecoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MainColecoes {
	
	private static HashMap<String, Aluno> alunos;
	private static HashSet<Livro> livros;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		alunos = new HashMap<String, Aluno>();
		livros = new HashSet<Livro>();
		
		//inserindo alunos no mapa com a matricula como chave
		Aluno aluno = new Aluno("Padawan", "1", "pad_gatinho@");
		Aluno aluno1 = new Aluno("Kalicia Danny", "2", "danny_dragonqueen@email");
		alunos.put("1", aluno);
		alunos.put("2", aluno1);
		/*System.out.println(alunos.get("1"));
		System.out.println(alunos.get("2"));*/
		
		//inserindo livros no conjunto
		Livro livro = new Livro("A Guerra dos Tronos", "1");
		Livro livro1 = new Livro("A Furia dos Reis", "2");
		livros.add(livro);
		livros.add(livro1);
		livros.add(livro1);
		System.out.println(exibeLivros(livro));
		System.out.println(exibeAluno(sc));
	}
	public static String exibeLivros(Livro livro) {
		String retorno = "";
		for(Livro l : livros) {
			retorno += l.toString() + "\n";
		}
		return retorno;
	}
	public static String exibeAluno(Scanner sc) {
		
		System.out.print("Digite a matricula do aluno: ");
		String matricula = sc.nextLine();
		String retorno = alunos.get(matricula).toString();
		return retorno;
	}
}
