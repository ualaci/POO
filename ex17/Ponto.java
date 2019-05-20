package ex17;

public abstract class Ponto {
	private Coordenada x;
	private Coordenada y;
	private double espessura;
	private boolean solido;
	
	public Ponto(Coordenada _x, Coordenada _y, double _espessura, boolean _solido) {
		this.setEspessura(_espessura);
		this.setSolido(_solido);
		this.setX(_x);
		this.setY(_y);
	}
	
	public Ponto() {
		this.setEspessura(0);
		this.setSolido(false);
		Coordenada a = new Coordenada(0);
		this.setX(a);
		this.setY(a);
	}
	

	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}
	public double getEspessura() {
		return this.espessura;
	}
	public boolean getSolido() {
		return this.solido;
	}
	
	public void setX(Coordenada x) {
		this.x = x;
	}
	public void setY(Coordenada y) {
		this.y = y;
	}
	public void setX(double _x) {
		Coordenada cord = new Coordenada(_x);
		this.x = cord;
	}
	public void setY(double _y) {
		Coordenada cord = new Coordenada(_y);
		this.y = cord;
	}
	
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	public void setSolido(boolean solido) {
		this.solido = solido;
	}
	
	public boolean isSolido() {
		if (this.solido) return true;
		else return false;
	}
	
	public String toString() {
		StringBuilder ponto = new StringBuilder();
		ponto.append("Coordenada X:");
		ponto.append(this.x.getCoordenada());
		ponto.append("\nCoordenada Y:");
		ponto.append(this.y.getCoordenada());
		ponto.append("\nEspessura:");
		ponto.append(this.espessura);
		ponto.append("\nÉ sólido?");
		ponto.append(this.isSolido());
		return ponto.toString();
	}
	
	public boolean equals(Object objeto) {
		Ponto aux = (Ponto) objeto;
		if (aux.getX() == this.getX() && aux.getY() == this.getY() && aux.getSolido() == this.getSolido() && aux.getEspessura() == this.getEspessura()) return true;
		else return false;
	}
}