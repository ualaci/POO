package clinica;

public class Chefe extends Funcionario {
	private String departamento;
	
	public Chefe (String _nome, double _identidade, Data _dataDeNascimento, double _salario, Data _dataAdmissao, String _departamento) {
		//super(_nome, _identidade, _dataDeNascimento, _salario, _dataAdmissao,);
		setPessoa(_nome, _identidade, _dataDeNascimento);
		setSalario(_salario);
		setDataAdmissao(_dataAdmissao);
		setDepartamento(_departamento);
	}
	
	public Chefe() {
		Data data = new Data();
		setPessoa("Unamed", 0, data);
		setSalario(0);
		setDataAdmissao(data);
		setDepartamento("noDepartament");
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String _departamento) {
		this.departamento = _departamento;
	}
	
	@Override
	public double maxEmprestimo() {
		return super.maxEmprestimo() * 2;
	}
	
	public String toString() {
		StringBuilder chefe = new StringBuilder();
		chefe.append(" | ");
		chefe.append("Departamento:");
		chefe.append(this.getDepartamento());
		chefe.append(" | ");
		return super.toString() + chefe.toString();
	}
	
	public boolean equals (Object objeto) {
		Chefe aux = (Chefe) objeto;
		boolean b = super.equals(objeto);
		if (aux.getDepartamento() == this.departamento && b==true) return true;
		else return false;
	}
}
