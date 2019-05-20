package contaBancaria;
import java.util.Scanner;

public class UsoConta {
	
	public static Conta contaBancoDados;

	public static void main (String[] args)throws Exception {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		System.out.println("Insira o valor do Juros:");
		Conta.setTaxaJuros(new Scanner(System.in).nextDouble());
		
		try {
			System.out.println("Insira os dados da primeira Conta:");
			conta1.setConta(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextLine());
			}
		
		catch (Exception e){ System.out.println("Saldo Invalido");}
		System.out.println(conta1);
		
		try {
			System.out.println("Insira os dados da segunda Conta:");
			conta2.setConta(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextLine());
			}
		
		catch (Exception e){ System.out.println("Saldo Invalido");}
		System.out.println(conta2);
		
		System.out.println("Informe para qual conta deseja realizar a correção de saldo: Conta1: 1, Conta2: 2");
		
		int resp;
		resp = new Scanner(System.in).nextInt();
		
		while(resp!=1 && resp!=2) {
			System.out.println("Por favor insira uma conta válida:");
			resp = new Scanner(System.in).nextInt();
		}
		
		if (resp==1) {
			conta1.corrigeSaldo(conta1);
			System.out.println(conta1);
			}
			
		
		else if (resp==2) {
			conta2.corrigeSaldo(conta2);
			System.out.println(conta2);
			}
		
}}
