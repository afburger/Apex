package capitulo06;

/**
 * 3 - Escreva todos os números impares entre o número 101 e o número 200.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_03 {

	public static void main(String[] args) {
		
		int numero = 100;
		while (numero < 200) {
			
			numero++;
			
			if (numero % 2 != 0) {
				System.out.println(numero);
			}
			
		}
	}
}
