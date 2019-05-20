package ex5;

import java.util.Scanner;


public class UsoAluno {
	public static void main(String args[]) throws Exception {
		Aluno x = new Aluno();
		double n1Aux, n2Aux;
		System.out.println ("Utilizar os valores Default de Notas?");
		Scanner leitor = new Scanner(System.in);
		int resp;
		resp=leitor.nextInt();

		if (resp == 0){
			System.out.println("Entre com a nota que deseja colocar como maxima padrao:");
			Aluno.setNotaMax(new Scanner(System.in).nextDouble());
		}

		System.out.println("Entre com o nome do aluno:");
		x.setNome(new Scanner(System.in).nextLine());
		while(true){
			try {
				System.out.println("Entre com as duas notas do aluno:");
				n1Aux = new Scanner(System.in).nextDouble();
				n2Aux = new Scanner(System.in).nextDouble();
				x.setNotas(n1Aux,n2Aux);
				break;
			}
			catch(Exception e) {
				System.out.println("nota inválida, faixa permitida: 0 a 10");
			}
		}
		System.out.println("Aluno digitado: "+x);
	}
}