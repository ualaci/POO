package ex5;

public class Aluno{
	private String nome;
	private double nota1, nota2, media, pontos;
	private static double notaMaxDefault = 10;
	private static double notaMax = notaMaxDefault;

	// quatro construtores sobrecarregados
	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) throws Exception{
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2, double _pontos) throws Exception {
		this("sem nome", _nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2) throws Exception {
		this(_nota1, _nota2, 0.0);
	}
	public Aluno() throws Exception {
		this(0.0,0.0);
	}


	// métodos de interface para acesso aos campos privados


	public double getNotaMax(){
		return this.notaMax;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public double getNota1() {
		return this.nota1;
	}
	public double getNota2() {
		return this.nota2;
	}
	public double getMedia() {
		return this.media;
	}

	public double getPontos()  {
		return this.pontos;
	}

	public static void setNotaMax(double notaMax){
		Aluno.notaMax = notaMax;
	}
	public void setPontos(double _pontos) {
		this.pontos = _pontos;
		this.calculaMedia(10);
	}
	// tratamento de erros, escopo do programador de classes (comandos throw  e throws)
	public void setNotas(double _nota1, double _nota2,double _pontos)throws Exception {
		this.pontos = _pontos;
		if(isNotaValida(_nota1,_nota2)) {
			this.nota1 = _nota1;
			this.nota2 = _nota2;
			this.calculaMedia(10);
		}
		else
			throw new Exception("nota invalida");
	}


	public void setNotas(double _nota1, double _nota2) throws Exception {
		this.setNotas(_nota1, _nota2, 0);
	}

	public static boolean isNotaValida(double _nota1, double _nota2) {
		if (_nota1 >= 0 && _nota1 <= notaMax && _nota2 >= 0 && _nota2 <= notaMax) return true;
		else return false;
	}
	// método para calcular a média. Privado pois o uso é apenas interno a classe
	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos()) / 2;
		return this.media;
	}

	// sobrecarregamento do cálculo da média para limitar o valor máximo
	private double calculaMedia(int _limite) {
		this.calculaMedia();
		if (this.media > _limite)
			this.media = _limite;
		return this.media;
	}


	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(this.getNome());
		dados.append(";");
		dados.append(this.getNota1());
		dados.append(";");
		dados.append(this.getNota2());
		dados.append(";");
		dados.append(this.getPontos());
		dados.append(";");
		dados.append(this.getMedia());
		return dados.toString();
	}


	public boolean equals(Object objeto) {
		Aluno aux = (Aluno) objeto;
		if (this.getNome().equals(aux.getNome()) &&
				this.getNota1() == aux.getNota1() &&
				this.getNota2() == aux.getNota2() &&
				this.getPontos() == aux.getPontos())
			return true;
		return false;
	}
}