package ex19;

public class CilindroEscalavel implements Escalavel,ObjetoTridimensional{
	private Ponto3D ponto3d;
	private double raio;
	
	public CilindroEscalavel(double _x, double _y, double _z,double _raio) throws Exception{
		this.ponto3d = new Ponto3D(_x,_y,_z);
		this.setRaio(_raio);
	}
	
	public Ponto3D getPonto() {
		return this.ponto3d;
	}
	
	public double getRaio() {
		return this.raio;
	}

	public void setPonto(Ponto3D _ponto) {
		this.ponto3d = _ponto;
	}
	
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double altura() {
		return this.ponto3d.getZ();
	}
	
	public double calculaVolume() {
		double volume = Math.PI*Math.pow(this.getRaio(),2)*this.ponto3d.getZ();
		return volume;
	}
	
	public double calculaSuperficie() {
		double superficie = 2*Math.PI*this.getRaio()*this.ponto3d.getZ();
		return superficie;
	}
	
	public Ponto3D centro() throws Exception{
		Ponto3D ponto3d = new Ponto3D(this.ponto3d.getX(),this.ponto3d.getY(),(this.ponto3d.getZ())/2);
		return ponto3d;
	}
	
	public void amplia(double escala) throws Exception{
		this.setRaio(this.raio*escala);
		this.ponto3d.setZ(this.ponto3d.getZ()*escala);
	}
	
	public void espelha() throws Exception{
		this.ponto3d.setZ(this.ponto3d.getZ()*(-1));
	}
	
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append(this.ponto3d.toString());
		aux.append("| ");
		aux.append("Raio:");
		aux.append(this.getRaio());
		aux.append("| ");
		aux.append("Altura:");
		aux.append(this.ponto3d.getZ());
		aux.append("| ");
		return aux.toString();
	}
}
