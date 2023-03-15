package capitulo05;

import java.util.Scanner;

/**
 * 2. Escreva um programa que leia um número informado pelo usuário 
 * e em seguida escreva uma mensagem indicando se o número é par ou impar. 
 * (Considere número par o número cujo resto da divisão por 2 seja igual a Zero)
 *
 */
public class Exercicio05_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " informado é par");
		} else {
			System.out.println("O número " + numero + " informado é ímpar");
		}
		scan.close();
	}
}
