package capitulo06;

/**
 * 7 - Escreva todos os números pares entre o número 101 e o número 200.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_07 {

	public static void main(String[] args) {
		
		
		int inicio = 101;
		int fim = 200;
		
		do {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
			}
			inicio++;
			
		} while (inicio < fim);
		
//		int num = 101;
//		do {
//			if (num % 2 == 0) {
//				System.out.println(num);
//			}
//			num++;
//		} while (num > 101 && num < 200);
		
	}
}
