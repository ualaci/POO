package ex17;

public class Quadrado extends Ponto {
	double comprimento;
	
	public double calculaAreaPerimetro() {
		if (this.isSolido()) {
			return this.comprimento*this.comprimento;
		}
		else return this.comprimento*4;
		
		
	}

	public Quadrado() {
		super();
		this.setComprimento(0);
	}

	public Quadrado(Coordenada _x, Coordenada _y, double _espessura, boolean _solido, double _comprimento) {
		super(_x, _y, _espessura, _solido);
		this.setComprimento(_comprimento);
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public String toString() {
		StringBuilder ponto = new StringBuilder();
		ponto.append("\nComprimento:");
		ponto.append(this.comprimento);
		return super.toString() + ponto.toString();
	}
	
	public boolean equals(Object objeto) {
		super.equals(objeto);
		Quadrado aux = (Quadrado) objeto;
		if (aux.getComprimento() == this.getComprimento()) return true;
		else return false;
	}
	
}
