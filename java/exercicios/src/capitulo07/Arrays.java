package capitulo07;

public class Arrays {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		
		String[] sobrenomes = new String[] {"Felipe", "João", "Marcelo"};
		
		for (int i = 0; i < sobrenomes.length; i++) {
			System.out.println(sobrenomes[i]);
		}
		
		for (String string : sobrenomes) {
			
		}
		
	}
	
}
