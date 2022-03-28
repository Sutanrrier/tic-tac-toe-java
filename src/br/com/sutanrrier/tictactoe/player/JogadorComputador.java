package br.com.sutanrrier.tictactoe.player;

import java.util.Random;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;
import br.com.sutanrrier.tictactoe.interfaces.Jogador;

public class JogadorComputador implements Jogador{
	private String tipo;
	
	//Construtor
	public JogadorComputador(String tipo) {
		this.tipo = tipo;
	}
	
	//Getters e Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Fun��es
	public void fazerJogada(Tabuleiro tabuleiro, char jogada_x, int jogada_y) {
		Random aleatorio = new Random();
		int pos_x = aleatorio.nextInt(3);
		int pos_y = aleatorio.nextInt(3);
		tabuleiro.colocarPeca(pos_x, pos_y, tipo);
		
	}

}
