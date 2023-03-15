package capitulo05;

import java.util.Scanner;

/**
 * 1. Escreva um programa que solicite um número para o usuário 
 * e em seguida escreva uma mensagem informando se 
 * o número informado é múltiplo de 5. 
 * Para que um número seja múltiplo de 5, ele deve ser maior ou igual a 5 
 * e o resto da divisão por 5 deve ser igual a zero.
 *
 */
public class Exercicio05_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
//		int numero = Integer.parseInt(scan.nextLine());
		int numero = scan.nextInt();
		
		if (numero >= 5 && (numero % 5) == 0) {
			System.out.println("O número " + numero + " informado é divisivel por 5");
		}
		scan.close();
	}
}
