package capitulo06;

import java.util.Scanner;

/**
 * 4 - Escreva um programa que solicite um número ao usuário 
 * e em seguida escreva o valor do número informado multiplicado por 5. 
 * O programa deve continuar solicitando novos números até que o usuário digite um número 
 * negativo.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroPositivo = 0;
		
		while (numeroPositivo >= 0) {
			System.out.println("Digite um número positivo para continuar: ");
			numeroPositivo = scan.nextInt();
			
			if (numeroPositivo >= 0) {
				int resultadoMultiplicacao = numeroPositivo * 5;
				System.out.println("O resultado de (" + numeroPositivo +" x 5) é:" + resultadoMultiplicacao);
			}
				
		}
		
		scan.close();
		
		System.out.println("Você digitou um número negativo e fechou a aplicação");
		
	}
}
