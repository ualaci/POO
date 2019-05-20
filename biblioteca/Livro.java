package biblioteca;

public class Livro {
	private String titulo;
	private String autor;
	int numeroDePaginas;
	int anoEdicao;
	
	public Livro() {
		setLivro("no Title", "Unknow", 0, 0);
	}
	
	public Livro(String _titulo, String _autor, int _numeroDePaginas, int _anoEdicao) {
		setLivro(_titulo, _autor, _numeroDePaginas, _anoEdicao);
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getNumeroDePaginas() {
		return this.numeroDePaginas;
	}
	
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	
	public void setLivro(String _titulo, String _autor, int _numeroDePaginas, int _anoEdicao) {
		this.anoEdicao = _anoEdicao;
		this.numeroDePaginas = _numeroDePaginas;
		this.autor = _autor;
		this.titulo = _titulo;
	}
	
	public String toString() {
		StringBuilder livro = new StringBuilder();
		livro.append("Titulo:");
		livro.append(this.titulo);
		livro.append(" | ");
		livro.append("Autor:");
		livro.append(this.autor);
		livro.append(" | ");
		livro.append("Numero de Paginas:");
		livro.append(this.numeroDePaginas);
		livro.append("Ano Edicao:");
		livro.append(this.anoEdicao);
		livro.append(" | ");
		return livro.toString();
	}
}
