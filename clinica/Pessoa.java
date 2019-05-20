package clinica;

import contaBancaria.Conta;

public class Pessoa {
	private String nome;
	private double identidade;
	private Data dataDeNascimento;

	String getNome() {
		return this.nome;
	}
	
	double getIdentidade() {
		return this.identidade;
	}
	
	Data getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public Pessoa() {
		Data data = new Data();
		this.setPessoa("Unamed", 0, data);
	}
	
	public Pessoa(String _nome, double _identidade, Data _dataDeNascimento) {
		this.setPessoa(_nome, _identidade, _dataDeNascimento);
	}
	

	public void setPessoa(String _nome, double _identidade, Data _dataDeNascimento) {
		this.nome = _nome;
		this.identidade = _identidade;
		this.dataDeNascimento = _dataDeNascimento;
	}
	
	public String toString() {
		StringBuilder pessoa = new StringBuilder();
		pessoa.append("Nome:");
		pessoa.append(this.nome);
		pessoa.append(" | ");
		pessoa.append("Identidade:");
		pessoa.append(this.identidade);
		pessoa.append(" | ");
		pessoa.append("Data de nascimento:");
		pessoa.append(this.dataDeNascimento);
		pessoa.append(" | ");
		return pessoa.toString();
	}
	
	public boolean equals (Object objeto) {
		Pessoa aux = (Pessoa) objeto;
		if (aux.getNome() == this.nome && aux.getIdentidade() == this.identidade && aux.getDataDeNascimento() == this.dataDeNascimento) return true;
		else return false;	
	}
	
	public double maxEmprestimo() {
		double valorEmprestimo = 1000;
		return valorEmprestimo;
	}
}
