package br.com.sutanrrier.tictactoe.main;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;

public class TicTacToe {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.criarTabuleiro();
		tabuleiro.mostrarTabuleiro();

	}

}
