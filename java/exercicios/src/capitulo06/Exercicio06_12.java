package capitulo06;

/**
 * 12 - Escreva um programa que calcule e escreva o resultado da soma dos números entre 1 e 50.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_12 {

	public static void main(String[] args) {
		int totalSoma = 0;
		for (int soma = 1; soma <= 50; soma++) {
			totalSoma = totalSoma + soma;
		}
		System.out.println("O total da soma dos números de 1 a 50 é: " + totalSoma);
	}
}
