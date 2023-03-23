package capitulo08;

import java.util.Scanner;

/**
 * 1 – Implemente um código que peça para o usuário informar 5 números separados por vírgula.
 * Armazene cada um dos números digitados em uma posição de um array, depois exiba tal array.
 * Modifique os elementos do array de modo a sequência de números ficará do contrário.
 * Ou seja, se digitou: 1,2,3. Vai aparecer: 3,2,1
 * 
 */
public class ArrayExercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informar 5 números inteiros, separados por ','");
		
		//String numeros = "5,4,3,2,1";
		String leituraTeclado = scan.nextLine();
		
		String[] arrayNumeros = leituraTeclado.split(",");
		
		for (String numero : arrayNumeros) {
			System.out.println(numero);
		}
		
		System.out.println();
		System.out.println("Numeros na ordem inversa");
		
		String[] novoArray =  new String[5];
		
		int varControle = 0;
		
		for (int i = arrayNumeros.length - 1; i >= 0; i--) {
			String string = arrayNumeros[i];
			novoArray[varControle] = string;
			varControle++;
//			System.out.println(string);
		}
		
		for (String string : novoArray) {
			System.out.println(string);
		}
			
	}
	
}
