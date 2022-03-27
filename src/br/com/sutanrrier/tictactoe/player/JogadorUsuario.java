package br.com.sutanrrier.tictactoe.player;

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

	//Fun��es
	public void fazerJogada(String jogada) {
		System.out.println("Jogada na posi��o " + jogada + " feita!");
	}

}
