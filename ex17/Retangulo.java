package ex17;

public class Retangulo extends Ponto {
	double comprimento;
	double largura;
	
	public double calculaAreaPerimetro() {
		if (this.isSolido()) {
			return this.comprimento*this.largura;
		}
		else return (2*this.comprimento)+(2*this.largura);
	}

	public Retangulo() {
		super();
		this.setComprimento(0);
		this.setLargura(0);
	}

	public Retangulo(Coordenada _x, Coordenada _y, double _espessura, boolean _solido, double _comprimento, double _largura) {
		super(_x, _y, _espessura, _solido);
		this.setComprimento(_comprimento);
		this.setLargura(_largura);		
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public String toString() {
		super.toString();
		StringBuilder ponto = new StringBuilder();
		ponto.append("\nComprimento:");
		ponto.append(this.comprimento);
		ponto.append("\nLargura:");
		ponto.append(this.largura);
		return super.toString() + ponto.toString();
	}
	
	public boolean equals(Object objeto) {
		super.equals(objeto);
		Retangulo aux = (Retangulo) objeto;
		if (aux.getComprimento() == this.getComprimento() && aux.getLargura() == this.getLargura()) return true;
		else return false;
	}
	
	
}
