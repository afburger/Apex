package capitulo10.carro;

import java.util.ArrayList;
import java.util.List;

public class UsaCarros {

	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<Carro>();
		
		Carro carro1 = new Carro();
		carro1.setAno(1992);
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Kadett GSI");
		carros.add(carro1);
		
		Carro carro2 = new Carro();
		carro2.setAno(1994);
		carro2.setMarca("Volkswagen");
		carro2.setModelo("Gol GTI");
		carros.add(carro2);
		
		Carro carro3 = new Carro();
		carro3.setAno(1988);
		carro3.setMarca("Volkswagen");
		carro3.setModelo("Gol GT");
		carros.add(carro3);
		
		Carro carro4 = new Carro();
		carro4.setAno(1993);
		carro4.setMarca("Ford");
		carro4.setModelo("Escort XR3");
		carros.add(carro4);
		
		Carro carro5 = new Carro();
		carro5.setAno(1993);
		carro5.setMarca("Fiat");
		carro5.setModelo("Uno Turbo");
		carros.add(carro5);
		
		SUV suv = new SUV();
		suv.setAno(2023);
		suv.setMarca("Toyota");
		suv.setModelo("SW4");
		
		Hatch hatch = new Hatch();
		
		System.out.println(" ##### Lista de Carros #####");
		System.out.println(carros);
		System.out.println();
		
		System.out.println(" ##### Carro da posição 3 #####");
		System.out.println(carros.get(3));
		System.out.println();
		
		carros.remove(1);
		
		System.out.println(" ##### Lista de Carros #####");
		System.out.println(carros);
		
		Repositorio<Carro> repositorioCarros = new Repositorio<>();
		repositorioCarros.adicionaCarro(carro1);
		repositorioCarros.adicionaCarro(carro2);
		
		Repositorio<SUV> repositorioSUV = new Repositorio<>();
		repositorioSUV.adicionaCarro(suv);
		
	}
}
