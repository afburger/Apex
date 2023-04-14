package capitulo10.carro;

public class Carro {

	private Integer ano;
	private String modelo;
	private String marca;

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "\n Carro: " + marca + " - " + modelo + "(" + ano + ")";
	}
	
	
}
