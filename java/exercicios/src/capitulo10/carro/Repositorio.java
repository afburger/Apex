package capitulo10.carro;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<E extends Carro> {

	List<E> carros;
	
	public Repositorio() {
		carros = new ArrayList<>();
	}
	
	public void adicionaCarro(E carro) {
		carros.add(carro);
	}
	
	public List<E> getCarros() {
		return carros;
	}
}
