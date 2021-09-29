package aulas.listaoito;

public class Livro {
	private Autor autor;
	private Editora editora;
	private int ISBN, ano_De_Edição;
	private String titulo;
	
	public Livro(Autor autor, Editora editora, String titulo, int ISBN, int ano_De_Edição){
		this.autor = autor;
		this.editora = editora;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.ano_De_Edição = ano_De_Edição;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getAno_De_Edição() {
		return ano_De_Edição;
	}

	public void setAno_De_Edição(int ano_De_Edição) {
		this.ano_De_Edição = ano_De_Edição;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
