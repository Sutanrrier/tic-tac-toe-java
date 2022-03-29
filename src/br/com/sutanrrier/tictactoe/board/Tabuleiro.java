package br.com.sutanrrier.tictactoe.board;

import br.com.sutanrrier.tictactoe.interfaces.Jogador;

public class Tabuleiro {
	private int x = 3, y = 3;
	private String[][] tabuleiro;

	public void criarTabuleiro() {
		tabuleiro = new String[x][y];
	}

	public void mostrarTabuleiro() {
		System.out.println("   A  B  C ");
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == null) {
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

	public boolean isGameOver(Jogador jogador) {
		int check_win = 0;
		// Diagonal ->->->
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][i] == jogador.getTipo() && tabuleiro[i][i] != null) {
				check_win++;
				if (check_win == 3) {
					return true;
				}
			}
		}

		check_win = 0;
		// Diagonal <-<-<-
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = tabuleiro.length-1; j >= 0; j--) {
				if (tabuleiro[i][j] == jogador.getTipo() && tabuleiro[i][j] != null) {
					check_win++;
					if (check_win == 3) {
						return true;
					}
				}
				i++;
			}
		}
		
		check_win = 0;
		//Vitória por linha preenchida
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == jogador.getTipo() && tabuleiro[i][i] != null) {
					check_win++;
					if (check_win == 3) {
						return true;
					}
				}
			}
			check_win = 0;
		}
		
		check_win = 0;
		//Vitória por coluna preenchida
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[j][i] == jogador.getTipo() && tabuleiro[i][i] != null) {
					check_win++;
					if (check_win == 3) {
						return true;
					}
				}
			}
			check_win = 0;
		}
		return false;
	}
	
	public boolean isBoardFull() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if(tabuleiro[i][j] == null) {
					return false;
				}
			}
		}
		return true;
	}
}