package p2Package;

public class Periodo {
	Data dataInicio;
	Data dataFim;
	Horario horarioInicio;
	Horario horarioFim;
	
	public Periodo (String _dataInicio, String _dataFim, int _horas1, int _horas2, int _minutos1, int _minutos2) throws Exception {
		this.dataInicio.setData(_dataInicio);
		this.dataFim.setData(_dataFim);
		this.horarioInicio.setHorario(_horas1, _minutos1);
		this.horarioFim.setHorario(_horas2, _minutos2);
	}
	
	public Periodo (int _dia1, int _dia2, String _mes1, String _mes2, int _ano1, int _ano2, int _horas1, int _horas2, int _minutos1, int _minutos2) throws Exception {
		this.dataInicio.setData(_dia1, _mes1, _ano1);
		this.dataFim.setData(_dia2, _mes2, _ano2);
		this.horarioInicio.setHorario(_horas1, _minutos1);
		this.horarioFim.setHorario(_horas2, _minutos2);
	}
	
	public Periodo (int _dia1, int _dia2, int _mes1, int _mes2, int _ano1, int _ano2, int _horas1, int _horas2, int _minutos1, int _minutos2) throws Exception {
		this.dataInicio.setData(_dia1, _mes1, _ano1);
		this.dataFim.setData(_dia2, _mes2, _ano2);
		this.horarioInicio.setHorario(_horas1, _minutos1);
		this.horarioFim.setHorario(_horas2, _minutos2);
	}
	
	public Data getDataInicio() {
		return this.dataInicio;
	}
	
	public Data getDataFim() {
		return this.dataFim;
	}
	
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	
    public String toString() {
        StringBuilder periodo = new StringBuilder ();
        periodo.append("Inicio: ");
        periodo.append(this.dataInicio.toString());
        periodo.append(this.horarioInicio.toString());
        periodo.append("\n");
        periodo.append("Fim: ");
        periodo.append(this.dataFim.toString());
        periodo.append(this.horarioFim.toString());
        periodo.append("\n");
        return periodo.toString();
    }

    public boolean equals(Object objeto) {
        Periodo aux = (Periodo) objeto;
        if (aux.getDataInicio() == this.getDataInicio() && aux.getDataFim() == this.getDataFim() && aux.getHorarioInicio() == this.getHorarioInicio() && aux.getHorarioFim() == this.getHorarioFim()) return true;
        else return false;
    }

}
