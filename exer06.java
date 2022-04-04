package br.com.generation.Atividades2;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numb, i=0, soma = 0;
		double  mediaM =0.0;
		
		
		do {
			System.out.println("Digite um número ");
		     numb =(int) leia.nextDouble();
			
			if(numb % 3 == 0 && numb != 0) {
				soma = soma + numb;
				i++;
			}
			
		}while(numb != 0);
		mediaM = soma / i;
		System.out.println(mediaM);
		
		leia.close();

	}

}
