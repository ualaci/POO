package ex24;
import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumeroSorteado implements Serializable {
	/** Quantidade de Numeros
	 * 
	 */
	private static final int quantNumeroDefault = 4, faixaInicioDefault = 1, faixaFimDefault = 99;
	private static int quantNumero = quantNumeroDefault, faixaInicio = faixaInicioDefault, faixaFim = faixaFimDefault;
	private Set<Integer> valorSorteado;
	
	/** Construtor Vazio
	 * 
	 */
	public NumeroSorteado(){
		NumeroSorteado.setQuantNumero(quantNumeroDefault);;
		NumeroSorteado.setFaixaFim(faixaFimDefault);
		NumeroSorteado.setFaixaInicio(faixaInicioDefault);
		this.geraValoresSorteados();
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _faixaInicio Faixa de inicio dos valores sorteados
	 * @param _faixaFim Faixa de inicio dos valores sorteados
	 * @param _quantNumero quantidade de algarismos que o numero sorteado deve conter
	 */
	public NumeroSorteado(int _faixaInicio,int _faixaFim,int _quantNumero){
		NumeroSorteado.setFaixaInicio(_faixaInicio);
		NumeroSorteado.setFaixaFim(_faixaFim);
		NumeroSorteado.setQuantNumero(_quantNumero);
		this.geraValoresSorteados();
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 * 
	 * @param _quantNumero quantidade de algarismos que o numero sorteado deve conter
	 */
	public NumeroSorteado(int _quantNumero){
		NumeroSorteado.setFaixaInicio(faixaInicioDefault);
		NumeroSorteado.setFaixaFim(faixaFimDefault);
		NumeroSorteado.setQuantNumero(_quantNumero);
		this.geraValoresSorteados();
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _faixaInicio Faixa de inicio dos valores sorteados
	 * @param _faixaFim Faixa de inicio dos valores sorteados
	 */
	public NumeroSorteado(int _faixaInicio,int _faixaFim){
		NumeroSorteado.setFaixaInicio(_faixaInicio);
		NumeroSorteado.setFaixaFim(_faixaFim);
		NumeroSorteado.setQuantNumero(quantNumeroDefault);
		this.geraValoresSorteados();
	}
	
	/**
	 * pega a quantidade de algarismos
	 * 
	 * @return quantNumero
	 */
	public static int getQuantNumero() {
		return NumeroSorteado.quantNumero;
	}
	
	/**
	 * pega a faixa de inicio dos numeros sorteados
	 * 
	 * @return faixaInicio
	 */
	public static int getFaixaInicio() {
		return NumeroSorteado.faixaInicio;
	}
	
	/**
	 * pega a faixa de fim dos numeros sorteados
	 * 
	 * @return faixaFim
	 */
	public static int getFaixaFim() {
		return NumeroSorteado.faixaFim;
	}
	
	/**
	 * seta o Valor sorteado
	 * 
	 * @return valorSorteado
	 */
	public Set<Integer> getValorSorteado() {
		return this.valorSorteado;
	}
	
	/**
	 * seta a quantidade de numeros do algarismo sorteado
	 */
	public static void setQuantNumero(int quantNumero) {
		NumeroSorteado.quantNumero = quantNumero;
	}
	
	/**
	 * seta o a faixa de Inicio dos numeros sorteados 
	 */
	public static void setFaixaInicio(int faixaInicio) {
		NumeroSorteado.faixaInicio = faixaInicio;
	}
	
	/**
	 * seta o a faixa de fim dos numeros sorteados
	 */
	public static void setFaixaFim(int faixaFim) {
		NumeroSorteado.faixaFim = faixaFim;
	}
	
	/**
	 * seta o valor sorteado
	 */
	public void setValorSorteado(Set<Integer> valorSorteado) {
		this.valorSorteado = valorSorteado;
	}
	
	/**
	 * gera os algarismos do numero sorteado
	 */
	public void geraValoresSorteados() {
		int i=0, valor;
		Random gerador = new Random();
		this.valorSorteado = new TreeSet<Integer>();
		while(i<this.quantNumero) {
			valor = gerador.nextInt(1 + NumeroSorteado.faixaFim - NumeroSorteado.faixaInicio) + NumeroSorteado.faixaInicio;
			if(this.valorSorteado.contains(valor)){
				continue;
			}
			
			else {
				this.valorSorteado.add(valor);
				i++;
			}
		}
	}
	
	/**
	 * metodo que retorna um elemento da classe em forma de string
	 * 
	 */
	public String toString() {
		StringBuilder numeroSorteado = new StringBuilder();
		numeroSorteado.append("|");
		numeroSorteado.append(this.valorSorteado);
		numeroSorteado.append("|");
		return numeroSorteado.toString();
	}

	public int hashCode() {
		return Objects.hash(valorSorteado);
	}

	/**
	 * metodo que compara dois elementos e retorna a veracidade da comparacao
	 * 
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		NumeroSorteado other = (NumeroSorteado) obj;
		return Objects.equals(valorSorteado, other.valorSorteado);
	}
	
	
	
	
}
