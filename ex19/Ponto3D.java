package ex19;

public class Ponto3D extends Ponto{
	
	private double z;
	
	public Ponto3D(double x,double y,double _z) throws Exception{
		super(x,y);
		this.setZ(_z);
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setZ(double _z) throws Exception{
		if(super.isLimite(_z)) 	this.z = _z;
		else throw new Exception ("Valor de X Invalido");
	}
	
	public Ponto clonar() throws Exception {
		Ponto ponto3d = new Ponto3D(super.getX(), super.getY(),this.getZ());
		return ponto3d;
	}
	
	public boolean isEixoComum(Ponto3D _ponto){
		if (super.getX() == _ponto.getX() && super.getY() == _ponto.getY() && this.getZ() == _ponto.getZ()) return true;
		else return false;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		s.append(super.getX());
		s.append("]");
		s.append(",");
		s.append("[");
		s.append(super.getY());
		s.append("]");
		s.append(",");
		s.append("[");
		s.append(this.getZ());
		s.append("]");
		return s.toString();
	}

}
