package br.com.sutanrrier.tictactoe.controllers;

import java.util.Random;
import java.util.Scanner;

import br.com.sutanrrier.tictactoe.board.Tabuleiro;
import br.com.sutanrrier.tictactoe.player.JogadorComputador;
import br.com.sutanrrier.tictactoe.player.JogadorUsuario;

public class ControladorDoJogo {
	private JogadorUsuario usuario;
	private JogadorComputador computador;
	private Tabuleiro tabuleiro;
	private Scanner sc = new Scanner(System.in);
	
	public void iniciarJogo() {
		tabuleiro = new Tabuleiro();
		tabuleiro.criarTabuleiro();
		definirTipoJogadores();
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
	
	public void novoTurno() {
		System.out.print("\n");
		tabuleiro.mostrarTabuleiro();
		informacoesJogadores();
		System.out.println("\n---SEU TURNO ---\n");
		System.out.print("Digite a posição em que deseja: ");
		String jogada = sc.nextLine();
		//testes
		usuario.fazerJogada(jogada);
		computador.fazerJogada(jogada);
	}
	
	public void informacoesJogadores() {
		System.out.println("\nUsuário: " + usuario.getTipo());
		System.out.println("Computador: " + computador.getTipo());
	}
	
}
