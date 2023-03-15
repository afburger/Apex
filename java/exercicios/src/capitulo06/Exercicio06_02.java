package capitulo06;

import java.util.Scanner;

/**
 * 2 - Escreva um programa 
 * que solicite dois números distintos para o usuário, e em seguida, escreva
 * todos os número entre o intervalo dos números informados.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio06_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		scan.close();
		
		int numeroInicio = 0;
		int numeroFim = 0;
		
		if (primeiroNumero < segundoNumero) {
			numeroInicio = primeiroNumero + 1;
			numeroFim = segundoNumero - 1;
			
			while (numeroInicio <= numeroFim) {
				System.out.println(numeroInicio);
				numeroInicio++;
			}
			
		} else {
			numeroInicio = primeiroNumero - 1;
			numeroFim = segundoNumero + 1;
			
			while (numeroInicio >= numeroFim) {
				System.out.println(numeroInicio);
				numeroInicio--;
			}
		}
	}
}
