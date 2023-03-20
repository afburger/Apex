package capitulo09;

public class PessoaFisica extends Pessoa implements ValidacaoPessoa {

	private String rg;
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String formataCpfCnpj(String cpf) {
		return String.format(cpf, "###.###.###-##");
	}

	@Override
	public boolean validaPessoaNaReceita() {
		return true;
	}

	
	
}
