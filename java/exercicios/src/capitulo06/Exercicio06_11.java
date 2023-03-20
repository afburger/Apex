package capitulo06;

/**
 * 11 - Escreva um programa que mostre na tela o desenho abaixo:
 * $$$$$
 * $$$$
 * $$$
 * $$
 * $
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_11 {

	public static void main(String[] args) {
		
		for (int qtdCifrao = 5; qtdCifrao >= 1; qtdCifrao--) {
			
			String cifrao = "";
			
			for (int i = 0; i < qtdCifrao; i++) {
				cifrao = cifrao.concat("$");
			}
			
			System.out.println(cifrao);
		}
	}
}
