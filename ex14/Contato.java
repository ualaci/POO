package ex14;

public class Contato extends Email{
	private String nome;
	private String email;
	
	public Contato(String _nome, String _email) throws Exception{
		super(_email);
		this.setNome(_nome);
		this.setEmail(_email);
	}
	
	public Contato() {
		this.setNome("NoName");
		this.setEmail("NoEmail");
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
        StringBuilder cliente = new StringBuilder ();
        cliente.append("Nome:");
        cliente.append(this.getNome());
        cliente.append("|");
        cliente.append("Email:");
        cliente.append(this.getEmail());
        cliente.append("|");
        return cliente.toString();

    }

    public boolean equals(Object objeto) {
        Contato aux = (Contato) objeto;
        if (aux.getEmail() == this.getEmail() && aux.getNome() == this.getNome()) return true;
        else return false;
    }

}
