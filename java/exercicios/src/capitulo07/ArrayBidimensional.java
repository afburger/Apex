package capitulo07;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		String[][] nomeSobrenome = new String[4][3];
		
		nomeSobrenome[0][0] = "André";
		nomeSobrenome[0][1] = "Felipe";
		nomeSobrenome[0][2] = "Bürger";
		
		nomeSobrenome[1][0] = "Edson";
		nomeSobrenome[1][1] = "Walter";
		nomeSobrenome[1][2] = "Bürger";
		
		nomeSobrenome[2][0] = "Júlia";
		nomeSobrenome[2][1] = "Reiter";
		nomeSobrenome[2][2] = "Bürger";
		
		nomeSobrenome[3][0] = "Jeniffer";
		nomeSobrenome[3][1] = "Reiter";
		nomeSobrenome[3][2] = "Bürger";
		
		System.out.println(nomeSobrenome.length);
		System.out.println(nomeSobrenome[2].length);
		
		System.out.print(nomeSobrenome[0][0]);
		System.out.print(" ");
		System.out.print(nomeSobrenome[1][1]);
		System.out.print(" ");
		System.out.print(nomeSobrenome[0][2]);
		
	}
}
