package clinica;

public class PacienteDaClinica extends Pessoa {
	private String planoDeSaude;

	
	public PacienteDaClinica(String _planoDeSaude) {
		super();
		this.setPlanoDeSaude(_planoDeSaude);
	}

	public PacienteDaClinica(String _nome, double _identidade, Data _dataDeNascimento, String _planoDeSaude) {
		super(_nome, _identidade, _dataDeNascimento);
		this.setPlanoDeSaude(_planoDeSaude);
	}
	
	public String getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public String toString() {
		StringBuilder pacienteDaClinica = new StringBuilder();
		pacienteDaClinica.append("|");
		pacienteDaClinica.append("Plano de saude:");
		pacienteDaClinica.append(this.getPlanoDeSaude());
		pacienteDaClinica.append("|");
		return super.toString()+pacienteDaClinica.toString();
	}
	
	public boolean equals (Object objeto) {
		PacienteDaClinica aux = (PacienteDaClinica) objeto;
		boolean b = super.equals(objeto);
		if (aux.getPlanoDeSaude() == this.planoDeSaude && b==true) return true;
		else return false;
	}
	
}
