package p2Package;

public class Meta extends ItemAgenda implements InterfaceItemAgenda {
	int prioridadeMeta;
	
	
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