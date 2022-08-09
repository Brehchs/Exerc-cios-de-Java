/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package Familia57;

import java.util.Scanner;

public class ExercicioRepeticaoDoWhile {

	public static void main(String[] args) {

		float media;
		int numero,somaMultiplo3=0,contMultiplo3=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Média dos números múltiplos de 3");
			System.out.println("Para sair digite o número 0");
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero==0) {
				System.out.println("\nFim!");
			}
			else
			{
				if(numero % 3 == 0) {
					somaMultiplo3 += numero;
					contMultiplo3++;
				}
			}
			
		}
		while(numero!=0);
		if(contMultiplo3 == 0) {
			System.out.println("\nNão é possível dividir um número por zero!!!");
		}
		else
		{
		media = somaMultiplo3 / contMultiplo3;
		System.out.println("\nA média dos números múltiplos de 3 é de: "+media);
		}

	}



	
	}
	


