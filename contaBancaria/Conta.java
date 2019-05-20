package contaBancaria;

public class Conta {
	private String nomeCorrentista;
	private double saldo;
	public static double taxaJurosDefault = 10;
	private static double taxaJuros = taxaJurosDefault;
	
	double getSaldo() {
		return this.saldo;
	}
	
	static double getTaxaJuros() {
		return Conta.taxaJuros;
	}
	
	String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	
	public Conta () throws Exception {
		this.setConta( 0, "");
	}
	
	public Conta(double _saldo, String _nomeCorrentista, double _taxaJuros) throws Exception {
		this.setConta(_saldo, _nomeCorrentista);
	}
	
	public Conta(double _taxaJuros) {
		Conta.setTaxaJuros(_taxaJuros);
	}
	
	public static void setTaxaJuros(double _taxaJuros) {
		Conta.taxaJuros = _taxaJuros;
	}
	
	public void setConta(double _saldo, String _nomeCorrentista ) throws Exception {
		if(saldo>=0) {
		this.saldo = _saldo ;
		this.nomeCorrentista = _nomeCorrentista ;}
		
		else throw new Exception ("Saldo Invalido");
	}
	
	public void setSaldo(double _saldo) {
		this.saldo = _saldo;
	}
	
	public String toString() {
		StringBuilder conta = new StringBuilder();
		conta.append("Nome:");
		conta.append(this.nomeCorrentista);
		conta.append(" | ");
		conta.append("Saldo:");
		conta.append(this.saldo);
		conta.append(" | ");
		conta.append("Taxa de Juros:");
		conta.append(Conta.taxaJuros);
		conta.append(" | ");
		return conta.toString();
	}
	public boolean equals (Object objeto) {
		Conta aux = (Conta) objeto;
		if (aux.getNomeCorrentista() == this.getNomeCorrentista() && aux.getSaldo() == this.saldo) return true;
		else return false;
	}
	/* Metodo que Compara duas Contas
	Menu:
	Saldo da contaComp maior: 1
	Saldo da contaComp menor: 0
	Saldo da contaComp igual: 2
	mesmo cliente: 3
	*/
	
	public int compareTo(Conta contaComp) {
		Conta contaBancoDados = UsoConta.contaBancoDados;
		if (contaComp.getNomeCorrentista() == contaBancoDados.getNomeCorrentista()) return 3;
		else if (contaComp.getSaldo() == contaBancoDados.getSaldo()) return 2;
		else if (contaComp.getSaldo() > contaBancoDados.getSaldo()) return 1;
		else if (contaComp.getSaldo() < contaBancoDados.getSaldo()) return 0;
		else return 10;
		
		
	}
	
	public void corrigeSaldo(Conta conta) { conta.setSaldo(conta.getSaldo() - (conta.getSaldo()*Conta.getTaxaJuros()/100));}
		
}

	


