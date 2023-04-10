package capitulo09.banco;

public class Banco {

	public static void main(String[] args) {
		
		System.out.println("########### CONTA DO ANDRE ############");
		
		ContaCorrente contaAndre = new ContaCorrente();
		contaAndre.depositar(50000.00);
		System.out.println(contaAndre.getSaldo());
		
		contaAndre.sacar(45000.00);
		System.out.println(contaAndre.getSaldo());
		
		contaAndre.sacar(3000.00);
		System.out.println(contaAndre.getSaldo());
		
		System.out.println("########### CONTA DO FELIPE ############");
		
		ContaCorrente contaFelipe = new ContaCorrenteEspecial();
		contaFelipe.depositar(50000.00);
		System.out.println(contaFelipe.getSaldo());
		
		contaFelipe.sacar(45000.00);
		System.out.println(contaFelipe.getSaldo());
		
		contaFelipe.sacar(3000.00);
		System.out.println(contaFelipe.getSaldo());
		
	}
	
}
