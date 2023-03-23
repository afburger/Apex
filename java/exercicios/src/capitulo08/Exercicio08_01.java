package capitulo08;

import java.util.Scanner;

/**
 * 1 – Implemente um código que peça para o usuário informar 5 números separados por vírgula.
 * Armazene cada um dos números digitados em uma posição de um array, depois exiba tal array.
 * Modifique os elementos do array de modo a sequência de números ficar do contrário.
 * Ou seja, se digitou: 1,2,3. Vai aparecer: 3,2,1
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio08_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe 5 números inteiros separados por ',''");
		String numeros = scan.nextLine();
		String[] vetorNumerosString = numeros.split(",");
		
		int[] vetorNumeros = new int[vetorNumerosString.length];
		
		scan.close();
		
		int posicaoArrayAntigo = 0;
		System.out.println("Array informado pelo usuário: ");
		for (String numero : vetorNumerosString) {
			System.out.print(numero + ",");
			vetorNumeros[posicaoArrayAntigo] = Integer.parseInt(numero);
			posicaoArrayAntigo++;
		}
		
		int[] vetorNumerosDois = new int[vetorNumeros.length];
		
		int posicaoArrayNovo = 0;
		for (int i = vetorNumeros.length - 1; i >= 0; i--) {
			vetorNumerosDois[posicaoArrayNovo] = vetorNumeros[i];
			posicaoArrayNovo++;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array informado pelo usuário com a ordem invertida: ");
		for (int numero : vetorNumerosDois) {
			System.out.print(numero + ",");
		}
	}
}
