package br.com.sutanrrier.tictactoe.main;

import br.com.sutanrrier.tictactoe.controllers.ControladorDoJogo;

public class TicTacToe {

	public static void main(String[] args) {
		ControladorDoJogo jogo = new ControladorDoJogo();
		
		boolean is_game_on = true;
		
		jogo.iniciarJogo();
		while(is_game_on) {
				jogo.novoTurno();
		}
	}
	
}
