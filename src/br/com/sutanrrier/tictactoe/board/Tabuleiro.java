package br.com.sutanrrier.tictactoe.board;

public class Tabuleiro {
	private int x = 3, y = 3;
	private String[][] tabuleiro;
	
	public void criarTabuleiro() {
		tabuleiro = new String[x][y];
	}
	
	public void mostrarTabuleiro() {
		System.out.println("   A  B  C ");
		for(int i=0;i<tabuleiro.length;i++) {
			System.out.print((i+1) + " ");
			for(int j=0; j<tabuleiro[i].length; j++) {
				if(tabuleiro[i][j] == null) {
					System.out.print(" - ");
				}
				else {
					System.out.print(" " + tabuleiro[i][j] + " ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public void colocarPeca(int pos_x, int pos_y, String tipo_peca) {
		tabuleiro[pos_y][pos_x] = tipo_peca;
	}
	
	public boolean isNullPosition(int pos_x, int pos_y) {
		return (tabuleiro[pos_y][pos_x] == null) ? true : false;
	}
}
