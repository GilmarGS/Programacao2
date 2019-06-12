package colecoes;

public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	private String cpf;
	
	public Aluno(String nome, String matricula, String email, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getEmail() {
		return email;
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.cpf + " - "  + this.email;
	}
}
