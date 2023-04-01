package capitulo09.obras;

public enum TipoZona {

	URBANA("Zona Urbana"),
	RURAL("Zona Rural");
	
	private String nome;
	
	TipoZona(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
