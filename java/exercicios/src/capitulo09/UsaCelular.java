package capitulo09;

public class UsaCelular {

	public static void main(String[] args) {
		Celular celular1 = new Celular();
		Celular celular2 = new Celular();
		
		Celular celular3 = new Celular("Apple", "iPhone 14", 512);
		Celular celular4 = new Celular("Samsung", "S23", 256);
		
		System.out.println(celular1);
	}

}
