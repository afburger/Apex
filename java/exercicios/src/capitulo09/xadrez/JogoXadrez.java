package capitulo09.xadrez;

public class JogoXadrez {

	public static void main(String[] args) {
		Peao peao = new Peao();
		Cavalo cavalo = new Cavalo();
		
		Cavalo cavalo2 = new Cavalo();
		
//		peao.movimentar();
//		cavalo.movimentar();
		if (cavalo.movimentoValido("")) {
			fazerJogada(cavalo);
		}
		fazerJogada(peao);
		if (cavalo2.movimentoValido("")) {
			fazerJogada(cavalo2);
		}
	}

	public static void fazerJogada(Peca peca) {
		if (peca instanceof Cavalo) {
			System.out.println("Cavalo jogando");
			
		} else if (peca instanceof Peao) {
			System.out.println("Peao vai jogar");
		} 
		
		if (peca instanceof Peca) {
			System.out.println("é uma peça");
		}
		
		System.out.println(peca.movimentar());
	}
}
