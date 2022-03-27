package br.com.sutanrrier.tictactoe.player;

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
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Funções
	public void fazerJogada(Tabuleiro tabuleiro, char jogada_x, int jogada_y) {
		final int A = 0, B = 1, C = 2;
		if(jogada_x == 'A') {
			tabuleiro.colocarPeca(A, jogada_y - 1, tipo);
		}
		else if(jogada_x == 'B'){
			tabuleiro.colocarPeca(B, jogada_y - 1, tipo);
		}
		else if(jogada_x == 'C') {
			tabuleiro.colocarPeca(C, jogada_y - 1, tipo);
		}
		
	}

}
