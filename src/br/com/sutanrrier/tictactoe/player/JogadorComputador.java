package br.com.sutanrrier.tictactoe.player;

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

	//Funções
	public void fazerJogada(Tabuleiro tabuleiro, char jogada_x, int jogada_y) {
		System.out.println("Jogada na posição do Computador feita!");
		
	}

}
