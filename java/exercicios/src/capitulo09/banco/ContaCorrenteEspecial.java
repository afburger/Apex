package capitulo09.banco;

public class ContaCorrenteEspecial 
	extends ContaCorrente {

	private static final Double TAXA_ESPECIAL = 0.001;
	
	@Override
	protected Double getPercentualTaxa() {
		return TAXA_ESPECIAL;
	}
}
