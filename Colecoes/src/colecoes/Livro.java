package colecoes;

public class Livro {
	private String titulo;
	private String id;
	
	public Livro(String titulo, String id) {
		this.titulo = titulo;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.titulo + " - " + this.id;
	}
}
