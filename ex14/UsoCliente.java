package ex14;
import java.util.Scanner;

public class UsoCliente {

		
		public static void main (String[] args) {
			int nCadastros;
			int celular;
			int i=0,j;
			String nome, endereco, email, tipoCliente;
			double rendaFamiliar;
			
			System.out.println("Insira o numero de Cadastros que deseja realizar:");
			nCadastros = new Scanner(System.in).nextInt();
			
			Cliente[] clientes = new Cliente[nCadastros];

			for(i=0;i<nCadastros;i++) {
				j=i+1;
				System.out.println("Nome do Cliente :" +j);
				nome = new Scanner(System.in).nextLine();
				
				System.out.println("Renda:");
				rendaFamiliar = new Scanner(System.in).nextDouble();
				
				System.out.println("Email:");
				email = new Scanner(System.in).nextLine();

				System.out.println("Celular:");
				celular = new Scanner(System.in).nextInt();
				
				System.out.println("Endereco:");
				endereco = new Scanner(System.in).nextLine();
				
				try {clientes[i] = new Cliente(nome, email, celular, endereco, rendaFamiliar);}
				catch (Exception e) {
                    System.out.println("Email Invalido");
			}
		}
			for(i=1;i<nCadastros;i++) {
				j=i+1;
				System.out.println("Cliente "+j +":");
				System.out.println(clientes[i]);
				tipoCliente = clientes[i].categoriaCliente(clientes[i].getRendaFamiliar());
				System.out.print("Categoria do Cliente: "+ tipoCliente +"|");
			}
	}
}