/*3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

package Familia57;

import java.util.Scanner;

public class LacosDecisaoEx3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Vamos ver em que fase da vida você está?");
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<10) {
			System.out.println("\nIdade Inferior!");
		}
		if(idade>=10 && idade<=14) {
			System.out.println("\nIdade:"+idade+" = Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("\nIdade:"+idade+" = Juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("\nIdade:"+idade+" = Adulto");
		}
		else if(idade>25) {
			System.out.println("\nIdade Superior!");
		}
	}

}
