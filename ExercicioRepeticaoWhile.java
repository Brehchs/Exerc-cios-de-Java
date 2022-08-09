/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 10
pessoas, calcule e mostre: (WHILE)
número de pessoas calmas;
número de mulheres nervosas;
número de homens agressivos;
número de outros calmos;
número de pessoas nervosas com mais de 40 anos;
número de pessoas calmas com menos de 18 anos.*/

package Familia57;

import java.util.Scanner;

public class ExercicioRepeticaoWhile {

	public static void main(String[] args) {
		
int idade,genero,fatorPsico,pessoasCalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,nervosaMais40=0,calmasMenos18=0,p=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<=10) {
			
			System.out.println("Levantamento Psicoemocional");
			System.out.println("\nQual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println("\nQual gênero você se identifica?\n1-Feminino\n2-Masculino\n3-Outros ");
			genero = leia.nextInt();
			System.out.println("\nVocê se considera na maior parte do tempo?\n1- Calmo\n2-NervosO\n3-AgressivO");
			fatorPsico = leia.nextInt();
			
			if(fatorPsico==1) {
				pessoasCalmas++;
			}
			
			if(genero == 1 && fatorPsico == 2) {
				mulheresNervosas++;
			}
			
			if(genero == 2 && fatorPsico == 3) {
				homensAgressivos++;
			}
			
			if(genero == 3 && fatorPsico == 1) {
				outrosCalmos++;
			}
			
			if(fatorPsico == 2 && idade>40) {
				nervosaMais40++;
			}
			
			if(fatorPsico == 1 && idade <18) {
				calmasMenos18++;
			}
			p++;
		}
		
		System.out.println("\nQuantidade de pessoas calmas: "+pessoasCalmas);
		System.out.println("Quantidade de mulheres nervosas: "+mulheresNervosas);
		System.out.println("Quantidade de homens agressivos: "+homensAgressivos);
		System.out.println("Quantidade de outros calmos: "+outrosCalmos);
		System.out.println("Quantidade de pessoas nervosas com mais de 40 anos: "+nervosaMais40);
		System.out.println("Quantidade de pessoas calmas com menos de 18 anos: "+calmasMenos18);

	}

}
