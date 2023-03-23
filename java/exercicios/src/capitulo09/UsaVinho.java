package capitulo09;

public class UsaVinho {

	public static void main(String[] args) {
		
		Vinho vinho1 =  new Vinho();
		vinho1.setNomeVinho("Casa Valduga Origem");
		vinho1.setNomeUva("Cabernet Sauvignon");
		vinho1.setPaisOrigem("Brasil");
		vinho1.setAnoSafra(2016);
		vinho1.setGraduacaoAlcoolica(12);
		vinho1.setTemperaturaServico(16);
		vinho1.setHarmonizacao("Qualquer");
		
		
		Vinho vinho2 = new Vinho();
		vinho2.setNomeVinho("Balance Winemakers Selection");
		vinho2.setNomeUva("Shiraz");
		vinho2.setPaisOrigem("África do Sul");
		vinho2.setAnoSafra(2020);
		vinho2.setGraduacaoAlcoolica(14.2);
		vinho2.setTemperaturaServico(14.5);
		vinho1.setHarmonizacao("Tanto faz");
		
		
		Vinho vinho3 = new Vinho();
		vinho3.setNomeVinho("Cordero con Piel de Lobo");
		vinho3.setNomeUva("Malbec");
		vinho3.setPaisOrigem("Argentina");
		vinho3.setAnoSafra(2018);
		vinho3.setGraduacaoAlcoolica(13.4);
		vinho3.setTemperaturaServico(15.5);
		
		System.out.println(vinho1.getNomeVinho() + " - " + vinho1.getNomeUva() + " - " + vinho1.getAnoSafra());
		System.out.println(vinho2);
		System.out.println(vinho3);
		
		Vinho vinho4 = new Vinho("Vinho 4", "Branco", 2019, "Argentina", 14, 16, null);
		Vinho vinho5 = new Vinho("Vô Luiz", "Tinto", 2022, "Brasil", 14, 16, "Ficar bêbado");
		Vinho vinho6 = new Vinho("Vinho 6", "Suave", 2018, "Argentina", 14, 16, "Combina com peixes");
		
		System.out.println(vinho4.getNomeVinho() + " - " + vinho1.getNomeUva() + " - " + vinho1.getAnoSafra());
		System.out.println(vinho5);
		System.out.println(vinho6);
	}
	
}
