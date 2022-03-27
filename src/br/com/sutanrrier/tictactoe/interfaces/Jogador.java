package br.com.sutanrrier.tictactoe.interfaces;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;

public interface Jogador {
	
	public abstract void fazerJogada(Tabuleiro tabuleiro, char jogada_x, int jogada_y);
	
}
