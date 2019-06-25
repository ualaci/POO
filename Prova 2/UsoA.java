package p2Package;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class UsoA {
  	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Insira uma frase:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
        	Set<String> s = new TreeSet<String>();
        	
        	for(i=0;i<(vet.length);i++){
        		s.add(new String(vet[i]));
        	}
 
        	// exibe o conteúdo de cada coleção com o toString nativo:
        	System.out.println("Conjunto: " + s);
  	}
}
