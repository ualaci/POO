package ex19;

public class Ponto {  
	private double x, y ;
	public static final double LIMITE_INF_DEFAULT = 0;
	public static final double LIMITE_SUP_DEFAULT = 500;
	private static double limiteInf = Ponto.LIMITE_INF_DEFAULT;
	private static double limiteSup = Ponto.LIMITE_SUP_DEFAULT;

	public Ponto() throws Exception {
		this(0,0);
	}
	Ponto(double _x, double _y) throws Exception {
		this.setX(_x);
		this.setY(_y);
	}
	public static boolean isLimite(double coordenada) {
		return coordenada >= Ponto.limiteInf && coordenada <= Ponto.limiteSup;
	}
	public void setX(double _x)throws Exception{
		if(Ponto.isLimite(_x)) 	
			this.x = _x;
		else
			throw new Exception ("valor de x fora dos limites");
	}
	public void setY(double _y)throws Exception{
		if(Ponto.isLimite(_y)) 	
			this.y = _y;
		else
			throw new Exception ("valor de y fora dos limites");
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public static double getLimiteInf() {
		return Ponto.limiteInf;
	}
	public static double getLimiteSup() {
		return Ponto.limiteSup;
	}
	public static void setLimiteInf(double inferior) {
		Ponto.limiteInf = inferior;
	}
	public static void setLimiteSup(double superior) {
		Ponto.limiteSup = superior;
	}
	public Ponto clonar() throws Exception {
		return new Ponto(this.getX(), this.getY());
	}
	public Ponto criaSwap() throws Exception {
		return new Ponto(this.getY(), this.getX());
	}
	public boolean temEixoComum(Ponto _ponto){
		return this.getX() == _ponto.getX() || this.getY() == _ponto.getY();
	}
	static public double distancia(double x1, double y1, double x2, double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	public double distancia(Ponto _ponto){
		return Ponto.distancia(this.getX(),this.getY(),_ponto.getX(),_ponto.getY());
	}
	public double distancia(double _x, double _y){
		return Ponto.distancia(this.getX(),this.getY(),_x,_y);
	}
	public double distanciaDaOrigem(){
		return Ponto.distancia(this.getX(),this.getY(),0,0);
	}
	public int compareTo(Ponto _ponto){
		if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
			return 1;
		else if(this.distanciaDaOrigem() < _ponto.distanciaDaOrigem())
			return -1;
		else
			return 0;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Ponto other = (Ponto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	public String toString(){
		StringBuilder coord = new StringBuilder();
		coord.append("(");
		coord.append(this.getX());
		coord.append(",");
		coord.append(+this.getY());
		coord.append(")");
		return coord.toString();
	}
}






