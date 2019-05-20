package ex17;

import java.util.Scanner;

public class Uso {
	public static void main (String[] args){
		int op;
		double resultado;
		System.out.println("Qual forma geometrica deseja Calcular?\n1-Quadrado\n2-Retangulo\n3-Circulo");
		do {
			op = new Scanner(System.in).nextInt();
			
			switch(op) {
			case 1:
				Quadrado quadrado = new Quadrado();
				System.out.println("Informe a Coordenada X:");
				quadrado.setX(new Scanner(System.in).nextDouble());
				System.out.println("Informe a Coordenada Y:");
				quadrado.setY(new Scanner(System.in).nextDouble());
				System.out.println("Informe o Comprimento:");
				quadrado.setComprimento((new Scanner(System.in).nextDouble()));
				System.out.println("Informe a Espessura:");
				quadrado.setEspessura((new Scanner(System.in).nextDouble()));
				System.out.println("é Sólido?:");
				quadrado.setSolido((new Scanner(System.in).nextBoolean()));
				resultado = quadrado.calculaAreaPerimetro();
				System.out.println(resultado);
				System.out.println(quadrado);
				break;
				
			case 2:
				Retangulo retangulo = new Retangulo();
				System.out.println("Informe a Coordenada X:");
				retangulo.setX(new Scanner(System.in).nextDouble());
				System.out.println("Informe a Coordenada Y:");
				retangulo.setY(new Scanner(System.in).nextDouble());
				System.out.println("Informe o Comprimento:");
				retangulo.setComprimento((new Scanner(System.in).nextDouble()));
				System.out.println("Informe o Largura:");
				retangulo.setLargura((new Scanner(System.in).nextDouble()));
				System.out.println("Informe a Espessura:");
				retangulo.setEspessura((new Scanner(System.in).nextDouble()));
				System.out.println("é Sólido?:");
				retangulo.setSolido((new Scanner(System.in).nextBoolean()));
				resultado = retangulo.calculaAreaPerimetro();
				System.out.println(resultado);
				System.out.println(retangulo);
				break;
				
			case 3:
				Circulo circulo = new Circulo();
				System.out.println("Informe a Coordenada X:");
				circulo.setX(new Scanner(System.in).nextDouble());
				System.out.println("Informe a Coordenada Y:");
				circulo.setY(new Scanner(System.in).nextDouble());
				System.out.println("Informe o Raio:");
				circulo.setRaio((new Scanner(System.in).nextDouble()));
				System.out.println("Informe a Espessura:");
				circulo.setEspessura((new Scanner(System.in).nextDouble()));
				System.out.println("é Sólido?:");
				circulo.setSolido((new Scanner(System.in).nextBoolean()));
				resultado = circulo.calculaAreaPerimetro();
				System.out.println(resultado);
				System.out.println(circulo);
				break;
				
			default:
					System.out.println("Por favor, informe uma opcao Valida");
					break;
			}
		}while (op!=0);
	}
}