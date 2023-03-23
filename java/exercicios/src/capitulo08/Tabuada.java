package capitulo08;

/**
 *  * 4 - Implemente um array bidimensional para representar as tabuadas de 1 a 10.
 * e apresente o resultado da tabuada de cada número conforme o exemplo abaixo.
 * Exemplo do resultado esperado:
 * 	1 x 1 = 1
 * 	1 x 2 = 2
 * 	1 x 3 = 3
 * ...
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 
 * @author andre
 *
 */
public class Tabuada {

	public static void main(String[] args) {
		int[][] tabuada = new int[10][10];
		
		for (int i = 0; i < tabuada.length; i++) {
			int multiplicador = i + 1;
			
			int[] multiplicados = tabuada[i];
			
			for (int j = 0; j < multiplicados.length; j++) {
				int multiplicando = j + 1;
				
				tabuada[i][j] = multiplicador * multiplicando;
			}
		}
		
		for (int i = 0; i < tabuada.length; i++) {
			int multiplicador = i + 1;
			
			int[] multiplicados = tabuada[i];
			
			System.out.println("Tabuada de " + multiplicador);
			
			for (int j = 0; j < multiplicados.length; j++) {
				int multiplicando = j + 1;
				
				System.out.println(multiplicador + " x" + multiplicando + " = " + tabuada[i][j]);
			}
			
			System.out.println();
		}
	}
	
}
