package capitulo09;

public class Celular {

	private String marca;
	private String modelo;
	private int anoLancamento;
	private int capacidadeArmazenamento;
	private int qtdCameras;
	
	public Celular() {
		super();
		this.qtdCameras = 2;
	}
	
	public Celular(String marca, String modelo, 
			int capacidadeArmazenamento) {
		
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	public Celular(String marca, String modelo, int anoLancamento, int capacidadeArmazenamento, int qtdCameras) {
		this(marca, modelo, capacidadeArmazenamento);
		this.anoLancamento = anoLancamento;
		this.qtdCameras = qtdCameras;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public int getQtdCameras() {
		return qtdCameras;
	}

	public void setQtdCameras(int qtdCameras) {
		this.qtdCameras = qtdCameras;
	}
	
}
