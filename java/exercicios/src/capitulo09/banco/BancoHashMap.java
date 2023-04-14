package capitulo09.banco;

import java.util.HashMap;
import java.util.Map;

public class BancoHashMap {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setCodigo(1);
		conta1.depositar(1000.00);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.setCodigo(2);
		conta2.depositar(300.00);
		
		ContaCorrente conta3 = new ContaCorrente();
		conta3.setCodigo(3);
		conta3.depositar(500.00);
		
		ContaCorrenteEspecial conta4 = new ContaCorrenteEspecial();
		conta4.setCodigo(4);
		conta4.depositar(600.00);
		
		ContaCorrenteEspecial conta5 = new ContaCorrenteEspecial();
		conta5.setCodigo(5);
		conta5.depositar(700.00);
		
		ContaCorrenteEspecial conta6 = new ContaCorrenteEspecial();
		conta6.setCodigo(6);
		conta6.depositar(800.00);
		
		Map<Integer, ContaCorrente> contas = new HashMap<Integer, ContaCorrente>();
		
		contas.put(conta1.getCodigo(), conta1);
		contas.put(conta2.getCodigo(), conta2);
		contas.put(conta3.getCodigo(), conta3);
		contas.put(conta4.getCodigo(), conta4);
		contas.put(conta5.getCodigo(), conta5);
		contas.put(conta6.getCodigo(), conta6);
		
		System.out.println(contas);
		System.out.println();
		
		System.out.println(contas.get(conta4.getCodigo()));
		System.out.println();
		
		contas.remove(conta2.getCodigo());
		
		System.out.println(contas);
		
	}
}
