package br.com.sutanrrier.tictactoe.main;

import java.util.Scanner;

import br.com.sutanrrier.tictactoe.controllers.ControladorDoJogo;

public class TicTacToe {

	public static void main(String[] args) {
		ControladorDoJogo jogo = new ControladorDoJogo();
		Scanner sc = new Scanner(System.in);
		boolean is_game_on = true;

		while (is_game_on) {
				System.out.print("Você deseja iniciar uma nova partida? ('S' para sim e 'N' para não): ");
				char option = sc.next().toUpperCase().charAt(0);
				if (option == 'S') {
					jogo.iniciarJogo();
				} 
				if (option == 'N') {
					is_game_on = false;
				}
		}
		sc.close();
	}

}
