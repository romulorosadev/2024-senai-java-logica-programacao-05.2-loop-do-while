package controller;

import util.Teclado;

public class Questao01 {
	public static void main(String[] args) {
		
		int i = 100;
		System.out.println("NÚMEROS PARES");
		System.out.println("Início: " + i);
		int inLimite = Teclado.lerInt("\nInforme um número de limite:");
		
		do {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= inLimite);
		
	}
}
