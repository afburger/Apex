package capitulo09.banco;

import java.util.ArrayList;
import java.util.List;

public class BancoArrayList {

	public static void main(String[] args) {
		
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setCodigo(0);
		conta1.depositar(1000.00);
		contas.add(conta1);
		
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.setCodigo(1);
		conta2.depositar(300.00);
		contas.add(conta2);
		
		
		ContaCorrente conta3 = new ContaCorrente();
		conta3.setCodigo(2);
		conta3.depositar(500.00);
		contas.add(conta3);
		
		
		ContaCorrenteEspecial conta4 = new ContaCorrenteEspecial();
		conta4.setCodigo(3);
		conta4.depositar(600.00);
		contas.add(conta4);
		
		
		ContaCorrenteEspecial conta5 = new ContaCorrenteEspecial();
		conta5.setCodigo(4);
		conta5.depositar(700.00);
		contas.add(conta5);
		
		
		ContaCorrenteEspecial conta6 = new ContaCorrenteEspecial();
		conta6.setCodigo(5);
		conta6.depositar(800.00);
		contas.add(conta6);
		
		System.out.println("############ Imprimir contas ###########");
		System.out.println(contas);
		
		
		System.out.println("############ Imprimir a conta 4 ###########");
		System.out.println(contas.get(4));
		
		contas.remove(2);
		
		
		System.out.println("############ Imprimir contas ###########");
		System.out.println(contas);
	}
}
