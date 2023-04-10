package capitulo09.locadora;

import java.util.Objects;

public abstract class Produto {

	private String nome;
	private Double preco;
	private String codigoBarra;
	
	public Produto(String codigoBarra) {
		super();
		this.codigoBarra = codigoBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	protected abstract String getInformacaoEspecifica();
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Preco: " + preco + ", " + getInformacaoEspecifica();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoBarra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoBarra, other.codigoBarra);
	}
	
	
}
