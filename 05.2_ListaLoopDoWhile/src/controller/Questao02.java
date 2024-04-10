package controller;

import util.Teclado;

public class Questao02 {
	public static void main(String[] args) {
		
		int i = 0, outSoma = 0;
		System.out.println("SOMA DOS NÚMEROS PARES");
		System.out.println("Início: " + i);
		int inLimite = Teclado.lerInt("Número Limite:");
		
		do {
			outSoma += i;
			i +=2 ;
		} while (i <= inLimite);
		
		System.out.println("SOMATÓRIO: " + outSoma);
		
	}
}
