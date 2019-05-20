package biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
	private boolean statusEmprestimo;
	String localizacao;
	String descricao;
	
	public LivroDeBiblioteca(String _titulo,String  _autor, int _numeroDePaginas, int _anoEdicao, String _localizacao, String _descricao, boolean _statusEmprestimo) {
		super(_titulo, _autor, _numeroDePaginas, _anoEdicao);
		this.setLivroDeBiblioteca(_localizacao, _descricao, _statusEmprestimo);
	}
	public String getLocalizacao() {
		return this.localizacao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setLivroDeBiblioteca(String _localizacao ,String _descricao, boolean _statusEmprestimo) {
		this.localizacao = _localizacao;
		this.descricao = _descricao;
		this.statusEmprestimo = _statusEmprestimo;
	}
	
	@Override
	public boolean isEmprestado() {
		if (statusEmprestimo == true) return true;
		else return false;
	}
	
	@Override
	public void empresta() {
		this.statusEmprestimo = true;
	}
	
	@Override
	public String localiza() {
		return this.getTitulo();
	}
	@Override
	public String devolve() {
		this.statusEmprestimo = false;
		return this.getTitulo();
	}
	@Override
	public String apresentaDescricao() {
		System.out.println("" + this.getTitulo());
		return this.getTitulo();
	}
}
