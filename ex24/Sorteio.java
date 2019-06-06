package ex24;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 * Implementa a interface Serializable, para permitir que as suas instancias possam
 * ser usadas numa serializacao (por exemplo, gravacao em disco)
 * 
 * @author Ualaci dos Anjos
 * @version 1.0 (junho-2019)
 */
public class Sorteio implements Serializable {
	/** Data do sorteio */
	private Data data;
	private NumeroSorteado numeroSorteado = new NumeroSorteado();
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param Data data do sorteio
	 * @param NumeroSorteado numero escolhido pelo sorteio
	 */
	public Sorteio(Data _data, NumeroSorteado _numeroSorteado) {
		this.data = _data;
		this.numeroSorteado = _numeroSorteado;
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param Data data do sorteio
	 */
	
	public Sorteio(Data _data) {
		this.data = _data;
		this.numeroSorteado.geraValoresSorteados();
	}

	/**
	 * pega a Data
	 * 
	 * @return data
	 */
	public Data getData() {
		return this.data;
	}

	/**
	 * pega o Dia
	 * 
	 * @return data.dia
	 */
	public int getDia() {
		return this.data.getDia();
	}
	
	/**
	 * pega o Mes
	 * 
	 * @return data.mes
	 */
	public int getMes() {
		return this.data.getAno();
	}
	
	/**
	 * pega o Ano
	 * 
	 * @return data.ano
	 */
	public int getAno() {
		return this.data.getAno();
	}
	
	/**
	 * pega o numero sorteado
	 * 
	 * @return numeroSorteado
	 */
	public NumeroSorteado getNumeroSorteado() {
		return this.numeroSorteado;
	}
	
	public  Data incrementaData()throws Exception {
		this.data.incrementa();
		return this.data;
	}
	
	/**
	 * Metodo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder aux = new StringBuilder();
		aux.append(";");
		aux.append(this.getData());
		aux.append(";");
		aux.append(this.getNumeroSorteado());
		return aux.toString();
	}

	/**
	 * Este metodo e necessario ser colocao numa classe sempre que acontecer
	 * buscas realizadas em HashMap quando a chave e um objeto desta classe
	 * <p>
	 * Neste caso ser usado o codigo hash da concatenacao dos campos
	 * Para que este metodo seja util sera necessario procurar por um
	 * objeto amigo completo numa HashMap que foi constru�da desta forma
	 * <p>
	 * Normalmente as classes fornecidas pelo Java ja possuem hashCode.
	 * 
	 * @return inteiro para ser usado como codigo hash
	 */
	
	public int hashCode() {
		return Objects.hash(data, numeroSorteado);
	}
}


