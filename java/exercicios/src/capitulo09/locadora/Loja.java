package capitulo09.locadora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loja {

	public static void main(String[] args) {
		
		Produto[] produtos = new Produto[7];
		List<Produto> produtosList = new ArrayList<Produto>();
		Map<String, Produto> produtosMap = new HashMap<String, Produto>();
		
		Livro livroHP = new Livro("12345");
		livroHP.setNome("Harry Potter e a pedra filosofal");
		livroHP.setPreco(55.20);
		livroHP.setAutor("Teste");
		
		Cd cdEhOTchan = new Cd("6789");
		cdEhOTchan.setNome("Carla Perez");
		cdEhOTchan.setNumeroFaixas(10);
		cdEhOTchan.setPreco(5.99);
		
		Dvd dvdHP = new Dvd("987");
		dvdHP.setNome("Harry Potter e a pedra filosofal");
		dvdHP.setDuracao(2.55);
		dvdHP.setPreco(29.75);
		
		Livro livroAutoAjuda = new Livro("654");
		livroAutoAjuda.setNome("Bom dia e CIA");
		livroAutoAjuda.setPreco(5.20);
		livroAutoAjuda.setAutor("Eliana");
		
		Livro livroJava = new Livro("321");
		livroJava.setNome("Aprenda Java em 21 dias");
		livroJava.setPreco(170.45);
		livroJava.setAutor("James Goslin");
		
		Livro livroAutoAjudaDois = new Livro("693");
		livroAutoAjudaDois.setNome("Bom dia e CIA");
		livroAutoAjudaDois.setPreco(5.20);
		livroAutoAjudaDois.setAutor("Eliana");
		
		Livro livroHP1 = new Livro("12345");
		livroHP1.setNome("Harry Potter e a pedra filosofal");
		livroHP1.setPreco(55.20);
		livroHP1.setAutor("Teste");
		
		Livro livroHP2 = new Livro("1235");
		livroHP2.setNome("Harry Potter e a pedra filosofal");
		livroHP2.setPreco(55.20);
		livroHP2.setAutor("Teste");
		
		produtos[0] = livroHP;
		produtosList.add(livroHP);
		produtosMap.put(livroHP.getCodigoBarra(), livroHP);
		
		produtos[1] = cdEhOTchan;
		produtosList.add(cdEhOTchan);
		produtosMap.put(cdEhOTchan.getCodigoBarra(), cdEhOTchan);
		
		produtos[2] = dvdHP;
		produtosList.add(dvdHP);
		produtosMap.put(dvdHP.getCodigoBarra(), dvdHP);
		
		produtos[3] = livroAutoAjuda;
		produtosList.add(livroAutoAjuda);
		produtosMap.put(livroAutoAjuda.getCodigoBarra(), livroAutoAjuda);
		
		produtos[4] = livroJava;
		produtosList.add(livroJava);
		produtosMap.put(livroJava.getCodigoBarra(), livroJava);
		
		produtos[5] = livroHP1;
		produtosList.add(livroHP1);
		produtosMap.put(livroHP1.getCodigoBarra(), livroHP1);
		
		produtos[6] = livroHP2;
		produtosList.add(livroHP2);
		produtosMap.put(livroHP2.getCodigoBarra(), livroHP2);
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}
		
		System.out.println("");
		System.out.println("###### Imprimindo o List #########");
		System.out.println("");
		
		Integer indexDvdHp = null;
		
		for (int i = 0; i < produtosList.size(); i++) {
			if (dvdHP.equals(produtosList.get(i))) {
				indexDvdHp = i;
			}
		}
		
		System.out.println("");
		System.out.println("###### Imprimindo o Mapa #########");
		System.out.println("");
		
		System.out.println(produtosMap);
		
		Dvd dvdHP2 = new Dvd("65644");
		dvdHP.setNome("Harry Potter e o prisioneiro");
		dvdHP.setDuracao(2.30);
		dvdHP.setPreco(30.75);
		
		if (indexDvdHp != null) {
			produtosList.set(indexDvdHp, dvdHP2);
		}
		
		produtosList.clear();
		
		buscaPosicao(livroHP, produtos);
		buscaPosicao(livroHP1, produtos);
		buscaPosicao(livroHP2, produtos);
	}

	public static void buscaPosicao(Produto produto, Produto[] produtos) {
		Integer index = null;
		for (int i = 0; i < produtos.length; i++) {
			Produto produtoArray = produtos[i];
			if (produto.equals(produtoArray) && index == null) {
				index = i;
			}
		}
		if (index == null) {
			System.out.println("Produto não encontrado");
		} else {
			System.out.println("O produto está no indice: " + index);
		}
	}
	
}
