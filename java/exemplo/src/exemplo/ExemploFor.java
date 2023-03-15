package exemplo;

public class ExemploFor {

	public static void main(String[] args) {
		
		String[] strings = new String[] {"Felipe", "João", "Maria"};
		
		String[] cidades = new String[] {"Blumenau", "Indaial", "Timbó"};
		
		for (int i = 0; i < strings.length; i++) {
			String nome = strings[i];
			System.out.println(nome);
		}
		
		// foreach
		for (String nomeCidade : cidades) {
			System.out.println(nomeCidade);
		}
		
		
	}
	
}
