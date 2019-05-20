package ex14;

import ex2.Data;

public class Cliente extends Contato{

	private double celular;
	private String endereco;
	private double rendaFamiliar;
	
	
	
	public Cliente() {
		super();
		this.setCelular(00000000);
		this.setEndereco("NoAdress");
		this.setRendaFamiliar(0);
	}
	
	public Cliente(String _nome, String _email, double _celular, String _endereco, double _rendaFamiliar) throws Exception {
		super(_nome, _email);
		this.setCelular(_celular);
		this.setEndereco(_endereco);
		this.setRendaFamiliar(_rendaFamiliar);
	}
	
	public double getCelular() {
		return celular;
	}
	public String getEndereco() {
		return endereco;
	}
	public double getRendaFamiliar() {
		return rendaFamiliar;
	}
	
	public void setCelular(double celular) {
		this.celular = celular;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	
    public String toString() {
    	super.toString();
        StringBuilder cliente = new StringBuilder ();
        cliente.append("Celular");
        cliente.append(this.getCelular());
        cliente.append("|");
        cliente.append("Endereco:");
        cliente.append(this.getEndereco());
        cliente.append("|");
        cliente.append("Renda familiar:");
        cliente.append(this.getRendaFamiliar());
        cliente.append("|");
        return cliente.toString();
    }

    public boolean equals(Object objeto) {
        Cliente aux = (Cliente) objeto;
        super.equals(aux);
        if (aux.getCelular() == this.getCelular() && aux.getEndereco() == this.getEndereco()  && aux.getRendaFamiliar() == this.getRendaFamiliar()) return true;
        else return false;
    }
    public String categoriaCliente(double _rendaFamiliar) {
		if (_rendaFamiliar <= 2000) return "usual";
		else return "top";
	}
}

	