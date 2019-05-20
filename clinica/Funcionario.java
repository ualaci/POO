package clinica;

public class Funcionario extends Pessoa {
	private Data dataAdmissao;
	private double salario;
	
	public Funcionario() {
		Data data = new Data();
		setPessoa("Unamed", 0, data);
		setSalario(0);
		setDataAdmissao(data);
	}
	
	public Funcionario (String _nome, double _identidade, Data _dataDeNascimento, double _salario, Data _dataAdmissao) {
		setPessoa(_nome, _identidade, _dataDeNascimento);
		setSalario(_salario);
		setDataAdmissao(_dataAdmissao);
	}
	
	public void setDataAdmissao(Data _dataAdmissao) {
		this.dataAdmissao = _dataAdmissao;
	}
	
	public void setSalario(double _salario) {
		this.salario = _salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Data getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	void ajustaSalario(double taxaReajuste){
		this.setSalario((this.getSalario()*taxaReajuste/100)+this.getSalario());
	}
	
	@Override
	public double maxEmprestimo() {
		double valorEmprestimo = this.getSalario();
		return valorEmprestimo;
	}
	
	public String toString() {
		StringBuilder funcionario = new StringBuilder();
		funcionario.append(" | ");
		funcionario.append("Data de Admissao:");
		funcionario.append(this.dataAdmissao);
		funcionario.append(" | ");
		funcionario.append("\nSalario:");
		funcionario.append(this.salario);
		funcionario.append(" | ");
		return super.toString() + funcionario.toString();
	}
	
	public boolean equals (Object objeto) {
		Funcionario aux = (Funcionario) objeto;
		boolean b = super.equals(objeto);
		if (aux.getDataAdmissao() == this.dataAdmissao && aux.getSalario() == this.salario && b==true) return true;
		else return false;
	}
	
}
