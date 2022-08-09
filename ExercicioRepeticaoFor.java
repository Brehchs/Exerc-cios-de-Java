/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package Familia57;

import java.util.Scanner;

public class ExercicioRepeticaoFor {

	public static void main(String[] args) {
		
		int num,par=0,impar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
	
		if(num % 2 == 0) {
			par++;
		}
		else {
			impar++;
	}
		
		}
		System.out.println("\nQuantidade de números pares: "+par);
		System.out.println("Quantidade de números ímpares: "+impar);
	}
}
		
		