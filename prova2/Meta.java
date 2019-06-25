package prova2Package;

public class Meta extends ItemAgenda implements InterfaceItemAgenda {
	private int prioridadeMeta;
	
	public Meta() throws Exception{
		this.setPrioridadeMeta(0);
		this.setDescricao(null);
		this.setPeriodo(null);
		this.setRegistro(null);
	}
	
	public Meta(int _prioridade, String _descricao, Periodo _periodo, String _registro) throws Exception{
		this.setPrioridadeMeta(_prioridade);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
		this.setRegistro(_registro);
	}
	
	public int getPrioridadeMeta() {
		return this.prioridadeMeta;
	}

	public void setPrioridadeMeta(int prioridadeMeta) {
		this.prioridadeMeta = prioridadeMeta;
	}

	@Override
	public String ToString() {
		StringBuilder meta = new StringBuilder();
		meta.append(super.toString());
		meta.append("Prioridade: ");
		meta.append(this.prioridadeMeta);
		meta.append("\n");
		return meta.toString();
	}

	@Override
	public boolean Equals(Object objeto) {
		Meta meta = (Meta) objeto;
		if(super.equals(objeto) && meta.prioridadeMeta == this.prioridadeMeta) return true;
		return false;
	}
}