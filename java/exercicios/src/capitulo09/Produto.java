package capitulo09;

public class Produto {
	
	private int codigo;
	private String descrição;
	private Double valor;
	
	public Produto() {
		super();
		this.valor = 1.0;
	}
	
	public Produto(int codigo) {
		this();
		this.codigo = codigo;
	}
	
	public Produto(int codigo, String descrição) {
		this(codigo);
		this.descrição = descrição;
	}

	public void alteraDescricao(String novaDescricao) {
		this.descrição = novaDescricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescrição() {
		return descrição;
	}
	
	public Double getValor() {
		return valor;
	}
}
