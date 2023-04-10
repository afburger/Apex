package capitulo09.locadora;

public class Dvd extends Produto {
	
	public Dvd(String codigoBarra) {
		super(codigoBarra);
	}

	private Double duracao;
	
	public Double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	@Override
	protected String getInformacaoEspecifica() {
		return "Duracao: " + duracao;
	}

	
	
	
	
}
