package capitulo05;

import java.util.Scanner;

/**
 * 4. Escreva um programa que solicite a nota de um aluno 
 * e em seguida escreva a mensagem “Aprovado” 
 * caso a nota seja igual ou maior que 6, 
 * senão escreva a mensagem “Reprovado”.
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota:");
		int nota = scan.nextInt();

		scan.close();
		
		if (nota >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}