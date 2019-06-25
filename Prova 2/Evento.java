package p2Package;

public class Evento extends ItemAgenda implements InterfaceItemAgenda {
	String local;


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