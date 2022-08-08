//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 


package Familia57;

import java.util.Scanner;

public class IntroducaoJavaEx1 {

	public static void main(String[] args) {
		
		int anos,meses,dias,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Vamos descobrir quantos dias de vida você já tem?");
		System.out.println("Escreva quantos anos você tem: ");
		anos = leia.nextInt();
		System.out.println("\nEscreva quantos meses se passaram depois do seu aniverário: ");
		meses = leia.nextInt();
		System.out.println("\nEscreva quantos dias a mais: ");
		dias = leia.nextInt();
		
		
		soma = (anos * 365) + (meses * 30) + (dias);
		
		System.out.println("\nUAU!! Você já tem: "+soma+" dias de vida!");
	}

}
