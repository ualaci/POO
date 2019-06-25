package prova2Package;

public abstract class ItemAgenda implements Comparable {
	String registro;
	String descricao;
	Periodo periodo;
	
	public ItemAgenda() throws Exception{
		this.periodo = new Periodo();
		this.setDescricao("Sem descricao");
		this.setRegistro("Sem registro");
	}
	
	public String getRegistro() {
		return this.registro;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public Periodo getPeriodo() {
		return this.periodo;
	}
	
	public Data getDataFim() {
		return this.periodo.getDataFim();
	}
	
	public Data getDataInicio() {
		return this.periodo.getDataInicio();
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
	
	public int compareTo(ItemAgenda compItem)throws Exception{
		Data data1 = new Data(this.periodo.getDataInicio());
		Data data2 = new Data(compItem.periodo.getDataInicio());
		return data1.compareTo(data2);
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
    
    public boolean equal(Object objeto) {
        ItemAgenda aux = (ItemAgenda) objeto;
        if (aux.descricao == this.descricao && aux.registro == this.registro && aux.periodo == this.periodo) return true;
        else return false;
    }

    public boolean equals(Object objeto) {
        ItemAgenda aux = (ItemAgenda) objeto;
        if (aux.periodo.getDataInicio() == this.periodo.getDataInicio() && aux.periodo.getDataFim() == this.periodo.getDataFim()) return true;
        else return false;
    }

}