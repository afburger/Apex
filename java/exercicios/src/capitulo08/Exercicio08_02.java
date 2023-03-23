package capitulo08;

import java.util.Scanner;

/**
 * 2 (DESAFIO) - Refaça o código anterior, 
 * mas agora pergunte ao usuário quantos números ele deseja inserir no array. 
 * Depois, o usuário vai preenchendo elemento por elemento do vetor.
 * 
 * Ao final, exiba o array e o array ordenado (Para isso pesquise sobre bubble sort).
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe quantos números você deseja informar para o vetor");
		int qtdNumeros = scan.nextInt();
		
		int[] numerosInformados = new int[qtdNumeros];
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Informe um número inteiro:");
			numerosInformados[i] = scan.nextInt();
		}
		
		scan.close();
		
		System.out.println("Vetor de números informado pelo usuário:");
		for (int numero : numerosInformados) {
			System.out.print(numero + ",");
		}
		
		ordenar(numerosInformados);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Vetor de números ordenado:");
		for (int numero : numerosInformados) {
			System.out.print(numero + ",");
		}
		
	}
	
	/**
	 * http://www.universidadejava.com.br/pesquisa_ordenacao/bubble-sort/#:~:text=O%20Bubble%2DSort%20%C3%A9%20um,se%20est%C3%A3o%20na%20ordem%20desejada.
	 */
	public static void ordenar(int[] vetor) {
	    // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
	    for(int controle = 0; controle < vetor.length - 1; controle++) {
	      // for utilizado para ordenar o vetor.
	      for(int posicaoVetor = 0; posicaoVetor < vetor.length - 1 - controle; posicaoVetor++) {
	        /* Se o valor da posição atual do vetor for maior que o proximo valor,
	          então troca os valores de lugar no vetor. */
	        if(vetor[posicaoVetor] > vetor[posicaoVetor + 1]) {
	          int aux = vetor[posicaoVetor];
	          vetor[posicaoVetor] = vetor[posicaoVetor + 1];
	          vetor[posicaoVetor + 1] = aux;
	        }
	      }
	    }
	  }
}
