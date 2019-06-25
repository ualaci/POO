package prova2Package;

public class Lembrete extends ItemAgenda implements InterfaceItemAgenda {
	private int alerta;
	
	public Lembrete() throws Exception{
		this.setAlerta(0);
		this.setDescricao(null);
		this.setPeriodo(null);
		this.setRegistro(null);
	}
	
	public Lembrete(int _alerta, String _descricao, Periodo _periodo, String _registro) throws Exception{
		this.setAlerta(_alerta);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
		this.setRegistro(_registro);
	}

	public int getAlerta() {
		return alerta;
	}

	public void setAlerta(int alerta) {
		this.alerta = alerta;
	}

	@Override
	public String ToString() {
		StringBuilder lembrete = new StringBuilder();
		lembrete.append(super.toString());
		lembrete.append("Minutos de antecedencia: ");
		lembrete.append(this.alerta);
		lembrete.append("\n");
		return lembrete.toString();
	}

	@Override
	public boolean Equals(Object objeto) {
		Lembrete lembrete = (Lembrete) objeto;
		if(super.equals(objeto) && lembrete.alerta == this.alerta) return true;
		return false;
	}
}