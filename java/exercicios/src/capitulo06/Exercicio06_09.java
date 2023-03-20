package capitulo06;

/**
 * 9 - Escreva um programa que apresente todos os números ímpares entre 1 e 100;
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_09 {

	public static void main(String[] args) {
		
		for (int i = 2; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}
}
