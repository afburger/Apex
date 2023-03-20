package capitulo09;

public abstract class Pessoa {

	private String cpfCnpj;
	private String nome;
	private String ruaEndereco;
	private int numeroEndereco;
	private String bairroEndereco;

	public abstract String formataCpfCnpj(String cpf);
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = formataCpfCnpj(cpfCnpj);
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}
	
}
