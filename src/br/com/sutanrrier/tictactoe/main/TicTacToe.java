package br.com.sutanrrier.tictactoe.main;

import br.com.sutanrrier.tictactoe.controllers.ControladorDoJogo;

public class TicTacToe {

	public static void main(String[] args) {
		ControladorDoJogo jogo = new ControladorDoJogo();
		
		jogo.iniciarJogo();
		jogo.novoTurno();
	}
	
}
