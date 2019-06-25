package prova2Package;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.FileWriter;
// Desculpe por nao conseguir entregar completo, infelizmente por algum motivo no qual desconheco, o Exception esta dando erro ao instanciar objetos da classe periodo
// apos sucessivas horas tentando resolver o problema, infelizmente nao tive exito. 
public class UsoAgenda {
	public static void main(String[] args) {
			int prioridade = 0,alerta = 0,op = 0,hora1 = 0,hora2 = 0,minuto1 = 0,minuto2 = 0;
			String titulo = null,descricao = null,dataInicio = null,dataFim = null,local = null;
			Periodo periodo = null;
			try {periodo = new Periodo();}
			catch (Exception e) {System.out.println("Data invalida1");}
			Horario horario1 = null;
			Horario horario2 = null;
			Data data1 = null, data2 = null;
			Object element;
			
			Scanner scan = new Scanner(System.in);
			ItemAgenda item;
			Set<ItemAgenda> agenda = new TreeSet<ItemAgenda>();
			System.out.println("Informe o que deseja fazer:\n1-Inserir novo item\n2-Remover Item:\n3-Ver todas as tarefas agendadas\n4-Ver tarefas agendadas num intervalo de datas\n5-Salvar agenda\n6-Restaurar agenda");
			//frase = new Scanner(System.in).nextLine();
			
			do {
				op = scan.nextInt();
				if(op==1 || op==2) {
					System.out.println("Informe o tipo de item que deseja inserir:\n1-Meta\n2-Lembrete\n3-Evento");
					op = scan.nextInt();
					scan.nextLine();
					
					System.out.println("informe o Titulo:");
					titulo = scan.nextLine();
					
					System.out.println("informe a descricao:");
					descricao = scan.nextLine();
					
					System.out.println("informe a data de inicio:");
					dataInicio = scan.nextLine();
					
					System.out.println("informe o horario de inicio");
					System.out.println("Horas:");
					hora1 = scan.nextInt();
					System.out.println("Minutos:");
					minuto1=scan.nextInt(); 
					
					System.out.println("informe a data de fim:");
					dataFim = scan.nextLine();
					
					System.out.println("informe o horario de fim:");
					System.out.println("Horas:");
					hora2 = scan.nextInt();
					System.out.println("Minutos:");
					minuto2 = scan.nextInt();
					try{periodo = new Periodo(dataInicio,dataInicio,hora1,hora2,minuto1,minuto2);}
					catch (Exception e) {System.out.println("Data invalida2");}
				}
				
				switch(op) {
					
					case 1:
						if(op==1) {
						System.out.println("Informe a prioridade:");
						prioridade = scan.nextInt();
						try{agenda.add(new Meta(prioridade, descricao, periodo, titulo));}
						catch (Exception e) {System.out.println("Data invalida3");}
						}
							
						if(op==2) {
						System.out.println("Informe o tempo para alerta:");
						alerta = scan.nextInt();
						try{agenda.add (new Lembrete(alerta, descricao, periodo, titulo));}
						catch (Exception e) {System.out.println("Data invalida");}
						}
						
						if(op==3) {
						System.out.println("Informe o local do evento:");
						local = scan.nextLine();
						try{agenda.add(new Evento(local, descricao, periodo, titulo));}
						catch (Exception e) {System.out.println("Data invalida");}}

						break;
						
						case 2:
							try{agenda.remove(new Evento(null, descricao, periodo, titulo));}
							catch (Exception e) {System.out.println("Data invalida");}
							break;
						
						case 3:
							System.out.println(agenda.toString());
							break;
						
						case 4:
							Set<ItemAgenda> subAgenda = new TreeSet<ItemAgenda>();
							System.out.println("Informe a data de inicio da busca:");
							try{data1 = new Data(scan.nextLine());
							System.out.println("Informe a data de Fim da busca:");
							data2 = new Data(scan.nextLine());
							
						    Iterator<ItemAgenda> iterator = agenda.iterator();
						    while(iterator.hasNext()) {
						    	if(iterator.next().getDataInicio().compareTo(data1) >= 0 && iterator.next().getDataFim().compareTo(data2) <=0) {
						    		element = iterator;
						    		System.out.println(element+"");
						    	}
						    }
						    }
							catch (Exception e) {System.out.println("Data invalida");}
						    break;
						    
						case 5:
							try{BufferedWriter arquivoAgenda = new BufferedWriter(new FileWriter("arquivoAgenda.txt"));
								Arquivo.grava("arquivoSorteios.txt", agenda);
							
							arquivoAgenda.close();}
							catch (Exception e) {System.out.println("erro na leitura ou escrita do arquivo");}
							break;
							
						case 6: 
							try{BufferedWriter arquivoAgenda = new BufferedWriter(new FileWriter("arquivoAgenda.txt"));
							Arquivo.le("arquivoAgenda.txt");
							Set<ItemAgenda> le = (Set<ItemAgenda>) Arquivo.le("arquivoAgenda.txt");
							agenda = le;
							arquivoAgenda.close();}
							
							catch (Exception e) {System.out.println("erro na leitura ou escrita do arquivo");}
							break;
				}
			}while(op!=0);
    	}
	}
