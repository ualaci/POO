package ex19;

public class Esfera implements ObjetoTridimensional{
	
	private Ponto3D ponto3d;
	private double raio;
	
	public Esfera(double _x,double _y,double _z,double _raio) throws Exception{
		this.ponto3d = new Ponto3D(_x,_y,_z);
		this.setRaio(_raio);
	}
	
	public Ponto3D getPonto() {
		return this.ponto3d;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(Ponto3D _ponto) {
		this.ponto3d = _ponto;
	}
	
	public void setRaio(double _raio) {
		this.raio = _raio;
	}
	
	public double calculaSuperficie() {
		double superficie = 4*Math.pow(Math.PI,2);
		return superficie;
	}

	public double calculaVolume() {
		double volume = (4/3)*Math.pow(this.getRaio(),3); 
		return volume;
	}
	
	public Ponto3D centro() throws Exception {
		return this.getPonto();
	}
	
	public Esfera clona(Esfera e) throws Exception{
		Esfera esfera = new Esfera (e.ponto3d.getX() , e.ponto3d.getY() , e.ponto3d.getZ() , e.getRaio());
		return esfera;
	}
	
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append(this.ponto3d.toString());
		aux.append("| ");
		aux.append("Raio:");
		aux.append(this.getRaio());
		return aux.toString();
	}
}
