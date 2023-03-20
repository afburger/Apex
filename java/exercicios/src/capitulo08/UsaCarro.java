package capitulo08;

public class UsaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setMarca("Honda");
		carro1.setModelo("CRV");
		
		Carro carro2 = new Carro("Honda", "Civic", "Preto");
		
		System.out.println(carro1.equals(carro2));
		
		System.out.println(carro1);
		System.out.println(carro2);
		
	}
}
