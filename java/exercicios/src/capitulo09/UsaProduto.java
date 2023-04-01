package capitulo09;

public class UsaProduto {

	public static void main(String[] args) {
		String descricao = "Nova descrição do produto";
		
		Produto produto = new Produto(1);
		produto.alteraDescricao(descricao);
		
		Produto produto2 = new Produto(2, "Bla bla bla");
//		produto2.codigo = 1;
		System.out.println(produto2.getCodigo());
		
		System.out.println(produto);
		System.out.println(produto2);
		
		System.out.println(produto.equals(produto2));
	}
	
}
