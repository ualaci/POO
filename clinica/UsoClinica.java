package clinica;

import java.util.Scanner;

public class UsoClinica {
	
	public static void main (String[] args) {
		int nCadastros;
		int i=0, tipoFuncionario=10;
		String nome, departamento;
		Data dataPromocao = new Data(), dataNascimento = new Data(), dataAdmissao = new Data();
		double identidade, salario;
		System.out.println("Insira o numero de Cadastros que deseja realizar:");
		nCadastros = new Scanner(System.in).nextInt();
		
		Funcionario[] funcionarios = new Funcionario[nCadastros];
		Chefe chefe = new Chefe();
		Diretor diretor = new Diretor();

		for(i=0;i<nCadastros;i++) {
			System.out.println("Qual tipo de funcionario deseja informar? \n1- Comum \n2- Chefe \n3-Diretor");
			tipoFuncionario = new Scanner(System.in).nextInt();
			
			System.out.println("Nome:");
			nome = new Scanner(System.in).nextLine();
			
			System.out.println("Identidade:");
			identidade = new Scanner(System.in).nextDouble();
			
			System.out.println("Data de nascimento:");
			dataNascimento.setDate(new Scanner(System.in).nextInt());
			dataNascimento.setMonth((new Scanner(System.in).nextInt())-1);
			dataNascimento.setYear(new Scanner(System.in).nextInt());
			
			System.out.println("Data de admissao:");
			dataAdmissao.setDate(new Scanner(System.in).nextInt());
			dataAdmissao.setMonth((new Scanner(System.in).nextInt())-1);
			dataAdmissao.setYear(new Scanner(System.in).nextInt());
			
			System.out.println("Salario:");
			salario = new Scanner(System.in).nextDouble();
			
			if(tipoFuncionario == 1) {
				funcionarios[i] = new Funcionario(nome , identidade , dataNascimento , salario , dataAdmissao);
			}
			
			if(tipoFuncionario == 2) {
				
				System.out.println("Departamento:");
				departamento = new Scanner(System.in).nextLine();
				((Chefe)funcionarios[i]).setDepartamento(departamento);
				funcionarios[i] = new Chefe(nome , identidade, dataNascimento, salario, dataAdmissao, departamento);
			}
			
			if (tipoFuncionario == 3) {
				
				System.out.println("Departamento:");
				departamento = new Scanner(System.in).nextLine();
				
				System.out.println("Data de Promocao:");
				dataPromocao.setDate(new Scanner(System.in).nextInt());
				dataPromocao.setMonth((new Scanner(System.in).nextInt())-1);
				dataPromocao.setYear(new Scanner(System.in).nextInt());
				funcionarios[i] = new Diretor(nome , identidade, dataNascimento, salario, dataAdmissao, departamento, dataPromocao);
			}
		}
		for(i=0;i<nCadastros;i++) {
			System.out.println("" + funcionarios[i]);
		}
	}
}
