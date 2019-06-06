package ex24;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos
 * para inclus�o como inst�ncias da classe Amigo
 *
 * @author Ualaci dos Anjos Junior
 * @version 1.0 (junho-2019)
 */
public class ConjuntoSorteio implements Serializable {
	private List<Sorteio> listaDeSorteios;

	ConjuntoSorteio() {
		listaDeSorteios = new LinkedList<Sorteio>();
	}

	/**
	 * Insere uma instancia da classe Sorteio
	 *
	 * @param _valorSorteado objeto a ser incluido da colecao
	 */
	public void insere(Sorteio _valorSorteado) {
		this.listaDeSorteios.add(_valorSorteado);
	}
	
	/**
	 * Insere varias instancias da classe Sorteio a partir de uma data
	 *
	 * @param _data de inicializacao para os valores sorteados
	 * * @param _numeroDeSorteios numero de instancias a serem incluidas na colecao
	 */
	
	public void insere(Data _data, int numeroDeSorteios)throws Exception {
		for(int i=0;i<numeroDeSorteios;i++) {
			Sorteio _valorSorteado = new Sorteio (_data);
			this.listaDeSorteios.add(_valorSorteado);
			_data.incrementa();
		}
	}

	/**
	 * Insere uma instancia da classe Sorteio por intermedio dos seus campos
	 *
	 * @param _data data do valor sorteado
	 * @param _numeroSorteado valor sorteado
	 */
	public void insere(Data _data, NumeroSorteado _numeroSorteado) {
		this.insere(new Sorteio(_data, _numeroSorteado));
	}
	
	/**
	 * retorna o tamanho da lista de sorteios
	 * @return listaDeSorteios.size
	 */
	public int getSizeList() {
		return this.listaDeSorteios.size();
	}
	
	/**
	 * retorna um valor sorteado a partir de uma determinada posicao
	 */	
	public Sorteio getValorSorteado(int posicao) {
		return this.listaDeSorteios.get(posicao);
	}


	public String toString() {
		StringBuilder conjuntoSorteio = new StringBuilder("Lista de valores sorteados: ");
			conjuntoSorteio.append(this.listaDeSorteios.toString());
		return conjuntoSorteio.toString();
	}
}

