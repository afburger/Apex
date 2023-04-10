package capitulo09.locadora;

public class Livro extends Produto {

	public Livro(String codigoBarra) {
		super(codigoBarra);
	}

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	protected String getInformacaoEspecifica() {
		return "Autor: " + autor;
	}
	
}
