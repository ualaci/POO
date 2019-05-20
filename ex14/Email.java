package ex14;

public class Email {
	private String descricaoEmail;
	
	public Email(String _descricaoEmail) throws Exception {
		this.setDescricaoEmail(_descricaoEmail);
	}
	
	public Email() {
		this.isEmailValido("@NoEmail");
	}

	public String getDescricaoEmail() {
		return descricaoEmail;
	}

	public void setDescricaoEmail(String _descricaoEmail) throws Exception {
		if (isEmailValido(_descricaoEmail)) this.descricaoEmail = _descricaoEmail;
		else {
			throw new Exception ("Email Invalido");
		}
	}
	
	public boolean isEmailValido(String _descricaoEmail) {
		if (_descricaoEmail.contains("@")) return true;
		else return false;
	}
	
	
}

