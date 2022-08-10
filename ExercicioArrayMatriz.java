//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Familia57;

import java.util.Scanner;

public class ExercicioArrayMatriz {

	public static void main(String[] args) {
	 int[][]valores=new int[3][3];
	 int quantMaior=0,i,j;
	 
	 Scanner leia = new Scanner(System.in);
	 
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 System.out.println("Digite um número: ");
			 valores[i][j]=leia.nextInt();

			 	if(valores[i][j]>10) 
			 	{
				 quantMaior++;
				
			 	}
		 }
	 }
	 System.out.print("\nOs número maiores que 10 são: ");
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 if(valores[i][j]>10) {
				 System.out.print(valores[i][j]+" , ");
			 }
		 }
		 
	 }
	 
	
	 System.out.println("\nQuantidade de números maior que 10: "+quantMaior);

	}

}
