package clinica;

public class Diretor extends Chefe {
	Data dataPromocao;
	
	public Diretor(String _nome, double _identidade, Data _dataDeNascimento, double _salario, Data _dataAdmissao, String _departamento, Data  _dataPromocao) {
		setPessoa(_nome, _identidade, _dataDeNascimento);
		setSalario(_salario);
		setDataAdmissao(_dataAdmissao);
		setDepartamento(_departamento);
		setDataPromocao(_dataPromocao);
	}
	
	public Data getDataPromocao() {
		return this.dataPromocao;
	}
	
	public void setDataPromocao(Data _dataPromocao) {
		this.dataPromocao = _dataPromocao;
	}
	
	public Diretor() {
			Data data = new Data();
			setPessoa("Unamed", 0, data);
			setSalario(0);
			setDataAdmissao(data);
			setDepartamento("noDepartament");
			setDataPromocao(data);
	}
	
	@Override
	public double maxEmprestimo() {
		return super.maxEmprestimo() * 1.5;
	}
	
}
