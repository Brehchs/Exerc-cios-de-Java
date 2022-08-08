/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
D= R+S/2 , onde R = (A+B)² e S = (B + C)² */


package Familia57;

import java.util.Scanner;

public class IntroducaoJavaEx4 {

	public static void main(String[] args) {
		
		int A,B,C,somaA,somaB;
		double R,S,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("D = R+S/2 --> (R=A+B² e S=B+C²)");
		System.out.println("Vou descobrir o valor de D!");
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		B = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		C = leia.nextInt();
	
		somaA = (A+B);
		R = Math.pow(somaA,2);
		
		somaB = (B+C);
		S = Math.pow(somaB,2);
		
		D = (R+S)/2;
		
		System.out.printf("O valor de D é: %.2f",D);
	
		
		
		

	}

}
