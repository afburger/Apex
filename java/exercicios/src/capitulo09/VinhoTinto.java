package capitulo09;

public class VinhoTinto extends Vinho {

	protected boolean abrirVinho(boolean aberto, boolean consumi) throws NullPointerException {
		setAberto(aberto);
		setConsumido(consumi);
		return aberto && consumi;
	}
	
	
	
}
