package ex24;

import java.io.BufferedWriter;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.util.TreeSet;

import java.util.Scanner;



/**
   classe uso que ira gerar, a partir de um sorteio, uma certa quantidade de valores (definido pelo usuario)
 * e uma quantidade de sorteios que tambem sera definida pelo usuario, com datas subsequentes a partir de uma data inicial
 * 2. Serialização de objetos
 *<p>
 *O resultado em seguida e gravado em um arquivo de texto no disco atraves da serializacao
 *
 * @author Ualaci dos Anjos Junior
 *
 */



public class Uso {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int numeroDeSorteios,i;
		ConjuntoSorteio conjuntoSorteio = new ConjuntoSorteio();
		Data data = new Data();
		
		System.out.println("informe a quantidade de valores a ser sorteada");
		numeroDeSorteios = new Scanner(System.in).nextInt();
		System.out.println("informe a data");
		data.setData(new Scanner(System.in).nextLine());
		conjuntoSorteio.insere(data, numeroDeSorteios);
		
		BufferedWriter arquivoSorteios = new BufferedWriter(new FileWriter("arquivoSorteios.txt"));
		for(i=0;i<numeroDeSorteios;i++) {
			Sorteio sorteioAtual = conjuntoSorteio.getValorSorteado(i);
			Arquivo.grava("arquivoSorteios.txt", sorteioAtual);
		}
		
		arquivoSorteios.close();
}
	}