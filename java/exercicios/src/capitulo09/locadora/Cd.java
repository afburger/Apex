package capitulo09.locadora;

public class Cd extends Produto {

	public Cd(String codigoBarra) {
		super(codigoBarra);
	}

	private int numeroFaixas;

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	@Override
	protected String getInformacaoEspecifica() {
		return "Número de faixas: " + numeroFaixas;
	}

	
}
