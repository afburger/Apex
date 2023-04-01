package capitulo09.xadrez;

public class Peao implements Peca {

	@Override
	public String movimentar() {
		// anda uma casa por vêz ou duas na primeira jogada, 
		// sempre em linha reta.
		return "anda uma casa por vêz ou duas na primeira jogada, sempre em linha reta.";
	}

}
