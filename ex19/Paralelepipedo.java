package ex19;

public class Paralelepipedo implements ObjetoTridimensional{
	
	private Ponto3D pontoEsquerdo,pontoDireito;
	
	public Paralelepipedo(double _x1, double _y1,double _z1,double _x2, double _y2,double _z2) throws Exception{
		this.pontoEsquerdo = new Ponto3D(_x1,_y1,_z1);
		this.pontoDireito = new Ponto3D(_x2,_y2,_z2);
		this.setParalelepipedo(pontoEsquerdo,pontoDireito);
	}
	
	public Ponto3D getPontoEsquerdo() {
		return this.pontoEsquerdo;
	}
	
	public Ponto3D getPontoDireito() {
		return this.pontoDireito;
	}
	
	public void setParalelepipedo(Ponto3D p1,Ponto3D p2) {
		this.pontoEsquerdo = p1;
		this.pontoDireito = p2;
	}
	
	public double dimensao1() {
		double valor = (Math.abs(this.pontoEsquerdo.getX() - this.pontoDireito.getX()));
		return valor;
	}
	
	public double dimensao2() {
		double valor = (Math.abs(this.pontoEsquerdo.getY() - this.pontoDireito.getY()));
		return valor;
	}
	
	public double dimensao3() {
		double valor = (Math.abs(this.pontoEsquerdo.getZ() - this.pontoDireito.getZ()));
		return valor;
	}
	
	public double calculaVolume() {
		double volume = (this.dimensao1()*this.dimensao2()*this.dimensao3());
		return volume;
	}
	
	public double calculaSuperficie(){
		double superficie = (2*(this.dimensao1()*this.dimensao2() + this.dimensao3()*this.dimensao2() + this.dimensao1()*this.dimensao3()));
		return superficie;
	}
	
	public Ponto3D centro() throws Exception{
		Ponto3D middle = new Ponto3D(this.dimensao1()/2,this.dimensao2()/2,this.dimensao3()/2);
		return middle;
	}
	
	public Paralelepipedo clona(Paralelepipedo p) throws Exception {
		Paralelepipedo paralelepipedo = new Paralelepipedo(p.pontoEsquerdo.getX(),p.pontoEsquerdo.getY(),p.pontoEsquerdo.getZ() , p.pontoDireito.getX(),p.pontoDireito.getY(), p.pontoDireito.getZ());
		return paralelepipedo;
	}

	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append(this.pontoEsquerdo.toString());
		aux.append("| ");
		aux.append(this.pontoDireito.toString());
		aux.append("|");
		aux.append("Dimensao 1: ");
		aux.append(this.dimensao1());
		aux.append("| ");
		aux.append("Dimensao 2: ");
		aux.append(this.dimensao2());
		aux.append("| ");
		aux.append("Dimensao 3: ");
		aux.append(this.dimensao3());
		aux.append("| ");
		return aux.toString();
	}
}