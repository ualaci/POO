package ex19;
import java.lang.Math;
public class RetanguloEscalavel implements ObjetoGeometrico, Escalavel{
	private Ponto pontoEsquerdo, pontoDireito;
	
	public RetanguloEscalavel() throws Exception{
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		this.setRetangulo(ponto1,ponto2);
	}
	
	public RetanguloEscalavel(double _x1, double _x2,double _y1, double _y2) throws Exception{
		Ponto ponto1 = new Ponto(_x1,_y1);
		Ponto ponto2 = new Ponto(_x2,_y2);
		this.setRetangulo(ponto1,ponto2);
	}
	
	public Ponto getPontoEsquerdo() {
		return this.pontoEsquerdo;
	}
	
	public Ponto getPontoDireito() {
		return this.pontoDireito;
	}
	
	public void setRetangulo(Ponto _PontoEsquerdo,Ponto _PontoDireito) {
		this.pontoEsquerdo = _PontoEsquerdo;
		this.pontoDireito = _PontoDireito;
	}
	
	public double base(Ponto _PontoEsquerdo, Ponto _PontoDireito) {
		double valor = Math.sqrt(Math.pow((_PontoEsquerdo.getX() - _PontoDireito.getX()), 2));
		return valor;
	}
	
	public double altura(Ponto _PontoEsquerdo, Ponto _PontoDireito) {
		double valor = Math.sqrt(Math.pow((_PontoEsquerdo.getX() - _PontoDireito.getX()), 2));
		return valor;
	}
	
	public double calculaArea() {
		double area = (base(this.getPontoEsquerdo(),this.getPontoDireito()))*altura(this.getPontoEsquerdo(),this.getPontoDireito());
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = (2*base(this.getPontoEsquerdo(),this.getPontoDireito()) + (2*altura(this.getPontoEsquerdo(),this.getPontoDireito())));
		return perimetro;
	}
	
	public Ponto centro() throws Exception{
		Ponto middle = new Ponto((this.pontoEsquerdo.getX() + this.pontoDireito.getX())/2,(this.pontoEsquerdo.getY() + this.pontoDireito.getY())/2);
		return middle;
	}
	
	public void amplia(double _escala) throws Exception{
			this.pontoEsquerdo.setY(this.pontoEsquerdo.getY()*_escala);
			this.pontoDireito.setX(this.pontoDireito.getX()*_escala);
	}
	
	public void espelha() throws Exception{
			this.pontoEsquerdo = new Ponto(this.pontoEsquerdo.getX()*(-1),this.pontoEsquerdo.getY());
			this.pontoDireito = new Ponto(this.pontoDireito.getX()*(-1),this.pontoDireito.getY());

	}
	public ObjetoGeometrico clona() throws Exception{
		RetanguloEscalavel r = new RetanguloEscalavel(this.pontoEsquerdo.getX(),this.pontoEsquerdo.getY(),this.pontoDireito.getX(),this.pontoDireito.getY());
		return r;
	}
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append("Ponto Esquerdo:");
		aux.append(this.pontoEsquerdo.toString());
		aux.append("|");
		aux.append("Ponto direito:");
		aux.append(this.pontoDireito.toString());
		aux.append("|");
		return aux.toString();
	}
}
