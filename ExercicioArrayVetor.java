/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package Familia57;

import java.util.Scanner;

public class ExercicioArrayVetor {

	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		float somaPar=0,qntImpar=0;
		int x,num;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=0;x<6;x++) {

			System.out.println("Digite um número: ");
			num = leia.nextInt();
			numeros[x] = num;
								
				if(numeros[x] % 2 == 0) 
				{
					somaPar += numeros[x];
				}
				else if(numeros[x] % 2 == 1) {
					qntImpar++;
				}
		}
		System.out.println("\nSoma dos números pares digitados: "+somaPar);
		System.out.println("Números pares digitados: ");
			for(x=0;x<6;x++) {
			if(numeros[x] % 2 == 0) {
				System.out.print(numeros[x]+" , ");
			}
		}
		System.out.println("\nQuantidade dos números ímpares digitados: "+qntImpar);
		System.out.println("Números ímpares digitados: ");
				
		for(x=0;x<6;x++) {
			if(numeros[x] % 2 == 1) {
				System.out.print(numeros[x]+" , ");
			}
		}
		
	}
}
		
		
	

		
			
	

			
	