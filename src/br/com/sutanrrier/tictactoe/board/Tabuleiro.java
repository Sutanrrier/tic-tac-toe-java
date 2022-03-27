package br.com.sutanrrier.tictactoe.board;

public class Tabuleiro {
	private int x = 3, y = 3;
	private String[][] tabuleiro;
	
	public void criarTabuleiro() {
		tabuleiro = new String[x][y];
	}
	
	public void mostrarTabuleiro() {
		for(int i=0;i<tabuleiro.length;i++) {
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
}
