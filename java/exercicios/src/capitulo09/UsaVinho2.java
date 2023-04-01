package capitulo09;

public class UsaVinho2 {

	public static void main(String[] args) {
		
		// Instacia de um objeto Vinho2
		Vinho2 vinhoUm = new Vinho2();
		vinhoUm.nomeVinho = "DV Catena";
		vinhoUm.anoSafra = 2019;
		
		Vinho2 vinhoDois = new Vinho2();
		Vinho2 vinhoTres = new Vinho2();
		
		Vinho2 vinhoQuatro = new Vinho2(
				"Salton", 
				"Cabernet", 
				2018, 
				"Argentina", 
				13.5, 
				16, 
				"Carnes vermelhas");
		
		Vinho2 vinhoCinco = new Vinho2(
				"Nome vinho2", 
				"Uva 2", 
				2018, 
				"Argentina", 
				10.5, 
				12, 
				"Aves");
		
		Vinho2 vinhoSeis = new Vinho2(
				"Nome vinho3", 
				"Uva 6", 
				2022, 
				"Uruguay", 
				11.5, 
				15, 
				"Sopas");
		
		System.out.println(vinhoQuatro);
	}
	
}
