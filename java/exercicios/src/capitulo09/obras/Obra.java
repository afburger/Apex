package capitulo09.obras;

import java.util.Date;

public abstract class Obra {

	private int numero;
	private Date dataCadastro;
	private String descricao;
	private Responsavel[] responsaveis;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Responsavel[] getResponsaveis() {
		return responsaveis;
	}

	public void setResponsaveis(Responsavel[] responsaveis) {
		this.responsaveis = responsaveis;
	}
}
