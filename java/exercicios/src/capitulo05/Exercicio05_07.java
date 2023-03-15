package capitulo05;

import java.util.Scanner;

/**
 * Escreva um programa que solicite o nome de um dos três países 
 * com mais títulos da copa do mundo, 
 * em seguida escreva uma mensagem ao usuário informando 
 * se a resposta está correta ou errada. 
 * Considere os três países com mais títulos como sendo BRASIL, ITÁLIA E ALEMANHA. 
 *(Dica: tente utilizar um switch sem breaks).
 * @author andre
 *
 */
public class Exercicio05_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome de um país com mais títulos na copa do mundo");
		
		String pais = scan.nextLine();
		
		scan.close();
		
		String resultado = acertou(pais) ? "Acertou!" : "Errrrooouuu!";
		
		System.out.println(resultado);
	}
	
//	public static boolean acertou(String pais) {
//		switch (pais) {
//		case "BRASIL":
//			return true;
//		case "ITÁLIA":
//			return true;
//		case "ALEMANHA":
//			return true;
//		default:
//			return false;
//		}
//	}
	
	public static boolean acertou(String pais) {
		switch (pais) {
		case "BRASIL":
		case "ITÁLIA":
		case "ALEMANHA":
			return true;
		default:
			return false;
		}
	}
}
