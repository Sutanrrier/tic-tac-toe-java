package br.com.sutanrrier.tictactoe.controllers;

import java.util.InputMismatchException;
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
	private Random aleatorio = new Random();
	
	public void iniciarJogo() {
		tabuleiro = new Tabuleiro();
		tabuleiro.criarTabuleiro();
		definirTipoJogadores();
	}

	public void definirTipoJogadores() {
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
		exibirInformacoesJogadores();
		
		try {
			System.out.println("\n---SEU TURNO ---");
			System.out.print("Digite a posição em que deseja (Ex: a 1): ");
			char jogada_x = sc.next().toUpperCase().charAt(0);
			int jogada_y = sc.nextInt();
			usuario.fazerJogada(tabuleiro, jogada_x, jogada_y);
			computador.fazerJogada(tabuleiro, jogada_x, jogada_y);
		}
		catch (InputMismatchException e) {
			System.out.println("Jogada inválida");
			novoTurno();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Jogada inválida. Não existe essa posição no tabuleiro.");
			novoTurno();
		}

	}
	
	public void exibirInformacoesJogadores() {
		System.out.println("\nUsuário: " + usuario.getTipo());
		System.out.println("Computador: " + computador.getTipo());
	}
	
}
