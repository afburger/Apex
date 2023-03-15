package capitulo05;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que apresente uma lista com as opções 
 * ‘1 - Sacar’, 
 * ‘2 - Depositar’, 
 * ‘3 - verificar saldo’. 
 * Em seguida solicite que o usuário informe um número entre 1 e 3. 
 * Caso o usuário tenha informado o número 1 apresente a mensagem “você escolheu a opção sacar”, 
 * caso o usuário tenha informado o número 2 apresente a mensagem “você escolheu a opção depositar”, 
 * caso o usuário tenha informado o número 3 apresente a mensagem ‘você escolheu a opção verificar saldo’. 
 * Caso o usuário tenha informado um número fora do range(1,2,3) apresente a mensagem ‘Opção inválida’.
 *
 */
public class Exercicio05_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - verificar saldo");
		System.out.println("Informe uma opção de 1 a 3:");
		
		int opcao = scan.nextInt();
		
		scan.close();
		
		switch (opcao) {
		case 1: 
			System.out.println("você escolheu a opção sacar");
			break;
		
		case 2: 
			System.out.println("você escolheu a opção depositar");
			break;
		
		case 3: 
			System.out.println("você escolheu a opção verificar saldo");
			break;
			
		default:
			System.out.println("Opção inválida");
		}
	}

}
