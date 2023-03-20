package capitulo08;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private int qtdPortas;
	private int tamanhoRoda;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Carro(String marca, String modelo, String cor) {
		this(marca, modelo);
		this.cor = cor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	public String getQtdPortasFormatado() {
		return String.valueOf(qtdPortas);
	}
	
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	public int getTamanhoRoda() {
		return tamanhoRoda;
	}
	
	public void setTamanhoRoda(int tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}
	
	public void pintar(String cor) {
		if (cor == null) {
			this.setCor("Fundo");
		}
		if (this.cor == "Fundo") {
			setCor(cor);
		}
	}
	
	private void abrirPortas(int qtdPortasDianteiras, int qtdPortasTraseiras) {
		System.out.println("Portas abertas");
	}
	
	public boolean abrirPortas(int qtdPortas) throws FileNotFoundException{
		abrirPortas(qtdPortas, qtdPortas);
		return false;
	}
	
	@Override
	public String toString() {
		return marca + " - " + modelo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}
	
	
}
