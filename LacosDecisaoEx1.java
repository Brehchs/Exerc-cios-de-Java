//1 - Faça um programa que receba três inteiros e diga qual deles é o maior.//
package Familia57;

import java.util.Scanner;

public class LacosDecisaoEx1 {


	public static void main(String[] args) {
		int numA,numB,numC;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		numA = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		numB = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		numC = leia.nextInt();
		
		if(numA>numB && numA>numC) {
			System.out.println("\nO maior número é o A: "+numA);
		}
		else if(numB>numA && numB>numC) {
			System.out.println("\nO maior número é o B: "+numB);
		}
		else{
			System.out.println("\nO maior número é o C: "+numC);
		}
		
	}

}
