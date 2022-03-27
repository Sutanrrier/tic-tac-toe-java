package br.com.sutanrrier.tictactoe.main;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;
import br.com.sutanrrier.tictactoe.player.JogadorComputador;
import br.com.sutanrrier.tictactoe.player.JogadorUsuario;

public class TicTacToe {

	public static void main(String[] args) {
		//Apenas testes
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.criarTabuleiro();
		tabuleiro.mostrarTabuleiro();
		
		JogadorUsuario usuario = new JogadorUsuario("X");
		JogadorComputador computador = new JogadorComputador("O");
		
		usuario.fazerJogada();
		computador.fazerJogada();
	}

}
