package p2Package;

public abstract class ItemAgenda {
	String registro;
	String descricao;
	Periodo periodo;
	
	public String getRegistro() {
		return this.registro;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public Periodo getPeriodo() {
		return this.periodo;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
    public String toString() {
        StringBuilder itemAgenda = new StringBuilder ();
        itemAgenda.append(this.registro);
        itemAgenda.append("\n");
        itemAgenda.append(this.descricao);
        itemAgenda.append("\n");
        itemAgenda.append(this.periodo.toString());
        return itemAgenda.toString();
    }

    public boolean equals(Object objeto) {
        ItemAgenda aux = (ItemAgenda) objeto;
        if (aux.descricao == this.descricao && aux.registro == this.registro && aux.periodo == this.periodo) return true;
        else return false;
    }

}
