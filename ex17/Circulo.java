package ex17;

public class Circulo extends Ponto {
	double raio;
	
	public Circulo() {
		super();
		this.setRaio(0);
	}
	
	public Circulo(Coordenada _x, Coordenada _y, double _espessura, boolean _solido, double _raio) {
		super(_x, _y, _espessura, _solido);
		this.setRaio(_raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaAreaPerimetro() {
		if (this.isSolido()) {
			return 3.1415926*this.raio*this.raio;
		}
		else return 3.1415926*2*this.raio;
	}

	@Override
	public String toString() {
		super.toString();
		StringBuilder ponto = new StringBuilder();
		ponto.append("\nRaio:");
		ponto.append(this.raio);
		return super.toString() + ponto.toString();
	}

	@Override
	public boolean equals(Object objeto) {
		super.equals(objeto);
		Circulo aux = (Circulo) objeto;
		if (aux.getRaio() == this.getRaio()) return true;
		else return false;
	}

}
