package p2Package;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UsoB {
  	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Insira uma frase:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
  			Map<String,Integer> m = new HashMap<String,Integer>();
  			Set<String> s = new TreeSet<String>();
  			for(i=0;i<(vet.length);i++){
        		s.add(new String(vet[i]));
        	}
  			
        	for(i=0;i<(vet.length);i++){
        		vet[i] = vet[i].toLowerCase();
        		if (m.containsKey(vet[i])){
        			int contador = m.get(vet[i]);
        			m.put(vet[i], contador+1);
        		}
        		else m.put(vet[i], 1);
        	}
 
        	// exibe o conteúdo de cada coleção com o toString nativo:
        	System.out.println("Conjunto: " + m);
  	}
}
