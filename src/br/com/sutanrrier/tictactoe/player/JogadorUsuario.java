package br.com.sutanrrier.tictactoe.player;

import java.util.InputMismatchException;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;
import br.com.sutanrrier.tictactoe.interfaces.Jogador;

public class JogadorUsuario implements Jogador{
	private String tipo;
	
	//Construtor
	public JogadorUsuario(String tipo) {
		this.tipo = tipo;
	}
	
	//Getters e Setters
	public String getTipo() {
		return tipo;
	}

	//Funções
	public void fazerJogada(Tabuleiro tabuleiro, char jogada_x, int jogada_y) {
		final int A = 0, B = 1, C = 2;
		if(jogada_x == 'A') {
			if (tabuleiro.isNullPosition(A, jogada_y - 1)) {
				tabuleiro.colocarPeca(A, jogada_y - 1, tipo);
			}
			else {
				throw new InputMismatchException();
			}
		}
		else if(jogada_x == 'B'){
			if (tabuleiro.isNullPosition(B, jogada_y - 1)) {
				tabuleiro.colocarPeca(B, jogada_y - 1, tipo);
			}
			else {
				throw new InputMismatchException();
			}
		}
		else if(jogada_x == 'C') {
			if (tabuleiro.isNullPosition(C, jogada_y - 1)) {
				tabuleiro.colocarPeca(C, jogada_y - 1, tipo);
			}
			else {
				throw new InputMismatchException();
			}
		}
		else {
			throw new InputMismatchException();
		}
	}

}
