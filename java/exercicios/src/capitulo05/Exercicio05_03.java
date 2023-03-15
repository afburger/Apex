package capitulo05;

import java.util.Scanner;

/**
 * 3. Escreva um programa que solicite a idade do usuário 
 * e em seguida escreva a mensagem ‘Você é adulto!’ 
 * caso a idade informada seja maior ou igual a 18.
 *
 */
public class Exercicio05_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade:");
		int idade = scan.nextInt();

		scan.close();
		
		if (idade >= 18) {
			System.out.println("Você é adulto!");
		}

	}

}
