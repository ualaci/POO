package p2Package;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class UsoAgenda {
	public static void main(String[] args) {
			int i,op;
			Scanner scan;
			Set<ItemAgenda> agenda = new TreeSet<ItemAgenda>();
			System.out.println("Informe o que deseja fazer:\n1-Inserir novo item\n2-Remover Item:\n3-Ver todas as tarefas agendadas\n4-Ver tarefas agendadas num intervalo de datas\n5-Salvar agenda\n6-Restaurar agenda");
			op = scan.nextInt();
			//frase = new Scanner(System.in).nextLine();
			
			do {
				if(op == 1) {
					System.out.println("Informe o tipo de item que deseja inserir:\n1-Meta\n2-Lembrete\n3-Evento");
					op = scan.nextInt();
					if(op==1)
					if(op==2)
					if(op==3)
				}
				switch(op) {
				
					case 1:
							
				
				}
			}while(op!=0);
			
			
			
    		agenda.add(new ItemAgenda());
    	}
	
    	System.out.println("" + s);
	}
