package biblioteca;

public interface ItemDeBiblioteca {
	public boolean isEmprestado();
	public void empresta();
	String localiza();
	String devolve();
	String apresentaDescricao();
	
}