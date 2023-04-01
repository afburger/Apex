package capitulo09;

public class Vinho extends Bebida {

	private String nomeVinho;
	private String nomeUva;
	private int anoSafra;
	private String paisOrigem;
	private double graduaaoAlcoolica;
	private double temperaturaServico;
	private String harmonizacao;
	private boolean aberto;
	private boolean consumido;
	
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

	public void setGraduaaoAlcoolica(double graduaaoAlcoolica) {
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
	
	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isConsumido() {
		return consumido;
	}

	public void setConsumido(boolean consumido) {
		this.consumido = consumido;
	}
	
	public void abrirVinho(boolean aberto) throws Exception {
		this.aberto = aberto;
	}

	@Override
	public void getParametrosSave() {
		// a implementação do jeito que eu quero.
	}
	
	
}
