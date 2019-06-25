package prova2Package;

public class Evento extends ItemAgenda implements InterfaceItemAgenda {
	private String local;
	
	public Evento() throws Exception{
		this.setLocal(null);;
		this.setDescricao(null);
		this.setPeriodo(null);
		this.setRegistro(null);
	}
	
	public Evento(String _local, String _descricao, Periodo _periodo, String _registro) throws Exception{
		this.setLocal(_local);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
		this.setRegistro(_registro);
	}


	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String ToString() {
		StringBuilder evento = new StringBuilder();
		evento.append(super.toString());
		evento.append("Local: ");
		evento.append(this.local);
		evento.append("\n");
		return evento.toString();
	}

	@Override
	public boolean Equals(Object objeto) {
		Evento evento = (Evento) objeto;
		if(super.equals(objeto) &&  evento.local == this.local) return true;
		return false;
	}
}