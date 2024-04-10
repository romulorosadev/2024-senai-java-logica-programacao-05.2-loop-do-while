package controller;

import util.Teclado;

public class Questao03 {
	public static void main(String[] args) {
		
		int i = 0, outSoma = 0;
		System.out.println("SOMA DOS 5 PRIMEIROS INTEIROS");
		System.out.println("Início: " + i);
		int inLimite = Teclado.lerInt("Número Limite:");
		
		do {
			outSoma += i;
			i++;
		} while (i <= inLimite-1);
		
		System.out.println("SOMATÓRIO: " + outSoma);
		
	}
}
