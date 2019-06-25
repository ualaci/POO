package prova2Package;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;

/**
 * Oferece metodos estaticos de gravacao e leitura de objetos no disco
 * atraves de serializacao.
 *
  * @author Ualaci dos Anjos
  * @version 1.0 (junho-2019)
 */
public abstract class Arquivo {
	/**
	 * Realiza gravacao de um objeto no disco
	 * @param _nomeArquivo nome do arquivo que ser criado na gravacao
	 * @param _objeto instancia que ser gravada no arquivo
	 * @exception IOException problemas na criacao do arquivo ou gravacao
	 */
	static public void grava(String _nomeArquivo, Set<ItemAgenda> _agenda) throws IOException {
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(_nomeArquivo));
		buffer.writeObject(_agenda.toString());
		buffer.close();
	}

	/**
	 * Realiza leitura de um objeto no arquivo
	 * @param _nomeArquivo nome do arquivo a ser lido
	 * @return retorna uma instancia da classe Object lida do arquivo
	 * @exception IOException problemas na leitura do arquivo
	 * @exception ClassNotFoundException problemas na conversao do objeto lido
	 */
	static public Object le(String _nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(_nomeArquivo));
		Object _objeto = buffer.readObject(); 
		buffer.close();
		return _objeto;
	}
}