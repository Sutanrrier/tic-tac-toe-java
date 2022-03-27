package br.com.sutanrrier.tictactoe.controllers;

import java.util.Random;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;
import br.com.sutanrrier.tictactoe.player.JogadorComputador;
import br.com.sutanrrier.tictactoe.player.JogadorUsuario;

public class ControladorDoJogo {
	private JogadorUsuario usuario;
	private JogadorComputador computador;
	private Tabuleiro tabuleiro;
	
	public void iniciarJogo() {
		tabuleiro = new Tabuleiro();
		tabuleiro.criarTabuleiro();
		tabuleiro.mostrarTabuleiro();
		definirTipoJogadores();
		System.out.println("Usuario: " + usuario.getTipo());
		System.out.println("Computador: " + computador.getTipo());
	}

	public void definirTipoJogadores() {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(2);
		
		if(numeroAleatorio < 1) {
			usuario = new JogadorUsuario("X");
			computador = new JogadorComputador("O");
		}
		else {
			usuario = new JogadorUsuario("O");
			computador = new JogadorComputador("X");
		}
	}
	
}
