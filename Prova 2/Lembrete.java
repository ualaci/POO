package p2Package;

public class Lembrete extends ItemAgenda implements InterfaceItemAgenda {
	int alerta;
	
	public Lembrete() {
		
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