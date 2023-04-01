package capitulo09.xadrez;

public class Cavalo implements Peca {

	@Override
	public String movimentar() {
		return "anda duas casas para frente e uma para o lado.";
	}
	
	public boolean movimentoValido(String movimento) {
		return true;
	}

}
