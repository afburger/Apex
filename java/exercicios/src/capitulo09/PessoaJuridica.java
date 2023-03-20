package capitulo09;

public class PessoaJuridica extends Pessoa implements ValidacaoPessoa {

	private String inscricaoEstadual;
	private String ramoAtividade;

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	@Override
	public String formataCpfCnpj(String cpf) {
		return String.format(cpf, "###############");
	}
	
	@Override
	public boolean validaPessoaNaReceita() {
		return false;
	}
	
	
}
