package capitulo08;

/**
 * 3 - Com base na imagem do gráfico abaixo, 
 * implemente um array para armazenar a localização dos pontos do gráfico abaixo.
 * Ao final, percorra esse array e liste todos os pontos do gráfico.
 * 
 * @author André Felipe Bürger (andre@iburger.com.br)
 *
 */
public class Exercicio08_03 {
	
	public static void main(String[] args) {
		
		int[][] pontosGrafico = new int[8][17];
		
		pontosGrafico[2][3] = 1;
		pontosGrafico[4][4] = 2;
		pontosGrafico[5][5] = 3;
		pontosGrafico[5][6] = 4;
		pontosGrafico[4][7] = 5;
		pontosGrafico[2][8] = 6;
		pontosGrafico[1][9] = 7;
		pontosGrafico[1][10] = 8;
		pontosGrafico[2][11] = 9;
		pontosGrafico[3][12] = 10;
		pontosGrafico[3][13] = 11;
		pontosGrafico[4][14] = 12;
		pontosGrafico[5][15] = 13;
		pontosGrafico[7][16] = 14;
		
		for (int y = 0; y < pontosGrafico.length; y++) {
			int[] arrayLinha = pontosGrafico[y];
			for (int x = 0; x < arrayLinha.length; x++) {
				int valorPosicao = pontosGrafico[y][x];
				
				if (valorPosicao != 0) {
					System.out.println("O ponto " + valorPosicao + " está localizado na posição y = " + y + ", x = " + x);
				}
			}
		}
	}
}
