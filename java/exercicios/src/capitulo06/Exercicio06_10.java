package capitulo06;

/**
 * * 10 - Escreva um programa que mostre na tela o desenho abaixo
 * X
 * XX
 * XXX
 * XXXX
 * XXXXX;
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_10 {

	public static void main(String[] args) {
		
		for (int qtdX = 1; qtdX <= 5; qtdX++) {
			
			String xis = "";
			
			for (int i = 0; i < qtdX; i++) {
				xis = xis.concat("X");
			}
			
			System.out.println(xis);
		}

	}
}
