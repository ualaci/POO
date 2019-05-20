package ex2;

import java.util.Scanner;

public class UsoData {

    public static Data dataComp;


    
    public static void main (String[] args)throws Exception {
    	
            int count = 0,inc = 0,compare=0;
            
            // Cria as datas utilizadas nos metodos de comparacao
            
            
            Data dataComp2 = new Data();
            
         
            
                try {
                    dataComp = new Data(20, 10, 1997);
                } catch (Exception e) {
                    System.out.println("Data invalida");
                }
            //Data dataComp2 = new Data();
            Data d1 = new Data();
            Data d2 = new Data();

            // Contador das tentativas de inserir uma data adequada, do contrário, após 3 tentativas com erro uma data Default será atribuída
            
            Scanner scanner = new Scanner(System.in);
			while(count!=3) {
        try {
            System.out.println("Entre com a primeira data: ");
            d1.setData(scanner.nextLine());
            System.out.println("\nData1: "+d1);}
        
        catch(Exception e){
            count++;
            System.out.println(e);
        }
            
        try {
            System.out.println("Entre com a segunda data: ");
            d2.setData(scanner.nextLine());
            System.out.println("\nData2: "+d2);}
        catch(Exception e){
            count++;
            System.out.println(e);
        }
        System.out.println("\nAs datas sao iguais? "+d1.equals(d2));
        
    }

        if (count==3) {
        d1.setData(1, 1, 1900);
        d2.setData(1, 1, 1900);
        System.out.println(d1);
    }
        // inicio da parte de Comparacao, pega a data dataComp de um suposto banco de dados e compara com a data desejada, no caso a dataComp2
        
        System.out.println("Entre com a data a ser comparada: ");
        //sDataComp = scanner.nextLine();
	    dataComp2.setData(scanner.nextLine());
        compare = Data.compareTo(dataComp2);
        System.out.println(""+compare);

        // printando os objetos d1 e d2...
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("\nAs datas sao iguais? " + d1.equals(d2));
        
        // Utilizando o Método Incrementa:

                try {
                    d1.incrementa();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            System.out.println("Entre com os dias a serem incrementados: ");
                
            inc = scanner.nextInt();
	        System.out.println(d1);
	        d1.incrementa(inc);
	        System.out.println(d1);
	        
        }}



