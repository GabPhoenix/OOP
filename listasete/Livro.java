package aulas.listasete;


public class Livro {
	private String autor;
	private String editora;
	private String ISBN;
	private String titulo;
	private int anoDeEdicao;
	
	public Livro(String autor, String editora, String ISBN, String titulo, int anoDeEdicao) {
		this.autor = autor;
		this.editora = editora;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.anoDeEdicao = anoDeEdicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDeEdicao() {
		return anoDeEdicao;
	}

	public void setAnoDeEdicao(int anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}
	
	
}
