package capitulo09;

public class Vinho {

	private String nomeVinho;
	private String nomeUva;
	private int anoSafra;
	private String paisOrigem;
	private double graduaaoAlcoolica;
	private double temperaturaServico;
	private String harmonizacao;

	public Vinho() {
		super();
	}
	
	public Vinho(
			String nomeVinho, 
			String nomeUva, 
			int anoSafra, 
			String paisOrigem, 
			double graduaaoAlcoolica,
			double temperaturaServico, 
			String harmonizacao) {
		
		this();
		this.nomeVinho = nomeVinho;
		this.nomeUva = nomeUva;
		this.anoSafra = anoSafra;
		this.paisOrigem = paisOrigem;
		this.graduaaoAlcoolica = graduaaoAlcoolica;
		this.temperaturaServico = temperaturaServico;
		this.harmonizacao = harmonizacao;
	}

	public String getNomeVinho() {
		return nomeVinho;
	}

	public void setNomeVinho(String nomeVinho) {
		this.nomeVinho = nomeVinho;
	}

	public String getNomeUva() {
		return nomeUva;
	}

	public void setNomeUva(String nomeUva) {
		this.nomeUva = nomeUva;
	}

	public int getAnoSafra() {
		return anoSafra;
	}

	public void setAnoSafra(int anoSafra) {
		this.anoSafra = anoSafra;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public double getGraduaaoAlcoolica() {
		return graduaaoAlcoolica;
	}

	public void setGraduacaoAlcoolica(double graduaaoAlcoolica) {
		this.graduaaoAlcoolica = graduaaoAlcoolica;
	}

	public double getTemperaturaServico() {
		return temperaturaServico;
	}

	public void setTemperaturaServico(double temperaturaServico) {
		this.temperaturaServico = temperaturaServico;
	}

	public String getHarmonizacao() {
		return harmonizacao;
	}

	public void setHarmonizacao(String harmonizacao) {
		this.harmonizacao = harmonizacao;
	}
	
	@Override
	public String toString() {
		return nomeVinho + " - " + nomeUva + " - " + anoSafra; 
	}
}
