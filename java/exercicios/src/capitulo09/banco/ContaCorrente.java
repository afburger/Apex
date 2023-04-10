package capitulo09.banco;

public class ContaCorrente {

	private static final Double TAXA = 0.005;
	
	private Double saldo;
	
	public ContaCorrente() {
		super();
		this.saldo = 0.0;
	}
	
	public void depositar(Double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	public void sacar(Double valorSaque) {
		Double valorTaxa = valorSaque * getPercentualTaxa();
		this.saldo = this.saldo - valorSaque;
		this.saldo = this.saldo - valorTaxa;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	protected Double getPercentualTaxa() {
		return TAXA;
	}
}
