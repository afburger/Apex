package capitulo09;

public class Vinho2 {

	String nomeVinho; 
	String nomeUva; 
	int anoSafra;
	String paisOrigem; 
	double graduacaoAlcoolica; 
	int temperaturaServico;
	String sugestaoHarmonizacao;
	
	public Vinho2() {
		super();
	}
	
	public Vinho2(
			String nomeVinho, 
			String nomeUva, 
			int anoSafra, 
			String paisOrigem, 
			double graduacaoAlcoolica,
			int temperaturaServico, 
			String sugestaoHarmonizacao) {
		
		this();
		this.nomeVinho = nomeVinho;
		this.nomeUva = nomeUva;
		this.anoSafra = anoSafra;
		this.paisOrigem = paisOrigem;
		this.graduacaoAlcoolica = graduacaoAlcoolica;
		this.temperaturaServico = temperaturaServico;
		this.sugestaoHarmonizacao = sugestaoHarmonizacao;
	}
	
	
}
