package capitulo05;

import java.util.Scanner;

/**
 * 5. Escreva um programa que solicite as 3 notas de um aluno 
 * e em seguida calcule o valor da média das notas. 
 * Caso a média seja maior ou igual a 9 escreva a mensagem “Conceito A”, 
 * caso a nota seja menor que 9 e maior ou igual a 7 escreva a mensagem “Conceito B”, 
 * caso a nota seja menor que 7 e maior ou igual a 5 escreva a mensagem “Conceito C”, 
 * se a nota for menor que 5 escreva a mensagem “Conceito Insuficiente”.
 *
 */
public class Exercicio05_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota 1:");
		int notaUm = scan.nextInt();
		System.out.println("Digite a nota 2:");
		int notaDois = scan.nextInt();
		System.out.println("Digite a nota 3:");
		int notaTres = scan.nextInt();
		
		scan.close();
		
		double media = (notaUm + notaDois + notaTres) / 3;
		
		if (media >= 9) {
			System.out.println("Conceito A!");
		} else if (media < 9 && media >= 7) {
			System.out.println("Conceito B!");
		} else if (media >= 5) {
			System.out.println("Conceito C!");
		} else {
			System.out.println("Conceito Insulficiente!");
		}
	}

}
