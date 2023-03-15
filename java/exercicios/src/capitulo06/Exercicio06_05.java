package capitulo06;

/**
 * 5 - Escreva um programa que escreva os números entre 1000 e 100.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_05 {

	public static void main(String[] args) {
		
		int inicio = 999;
		int fim = 100;
		
		do {
			inicio--;
			System.out.println(inicio);
		} while (inicio > fim+1);
		
		
		
	}
}
